package com.houseconstructor;

public class Room {

	private String color;
	private String description;
	private int windows;
	
	public Room() {
		this("unfinished");
	}
	
	public Room(String description) {
		this(description, "white", 0);
	}
	
	public Room(String description, String color, int windows) {
		this.description = description;
		this.color = color;
		this.windows = windows;
	}

	public String getColor() {
		System.out.println("This room has a " + color + " paint.");
		return color;
	}

	public String getDescription() {
		System.out.println("This is the " + description + ".");
		return description;
	}

	public int getWindows() {
		System.out.println("There are " + windows + " in this room.");
		return windows;
	}
}
