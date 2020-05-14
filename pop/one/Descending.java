package pop.one;

import java.util.Scanner;

public class Descending {

	public static void main(String[] args) {
		//decending means highest to lowest
		int[] num = {131, 52, 422, 13, 31 ,4, 41};
		
		System.out.println("Please enter 3 integers: ");
		int[] ordered = decendingOrder(getUserArray(3));
		System.out.println("The array in decending order is: ");
		printArray(ordered);
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
}
