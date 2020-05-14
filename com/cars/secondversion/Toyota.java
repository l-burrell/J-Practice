package com.cars.secondversion;

public class Toyota extends Car {
	
	private boolean isDamaged;
	private boolean isMaintained;
	private boolean isLuxuryVehicle;
	private String color;
	private String owner;
	private double price;
	
	
	public Toyota() {
		this("Toyota Dealership");
	}
	
	public Toyota(String owner) {
		this.owner = owner;
	}
		
	public Toyota(String owner, String color) {
		this(owner, color, false, false, true);
	}
	
	public Toyota(String owner, String color, boolean isLuxuryVehicle) {
		this(owner, color, isLuxuryVehicle, false, true);
	}
	
	public Toyota(String owner, String color, boolean isLuxuryVehicle, boolean isDamaged, boolean isMaintained) {
		super("Toyota");
		this.owner = owner;
		this.color = color;
		this.isLuxuryVehicle = isLuxuryVehicle;
		this.isDamaged = isDamaged;
		this.isMaintained = isMaintained;
	}
	
	
	public void checkCondition() {
		if(isDamaged && !isMaintained) {
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
	
	public double getPrice() {
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
