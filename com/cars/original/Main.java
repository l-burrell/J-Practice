package com.cars.original;

public class Main {

	public static void main(String[] args) {
		Car porsche = new Car();
		Car toyota = new Car();
		porsche.setModel("porsche");
		System.out.println("Model is " + porsche.getModel());
	}
	
	public static void testDefaults() {
		//check what default values are for array members.
		int num = 3;
		int[] arrOne = new int[num];
		String[] arrTwo = new String[num];
		System.out.println(arrOne[0]);
		System.out.println(arrTwo[0]);
	}
}
