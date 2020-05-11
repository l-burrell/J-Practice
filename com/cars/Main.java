package com.cars;

public class Main {

	public static void main(String[] args) {
		Car porche = new Car();
		Car toyota = new Car();
		testDefaults();
	}
	
	public static void testDefaults() {
		int num = 3;
		int[] arrOne = new int[num];
		String[] arrTwo = new String[num];
		System.out.println(arrOne[0]);
		System.out.println(arrTwo[0]);
	}
}
