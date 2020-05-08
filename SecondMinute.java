package part;

public class SecondMinute {
	
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";

	public static void main(String[] args) {
		System.out.println(getDurationString(61, 0));
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945));
	}
	
	public static String getDurationString(int minutes, int seconds) {
		if(minutes >= 0) {
			if(seconds >= 0 && seconds <= 59) {
				int hours = 0;
				if(minutes >= 60) {
					hours = minutes / 60;
					minutes = minutes % 60;
				}
				return hours + "h " + minutes + "m " + seconds + "s ";
			}
		}
		return INVALID_VALUE_MESSAGE;
	}
	
	public static String getDurationString(int seconds) {
		if(seconds >= 0) {
			int minutes = 0;
			if(seconds >= 60) {
				minutes = seconds / 60;
				seconds = seconds % 60;
			}
			return getDurationString(minutes, seconds);
		}
		return INVALID_VALUE_MESSAGE;
	}
}
