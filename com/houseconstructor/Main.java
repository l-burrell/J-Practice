package com.houseconstructor;

public class Main {

	public static void main(String[] args) {
		Bathroom bath = new Bathroom();
		Bedroom bed = new Bedroom();
		House home = new House(bed, bath);
		
		home.getBathroom().getDescription();
	}
}
