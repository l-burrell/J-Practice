package com.bank.account;

public class PremiumAccount extends Account {

	private double bonusRevenue;
	
	public PremiumAccount() { 
		bonusRevenue = 0.2;
	}
	
	public double calcBonus() {
		return bonusRevenue * getBalance();
	}
}
