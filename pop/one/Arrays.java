package pop.one;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		System.out.println("\nArray 1: ");
		int[] num = new int[5];
		num[0] = 23;
		num[1] = 4543;
		num[2] = 392;
		num[4] = 544;
		printArray(num);
		System.out.println("The sum of this array is: " + sumArrayValues(num));
		
		System.out.println("\nArray 2: ");
		char[] anotherArr = {'A', 'c', 'h'};
		printArray(anotherArr);
		
		printArray(getInput(4));
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("position " + i + " is int value: " + array[i]);
		}
	}
	
	public static void printArray(char[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("position " + i + " is char value: " + array[i]);
		}
	}
	
	public static int[] getInput(int num) {
		System.out.println("\nPlease insert " + num + " integer values: ");
		Scanner scan = new Scanner(System.in);
		int[] array = new int[num];
		for(int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		return array;
	}
	
	public static int sumArrayValues(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static void resizeArray(int[] array, int size) {
		int[] newArray = array;
		array = new int[size];
		if(array.length < size) {		
			for(int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
		}
	}
}
