package com.houseconstructor;

public class House {

	private Bedroom bedroom;
	private Bathroom bathroom;
	
	public House(Bedroom bedroom, Bathroom bathroom) {
		this.bathroom = bathroom;
		this.bedroom = bedroom;
	}

	public Bedroom getBedroom() {
		return bedroom;
	}

	public Bathroom getBathroom() {
		return bathroom;
	}
}
