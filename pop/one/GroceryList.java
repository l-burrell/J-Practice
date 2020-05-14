package pop.one;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

	static ArrayList<String> groceryList = new ArrayList<String>();
	
	public static void main(String[] args) {
//		addItem("Milk");
//		addItem("Bread");
//		addItem("Lettuce");
//		addItem("Tomato");
//		removeItem(2);
//		printList();
//		modifyItem(0, "Butter");
//		printList();
		boolean isRunning = true;
		Scanner scan = new Scanner(System.in);
		String item;
		int pos, select;
		while(isRunning) {
			System.out.println("What would you like to do? ");
			System.out.println("1 = Add Grocery Item");
			System.out.println("2 = Modify Grocery Item");
			System.out.println("3 = Remove Grocery Item");
			System.out.println("4 = Print Grocery List");
			System.out.println("5 = Exit Application");
			select = scan.nextInt();
//			System.out.println("Loading updated shopping list\n~~~~~~~~~~~~~~~~~~");
			switch(select) {
			case 1:
				System.out.println("What would you like to add?");
				item = scan.next();
				addItem(item);
				break;
			case 2:
				System.out.println("What would you like to modify?");
				System.out.println("Select the number of the list item: ");
				pos = scan.nextInt();
				System.out.println("Now enter the name of the new item: ");
				item = scan.next();
				modifyItem(pos,item);
				break;
			case 3:
				System.out.println("What would you like to add?");
				item = scan.next();
				pos = groceryList.indexOf(item);
				removeItem(pos);
				break;
			case 4: 
				printList();
				break;
			case 5:
				isRunning = false;
				System.out.println("This application has shut down.");
				break;
			default:
				break;
			}
		}
	}
	
	public static void addItem(String item) {
		System.out.println("You added " + item + " to the shopping list.\n");
		groceryList.add(item);
	}
	
	public static void removeItem(int itemPosition) {
		String item = groceryList.get(itemPosition);
		System.out.println("You remove " + item + ".\n");
		groceryList.remove(itemPosition);
	}
	
	public static void modifyItem(int position, String newItem) {
		System.out.println("You exchange " + groceryList.get(position) + " for " + newItem + "\n");
		groceryList.set(position, newItem);
		
	}
	
	public static void printList() {
		int count = 1;
		System.out.println("\nThe shopping list\n~~~~~~~~~~~~~~~~~");
		for(String item : groceryList) {
			System.out.println("#" + count + " " + item);
			count++;
		}
		System.out.println();
	}
	
	public static void printListTwo() {
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.println(groceryList.get(i));
		}
	}
	
	public static String findItem(String searchItem) {
		boolean exists = groceryList.contains(searchItem);
		int itemPosition = 0;
		if(exists) {
			itemPosition = groceryList.indexOf(searchItem);
			return groceryList.get(itemPosition);
		}
		return null;
	}
}
