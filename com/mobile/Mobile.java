package com.mobile;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mobile {
	
	private ArrayList<Contact> contacts;
	private int myNumber;
	
	public Mobile() {
		this(0);
	}
	
	public Mobile(int myNumber) {
		contacts = new ArrayList<Contact>();
		this.myNumber = myNumber;
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
		String name = findName();
		int contactId = findContact(name);
		if(contactId >= 0) {
			this.contacts.remove(contactId);
		}
	}
	
	public boolean removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if(foundPosition < 0) {
			System.out.println(contact.getName() + " was not found.");
			return false;
		}
		this.contacts.remove(foundPosition);
		System.out.println(contact.getName() + " was deleted");
		return true;
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
	
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int findID = findContact(oldContact);
		if(findID < 0) {
			System.out.println(oldContact.getName() + " not found.");
			return false;
		} 
		this.contacts.set(findID, newContact);
		System.out.println(oldContact.getName() + " was replaced with " + newContact);
		return true;
	}

	private int findContact(Contact contact) {
		return this.contacts.indexOf(contact);
	}
	
	private int findContact(String contactName) {
		for(int i = 0; i < this.contacts.size(); i++) {
			Contact contact = this.contacts.get(i);
			if(contact.getName().equalsIgnoreCase(contactName)) {
				return i;
			}
		}
		return -1;
	}
	
	private String queryContact(Contact contact) {
		if(findContact(contact) >= 0) {
			return contact.getName();
		}
		return null;
	}
	
	private Contact queryContact(String name) {
		int position = findContact(name);
		if(position >= 0) {
			return this.contacts.get(position);
		}
		return null;
	}
}
