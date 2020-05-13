package com.cars.improved;

public class Toyota extends Car {
	
	private boolean isDamaged;
	private boolean isMaintained;
	private boolean isLuxuryVehicle;
	private String color;
	private String owner;
	private double price;
	
	
	public Toyota() {
		super("Toyota");
	}
	
	public void checkCondition() {
		if(isDamaged && isMaintained) {
			System.out.println("Bad Condition: Has been damaged, and was not maintained.");
		} else if(isDamaged && isMaintained) {
			System.out.println("Okay Condition: Has been damaged, but well maintained. ");
		} else {
			System.out.println("Good Condition: No damage, and well maintained.");
		}
	}
	
	public double calcPrice() {
		double price = 3000;
		
		if(isDamaged) {
			price = price - (price / 4);
		}
		if(isMaintained) {
			price = price + (price * 0.05);
		}
		if(isLuxuryVehicle) {
			price = price + (price * 0.2);
		}
		return price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
