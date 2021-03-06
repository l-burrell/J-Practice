package pop.one;

import java.util.Scanner;

public class Descending {

	public static void main(String[] args) {
		//decending means highest to lowest
		int[] num = {131, 52, 422, 13, 31, 4, 41};
		int[] num2 = {5, 64, 2, 53, 431, 3};
		
		System.out.println("Please enter 3 integers: ");
		int[] ordered = decendingOrder(getUserArray(3));
		System.out.println("The array in decending order is: ");
		printArray(ordered);
		
		System.out.println("The min value was: " + findMin(num));
		reverseNoChange(num);
		reverseWithChange(num);
		reverseWithChange(num2);
	}
	
	public static void printArray(int[] array) {
		for(int num : array) {
			System.out.print(num + ", ");
		}
	}
	
	public static int[] decendingOrder(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if((i+1) != array.length) {
				if(array[i] < array[i+1]) {
					int temp = array[i];
					array[1] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] getUserArray(int num) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[num];
		for(int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		return array;
	}
	
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static void reverseNoChange(int[] array) {
		System.out.println("The array in reverse is: ");
		for(int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + ", ");
		}
	}
	
	public static void reverseWithChange(int[] array) {
		//this method will change the actual array.
		System.out.println("\n");
		int mid = (int)Math.floor(array.length / 2);
		for(int i = 0; i < mid; i++) {
			int temp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temp;
		}
		for(int num : array) {
			System.out.print(num + ", ");
		}
	}
}
