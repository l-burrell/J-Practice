package part;

public class SumDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(125)); //expect 1+2+5 = 8
		System.out.println(sumDigits(2713));
		System.out.println(sumDigits(284));		
		System.out.println(sumDigits(284492));		
		System.out.println(sumDigits(638353442));		
	}
	
	public static int sumDigits(int number) {
		//return sum of all digits, x 12 would bbe 1 + 2 = 3
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
}
