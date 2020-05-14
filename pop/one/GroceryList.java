package pop.one;

import java.util.ArrayList;

public class GroceryList {

	static ArrayList<String> groceryList = new ArrayList<String>();
	
	public static void main(String[] args) {
		addItem("Milk");
		addItem("Bread");
		addItem("Lettuce");
		addItem("Tomato");
		removeItem(2);
		printList();
	}
	
	public static void addItem(String item) {
		System.out.println("You are adding " + item + " to the shopping list.");
		groceryList.add(item);
	}
	
	public static void removeItem(int itemPosition) {
		String item = groceryList.get(itemPosition);
		System.out.println("You are removing item: " + item);
		groceryList.remove(itemPosition);
	}
	
	public static void printList() {
		int count = 1;
		System.out.println("\nThe shopping list\n~~~~~~~~~~~~~~~~~");
		for(String item : groceryList) {
			System.out.println("#" + count + " " + item);
			count++;
		}
	}
	
	public static void printListTwo() {
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.println(groceryList.get(i));
		}
	}
}
