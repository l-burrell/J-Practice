package com.houseconstructor;

public class Bathroom extends Room {
	
	private boolean hasBathTub;
	private boolean hasShower;
	private boolean hasMirror;

	public Bathroom() {
		this(true, true, true);
	}
	
	public Bathroom(boolean hasBathTub, boolean hasShower, boolean hasMirror) {
		super("Bathroom");
		this.hasBathTub = hasBathTub;
		this.hasShower = hasShower;
		this.hasMirror = hasMirror;
	}
	
	public boolean hasBathTub() {
		return hasBathTub;
	}

	public boolean hasShower() {
		return hasShower;
	}

	public boolean hasMirror() {
		return hasMirror;
	}

	public void clean() {
		System.out.println("You clean the bathroom.");
	}
}
