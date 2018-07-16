package proxy;

import java.util.Objects;

public class PrinterProxy implements Printable {

	private String name;
	private String className;
	private Printable real;

	public PrinterProxy(String name, String className) {
		this.name = name;
		this.className = className;
	}

	public synchronized void setPrinterName(String name) {
		if (Objects.nonNull(real)) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	public String getPrinterName() {
		return this.name;
	}

	public void print(String string) {
		realize();
		real.setPrinterName(this.name);
		real.print(string);
	}

	private synchronized void realize() {
		if (Objects.isNull(real)) {
			try {
				real = (Printable) Class.forName(this.className).newInstance();
			} catch (ClassNotFoundException e) {
				System.err.println("クラス " + className + " が見つかりません。");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
