package com.food;

public class GrilledBurger extends Burger {

	private boolean bbqSauce;
	private boolean hasSpinach;
	private int calories;
	
	public GrilledBurger() {
		super("Grilled Chicken", "Rye Bread");
		this.calories = 268;
	}
	
	public void addSpinach() {
		hasSpinach = true;
		System.out.println("You add spinach to your sandwich instead of lettuce, interesting.");
	}
	
	public void addSauce() {
		bbqSauce = true;
		System.out.println("You add our special honey bbq sauce.");
	}
	
	@Override
	public int getCalories() {
		System.out.println("This burger has " + calories + " calories.");
		return calories;
	}
}
