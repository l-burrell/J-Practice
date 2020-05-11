package com.cars;

public class Car {

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public Car() {
		 
	}
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("toyota") || validModel.equals("porsche")) {			
			this.model = model;
		} else {
			this.model = "unknown";
		}
	}
	
	public String getModel() {
		return this.model;
	}
}
