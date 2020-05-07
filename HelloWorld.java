package part;

public class HelloWorld {

	public static void main(String[] args) {
		//basics
		System.out.println("Hello World");
		
		//Data Types
		displayNumericDataTypes();
		displayBooleans();
		displayCharacters();
	}
	
	public static void displayNumericDataTypes() {
		byte minByteValue = Byte.MIN_VALUE;
		byte maxByteValue = Byte.MAX_VALUE;
		System.out.println("Min Byte: " +minByteValue);
		System.out.println("Max Byte: " +maxByteValue);
		
		short minShortValue = Short.MIN_VALUE;
		short maxShortValue = Short.MAX_VALUE;
		System.out.println("Min Short: " +minShortValue);
		System.out.println("Max Short: " +maxShortValue);
		
		int minIntValue = Integer.MIN_VALUE;
		int maxIntValue = Integer.MAX_VALUE;
		System.out.println("Min Int: " +minIntValue);
		System.out.println("Max Int: " +maxIntValue);

		long minLongValue = Long.MIN_VALUE;
		long maxLongValue = Long.MAX_VALUE;
		System.out.println("Min Long: " +minLongValue);
		System.out.println("Max Long: " +maxLongValue);
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
}
