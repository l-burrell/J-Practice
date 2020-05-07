package part;

public class PNZ {

	public static void main(String[] args) {
		
		//determine if the number is positive, negative, or zero
		checkNumber(2828);
		checkNumber(-482);
		checkNumber(Math.abs(-283));
		checkNumber(0);
		checkNumber(9-5);
	}
	
	public static void checkNumber(double num) {
		if(num > 0) {
			System.out.println("The number " + num + " is positive.");
		} else if(num < 0) {
			System.out.println("The number " + num + " is negative.");			
		} else {
			System.out.println("The number " + num + " is equal to zero.");						
		}
	}
}
