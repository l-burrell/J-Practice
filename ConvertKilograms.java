package part;

public class ConvertKilograms {

	public static void main(String[] args) {
		double numOfPounds = 200D;
		
		System.out.println("Pounds to Kilogram: " + poundsToKilogram(numOfPounds));
		System.out.println("Kilogram to Pounds" + kilogramToPound(150));
	}
	
	public static double poundsToKilogram(double pounds) {
		return pounds * 0.45359;
	}
	
	public static double kilogramToPound(double kilograms) {
		return kilograms * 2.2;
	}
}
