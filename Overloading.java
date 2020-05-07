package part;

public class Overloading {

	public static void main(String[] args) {
		double v = toCentimeters(6, 0);
		System.out.println("value: " + v);
		double a = toCentimeters(157);
		System.out.println("value: " + a);
	}
	
	public static double toCentimeters(int feet, int inches) {
		if(feet >= 0) {
			if(inches <= 12 && inches >= 0) {
				return (inches + (feet * 12)) * 2.54;
			}
		}
		return -1;
	}
	
	public static double toCentimeters(int inches) {
		if(inches >= 0) {
			int feet = inches / 12;
			return toCentimeters(feet, inches % 12);
		}
		return -1;
	}
}
