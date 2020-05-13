package com.cars.improved;

public class Car extends Vehicle {

	private String brand;
	private int currentSpeed;
	
	public Car() {
		
	}
	
	public boolean isMoving() {
		if(currentSpeed > 0) {
			System.out.println("The " + brand + " is driving at " + currentSpeed + " mph.");
			return true;
		}
		System.out.println("The " + brand + " is stationary.");
		return false;
	}
	
	public boolean canChangeGears(int gears) {
		if (gears > 0 && gears <= 4) {
			return true; 
		} 
		return false;
	}
	
	public void changeGears(int gears) {
		if(isMoving() && canChangeGears(gears)) {
			System.out.println("Changing from " + getGears() + " into " + gears + ".");
			setGears(gears);
		} else {
			System.out.println("Unable to change gears.");
		}
	}
}
