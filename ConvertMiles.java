package part;

public class ConvertMiles {

	public static void main(String[] args) {
		CalculateMilesPerHour(514);
	}
	
	public static long CalculateMilesPerHour(double kilometersPerHour) {
		long miles = -1;
		if(kilometersPerHour >= 0) {
			miles = Math.round(kilometersPerHour * 0.62137);
			printConversion(kilometersPerHour, miles);
		}
		return miles;
	}
	
	public static void printConversion(double kilometersPerHour, long miles) {
		System.out.println(kilometersPerHour + " km/h was equal to about " + miles + " mph.");		
	}
}
