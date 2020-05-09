package part;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(125));
		System.out.println(sumDigits(284492));		
		System.out.println(sumDigits(638353442));
		
		sumUserInput(3);
	}
	
	public static int sumDigits(int number) {
		//return sum of all digits, Ex 12 would be 1 + 2 = 3
		int sum = 0;
		if(number < 10) {
			return -1;
		}
		if(number >= 10) {
			while(number >= 10) {
				sum += number % 10;
				number = number / 10;
			}
			sum += number;
		}
		return sum;
	}
	
	public static void sumUserInput(int max) {
		Scanner scan = new Scanner(System.in);  
		System.out.println("\nFind the sum of your number (must be greater than 10). ");
		System.out.println("Please enter " + max + " numbers: ");
		
		int count = 0;
		int[] number = new int[max];
		while(count < max && scan.hasNextInt()) {
			number[count] = scan.nextInt();
			count++;
		}
		for(int i = 0; i < number.length; i++) {
			System.out.println("The sum of " + number[i] + " is: " + sumDigits(number[i]));			
		}
	}
}
