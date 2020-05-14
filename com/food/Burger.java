package com.food;

public class Burger {

	private String meat;
	private String bun;
	private boolean hasCheese;
	private boolean hasPickles;
	private boolean hasMustard;
	private boolean hasKetchup;
	private boolean hasDoubleMeat;
	private boolean hasLettuce;
	private boolean hasTomato;
	private int calories;
	private double price;
	
	public Burger() {
		this("Ground Beef");
	}
	
	public Burger(String meat) {
		this(meat, "Sesame Seed Bun");
	}
	
	public Burger(String meat, String bun) {
		this(meat, bun, false, false);
	}
	
	public Burger(String meat, String bun, boolean hasDoubleMeat, boolean hasCheese) {
		this.meat = meat;
		this.bun = bun;
		this.hasDoubleMeat = false;
		this.hasCheese = false;
		this.hasPickles = true;
		this.hasMustard = true;
		this.hasKetchup = true;
		this.hasLettuce = true;
		this.hasTomato = false;
		calories = 350;
		price = 1.29;		
	}
	
	public double getPrice() {
		if(hasDoubleMeat) {
			price = price + 1.25;
		}
		if(hasCheese) {
			price = price + 0.20;
		}
		System.out.println("The price of your burger is $" + price + " dollars.");
		return price;
	}
	
	public int getCalories() {
		System.out.println("This burger has " + calories + " calories.");
		return calories;
	}
	
	public String getMeat() {
		return meat;
	}
	
	public String getBun() {
		return bun;
	}
	
	public boolean hasCheese() {
		return hasCheese;
	}
	
	public boolean hasPickles() {
		return hasPickles;
	}
	
	public boolean hasMustard() {
		return hasMustard;
	}
	
	public boolean hasKetchup() {
		return hasKetchup;
	}
	
	public boolean hasDoubleMeat() {
		return hasDoubleMeat;
	}
	
	public boolean hasLettuce() {
		return hasLettuce;
	}
	
	public boolean hasTomato() {
		return hasTomato;
	}
	
	public void addCheese() {
		hasCheese = true;
	}
	
	public void addDoubleMeat() {
		hasDoubleMeat = true;
	}
	
	private void setCalories(int cal) {
		calories = cal;
	}
}
