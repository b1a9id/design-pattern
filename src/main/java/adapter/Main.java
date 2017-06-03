package adapter;

import adapter.Inheritance.Print;
import adapter.Inheritance.PrintBanner;

public class Main {
	public static void main(String[] args) {
		Print print = new PrintBanner("Hello World!");
		print.printWeek();
		print.printStrong();
	}
}
