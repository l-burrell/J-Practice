package com.cars.improved;

public class Vehicle {

	private String steering;
	private int gears;
	
	public Vehicle() {
		this(0, "n/a");
	}
	
	public Vehicle(int gears, String steering) {
		this.gears = gears;
		this.steering = steering;
	}
	
	public String getSteering() {
		return steering;
	}
	
	public void setSteering(String steering) {
		this.steering = steering;
	}
	
	public int getGears() {
		return gears;
	}
	
	public void setGears(int gears) {
		this.gears = gears;
	}
}
