package proxy;

public class Main {

	public static void main(String[] args) {
		Printable proxy = new PrinterProxy("Alice");
		System.out.println("名前は現在" + proxy.getPrinterName() + "です");
		proxy.setPrinterName("Bob");
		System.out.println("名前は現在" + proxy.getPrinterName() + "です");
		proxy.print("Hello world.");
	}
}
