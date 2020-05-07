package part;

public class HelloWorld {

	public static void main(String[] args) {
		//basics
		System.out.println("Hello World");
		
		//Data Types
		displayNumericDataTypes();
		displayBooleans();
		displayCharacters();
		practice();
	}
	
	public static void displayNumericDataTypes() {
		byte minByteValue = Byte.MIN_VALUE;
		byte maxByteValue = Byte.MAX_VALUE;
		System.out.println("Min Byte: " + minByteValue);
		System.out.println("Max Byte: " + maxByteValue);
		
		short minShortValue = Short.MIN_VALUE;
		short maxShortValue = Short.MAX_VALUE;
		System.out.println("Min Short: " + minShortValue);
		System.out.println("Max Short: " + maxShortValue);
		
		int minIntValue = Integer.MIN_VALUE;
		int maxIntValue = Integer.MAX_VALUE;
		System.out.println("Min Int: " + minIntValue);
		System.out.println("Max Int: " + maxIntValue);

		long minLongValue = Long.MIN_VALUE;
		long maxLongValue = Long.MAX_VALUE;
		System.out.println("Min Long: " + minLongValue);
		System.out.println("Max Long: " + maxLongValue);
		
		float minFloatValue = Float.MIN_VALUE;
		float maxFloatValue = Float.MAX_VALUE;
		System.out.println("Min Float: " + minFloatValue);
		System.out.println("Max Float: " + maxFloatValue);
		
		double minDoubleValue = Double.MIN_VALUE;
		double maxDoubleValue = Double.MAX_VALUE;
		System.out.println("Min Double: " + minDoubleValue);
		System.out.println("Max Double: " + maxDoubleValue);
		
		//quick tip for readability
		int hugeNumber1 = 281828373;
		int hugeNumber2 = 281_828_373;
		//notice the second number is easier to read for developers.
		System.out.println("Huge Number: " + hugeNumber1);
		System.out.println("Huge Number: " + hugeNumber2);
		//run the code and notice that this doesnt affect how users view it.
		
		
		/*
		 * Most preferred data types?
		 * 
		 * Integer - is best for whole values
		 * Double  - is best for floating pointer values
		 * 
		 * */
	}
	
	public static void displayBooleans() {
		boolean isValid = true;
		boolean isNotValid;
		if(isValid) {
			isNotValid = false;
		} else {
			isNotValid = true;
		}
		System.out.println("Boolean (isValid): " + isValid);
		System.out.println("Boolean (isNotValid): " + isNotValid);
	}
	
	public static void displayCharacters() {
		char letter = 'a';
		char letter2 = 'b';
		char letter3 = 'c';
		char unicode = '\u00A9';
		System.out.println("Char Unicode: " + unicode);
		
		int collection = letter + letter2 + letter3;
		System.out.println("Char Number: " + collection);
	
		String collectionStr = "" + letter + letter2 + letter3;
		System.out.println("Char Letter: " + collectionStr);
		
		char[] collectionArr = collectionStr.toCharArray();
		for(char index: collectionArr) {
			System.out.println("Char Array Letter: " + index);			
		}
		System.out.println("Char Array Length: " + collectionArr.length);
	}
	
	public static void practice() {
		byte numberByte = 125;
		short numberShort = 32_000;
		int numberInt = 1_288_723_283;
//		long numberLong = 3_882_719_293L;
		
		long sum = 50000 + 10 * (long)(numberByte + numberShort + numberInt);
		System.out.println("\nSum: " + sum);
	}
}
