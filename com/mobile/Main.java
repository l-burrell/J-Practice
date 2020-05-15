package com.mobile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Mobile phone = new Mobile();
		boolean isRunning = true;
		int choice = 0;
		
		while(isRunning) {
			System.out.println("\nPlease choose an option: ");
			System.out.println("1 = View Contacts");
			System.out.println("2 = Add Contact");
			System.out.println("3 = Remove Contact");
			System.out.println("4 = Exit Application\n");
			choice = scan.nextInt();
			switch(choice) {
			case 1: 
				phone.listContacts();
				break;
			case 2:
				phone.addContact();
				break;
			case 3:
				phone.removeContact();
				break;
			case 4: 				
				isRunning = false;
				System.out.println("Exiting...");
				break;
			}
		}
	}
}
