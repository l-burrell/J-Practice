package com.mobile;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mobile {
	
	private ArrayList<Contact> contacts;
	
	public Mobile() {
		contacts = new ArrayList<Contact>();
	}
		
	public void addContact() {
		addContact(findName());
	}
	
	public void addContact(String name) {
		Contact friend = new Contact(name);
		contacts.add(friend);
		System.out.println(contacts.toString());
	}
	
	public void removeContact() {
		removeContact(findName());
	}
	
	public void removeContact(String name) {
//		int id = findID(name);
//		contacts.remove(id);
	}
	
	public void listContacts() {
		System.out.println("\nContacts\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int count = 1;
		for(Contact friend : contacts) {
			System.out.println("#" + count + " " + friend.getName() + " is your contact.");
			count++;
		}
		System.out.println();
	}
	
	private String findName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the name of your contact? ");
		String name = scan.next();
		System.out.println(name);
		return name;
	}
	
	//WORK IN PROGRESS - MUST FIND A WAY TO ACCESS STRING FROM IN THE OBJECT
//	private int findID(String name) {
//		int id = -1;
//		if(contacts.contains(name)) {
//			id = contacts.indexOf(name);
//			return id;
//		}
//		return id;
//	}

	
}
