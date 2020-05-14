package com.movies;

public class Jaws extends Movie {

	public Jaws() {
		super("Jaws");
	}
	
	@Override
	public String plot() {
		return "A killer shark hunts a group of island travellers.";
	}
}
