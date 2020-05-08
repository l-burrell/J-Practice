package part;

import java.util.Scanner;

public class StringNumbers {

	public static void main(String[] args) {
	
		//parsing
		String numberAsString = "2384032";
		System.out.println("number as a stirng: " + numberAsString);
		int num = Integer.parseInt(numberAsString);
		System.out.println(numberAsString + " plus one is " + (num+1));
		
		//scanning input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.next();
		System.out.println("You entered " + word);
		
		printSum();
	}
	
	public static void printSum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter numbers: ");
		int num = scan.nextInt();
		int sum = 0;
		while(scan.hasNextInt()) {
			sum += num;
			num = scan.nextInt();
		}
		System.out.println("The sum was " + sum);
	}
}
