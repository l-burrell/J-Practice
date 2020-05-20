package part;

import java.util.ArrayList;

public class ReviewArr {
	
	public static void main(String[] args) {
		String[] arr = new String[2];
		arr[0] = "point";
		
		ArrayList<String> another = new ArrayList<String>();
		another.add("point");
		
		Double p = new Double(33.3);
		double o = 22.2;
		System.out.println("Autoboxing: "+p.doubleValue());
		System.out.println("Unboxing: "+Double.valueOf(o));
	}
}


//create a custom wrapper
class DomWrap{
	
	String name;
	int num;
	
	public DomWrap(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return num;
	}
}