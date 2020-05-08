package part;

public class FindSum {

	public static void main(String[] args) {
		calcSum(500);
	}
	
	public static void calcSum(int maxRange) {
		//sum the numbers that can be divided by both 3 and 5.
		//break loop once 5 terms are found or reach maxRange.
		int count = 0;
		int sum = 0;
		for(int i = 1; i <= maxRange; i++) {
			if(i % 5 == 0 && i % 3 == 0) {
				count++;
				sum += i;
				System.out.print(i + " ");
			}
			if(count == 5) {
				break;
			}
		}
		System.out.println("\nThe sum was: " + sum);
	}
}
