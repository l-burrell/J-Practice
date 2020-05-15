package com.mobile;

public class Contact {

	private String name;
	private String email;
	private int cellPhoneNumber;
	private int workPhoneNumber;
	
	public Contact(String name) {
		this(name, "n/a");
	}
	
	public Contact(String name, String email) {
		this(name, email, 0, 0);
	}
	
	public Contact(String name, int cellPhoneNumber) {
		this(name, "n/a", cellPhoneNumber, 0);
	}
	
	public Contact(String name, String email, int cellPhoneNumber, int workPhoneNumber) {
		this.name = name;
		this.email = email;
		this.cellPhoneNumber = cellPhoneNumber;
		this.workPhoneNumber = workPhoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public int getWorkPhoneNumber() {
		return workPhoneNumber;
	}
}
