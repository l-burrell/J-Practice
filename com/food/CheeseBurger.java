package com.food;

public class CheeseBurger extends Burger {

	private boolean hasOnionRings;
	private int calories;
	
	public CheeseBurger() {
		super("Ground Beef", "Sesame Seed Bun", false, true);
		this.calories = 420;
	}
	
	@Override
	public int getCalories() {
		System.out.println("This burger has " + calories + " calories.");
		return calories;
	}
}
