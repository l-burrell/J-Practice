package part;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		checkMinMax();
	}
	
	public static void checkMinMax() {
		//print the min and max number the user enters
		Scanner scan = new Scanner(System.in);
		System.out.print("Exit using a non-numeric value.\n#1 Enter number: ");
		int num = 0;
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		int counter = 1;
		while(scan.hasNextInt()) {
			num = scan.nextInt();
			if (num > max) max = num;
			if (num < min) min = num;
			System.out.print("#"+ (counter + 1) + " Enter number: ");
			counter++;
		}
		System.out.printf("\nMin number was: %d\nMax number was: %d\n", min, max);
	}
}
