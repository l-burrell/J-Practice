package com.bank.account;

public class Account {

	private String firstName;
	private String lastName;
	private String email;
	
	private int accountNumber;
	private int phoneNumber;
	private double balance;
	
	public Account() { }
	
	public Account(String firstName, String lastName) {
		this(firstName, lastName, "n/a");
	}
	
	public Account(String firstName, String lastName, String email) {
		this(firstName, lastName, email, 000_000_0000);
	}
	
	public Account(String firstName, String lastName, int phoneNumber) {
		this(firstName, lastName, "n/a", phoneNumber);		
	}
	
	public Account(String firstName, String lastName, String email, int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.balance = 0;
	}
	
	public void depositFunds(double amount) {
		if(amount < 0) {
			System.out.println("[Invalid deposit]: Unable to deposit $" + amount + ".");
		} else {
			balance += amount;
			System.out.println("[Successful deposit]: You have added $" + amount + " to your account.");
			System.out.println("New Balance: $" + balance + "\n");
		}
	}
	
	public void withdrawFunds(double amount) {
		if(amount < 0 || amount > balance){
			System.out.println("[Invalid withdrawl]: Unable to withdraw $" + amount + ".");
			System.out.println("Current Balance: $" + balance);
		} else {
			balance -= amount;
			System.out.println("[Successful withdrawl]: You have collected $" + amount + " from your account.");
			System.out.println("New Balance: $" + balance + "\n");
		}
	}
	
	public String getFirstName() { 
		return this.firstName;
	}
	
	public String getLastName() { 
		return this.lastName;
	}
	
	public String getFullName() { 
		return this.firstName + " " + this.lastName;
	}
	
	public String getEmail() { 
		return this.email;
	}
	
	public int getAccount() { 
		return this.accountNumber;
	}
	
	public int getPhoneNumber() { 
		return this.phoneNumber;
	}
	
	public double getBalance() { 
		return this.balance;
	}
	
	public void setFirstName(String firstName) { 
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) { 
		this.lastName = lastName;
	}
	
	public void setEmail(String email) { 
		this.email = email;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
