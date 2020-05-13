package com.cars.improved;

public class Car extends Vehicle {

	private String brand;
	private int currentSpeed;
	private int currentGears;
	
	public Car() {
		this("unknown");
	}
	
	public Car(String brand) {
		this(brand, 0, 0);
	}
	
	public Car(String brand, int currentSpeed, int currentGears) {
		super(4, "4WD");
		this.brand = brand;
		this.currentGears = currentGears;
		this.currentSpeed = currentSpeed;
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
		if (gears > 0 && gears <= getGears()) {
			return true; 
		} 
		return false;
	}
	
	public void changeGears(int gears) {
		if(isMoving() && canChangeGears(gears)) {
			System.out.println("Changing from " + getCurrentGears() + " into " + gears + ".");
		} else {
			System.out.println("Unable to change gears.");
		}
	}
	
	public int getCurrentGears() {
		return currentGears;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void setCurrentSpeed(int speed) {
		if(speed < 0) {
			System.out.println("It is impossible to move at a negative speed (negative speed is not reversing!).");			
		} 
		else {
			
			if(speed < currentSpeed && speed > 0) {
				System.out.println("You decelerate and slow down. You are travelling at " + currentSpeed + " mph.");
			} else if(speed == currentSpeed) {
				System.out.println("You remain at the same speed. You are currently traveling at " + currentSpeed + " mph.");
			} else {
				System.out.println("You accelerate even faster! You are moving at " + currentSpeed + " mph.");
			}
			currentSpeed = speed;
		}
	}
}
