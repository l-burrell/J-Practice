package com.bank.account;

public class PremiumAccount extends Account {

	private double bonusRevenue;
	private int creditLimit;
	
	public PremiumAccount() {
		this("Jane", "Doe");
	}
	
	public PremiumAccount(String firstName, String lastName) {
		super(firstName, lastName);		
		bonusRevenue = 0.2;
	}
	
	public double calcBonus() {
		return bonusRevenue * getBalance();
	}
}
