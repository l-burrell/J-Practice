package com.houseconstructor;

public class Bedroom extends Room {

	private boolean hasBed;
	private boolean hasTv;
	private int windows;
	private String flooring;
	
	public Bedroom() {
		this("carpet");
	}
	
	public Bedroom(String flooring) {
		this(flooring, true, false, 2);
	}
	
	public Bedroom(String flooring, boolean hasBed, boolean hasTv, int windows) {
		super("Bedroom");
		this.flooring = flooring;
		this.hasBed = hasBed;
		this.hasTv = hasTv;
		this.windows = windows;
	}
	
	public void makeBed() {
		if(hasBed) {
			System.out.println("You begin to make up the bed and fluff the pillows.");
		} else {
			System.out.println("It appears you do not have a bed!");
		}
	}
}
