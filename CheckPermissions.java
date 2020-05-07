package part;

public class CheckPermissions {

	public static void main(String[] args) {
		//check if the user has appropriate permissions
		final int USER_LEVEL = 2;
		check(USER_LEVEL);
	}
	
	public static void check(int level) {
		switch(level) {
		case 1: 
			System.out.println("You have permission to ban users.");
			break;
		case 2:
			System.out.println("You have permission to restart the server.");
			break;
		case 3:
			System.out.println("You have permission to add new moderators.");
			break;
		default:
			System.out.println("You are an ordinary user.");
			break;
		}
	}
	
	public static void practice() {
		char value = 'a';
		
		switch(value) {
		case 'A': case 'a':
			System.out.println("You are the first letter in the alphabet.");
			break;
		case 'B': case 'b':
			System.out.println("You are the second letter in the alphabet.");
			break;
		default:
			System.out.println("You are an irrelevant value.");
			break;
		}
	}
}
