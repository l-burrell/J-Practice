package com.bank;

import com.bank.account.Account;

public class Main {

	public static void main(String[] args) {
		Account accountOne = new Account();
		accountOne.setFirstName("Jamie");
		accountOne.setLastName("Rogers");
		System.out.println("Account holder of \"account one\" is: " + accountOne.getFullName() + ".");
		
	}
}
