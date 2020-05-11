package com.bank;

import com.bank.account.Account;
import com.bank.account.PremiumAccount;

public class Main {

	public static void main(String[] args) {
		Account accountOne = new Account();
		accountOne.setFirstName("Jamie");
		accountOne.setLastName("Rogers");
		System.out.println("Account holder of \"account one\" is: " + accountOne.getFullName() + ".\n");
		
		PremiumAccount accountTwo = new PremiumAccount();
		accountTwo.setFirstName("Mike");
		accountTwo.setLastName("Hall");
		System.out.println("Account holder of \"account two\" is: " + accountTwo.getFullName() + ".\n");
		accountTwo.depositFunds(2530);
		System.out.println("Account two bonus: $" + accountTwo.calcBonus());
	}
}
