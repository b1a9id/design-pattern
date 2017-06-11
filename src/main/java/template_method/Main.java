package template_method;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay display1 = new CharDisplay('H');
		display1.display();

		AbstractDisplay display2 = new StringDisplay("Hello World!");
		display2.display();

		AbstractDisplay display3 = new StringDisplay("こんにちは");
		display3.display();
	}
}
