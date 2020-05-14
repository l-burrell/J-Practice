package com.printer;

public class Main {

	public static void main(String[] args) {
		Printer test = new Printer();
		test.print(30);
		
		Printer test2 = new Printer(true);
		test2.fillToner();
		test2.print(55);
	}
}
