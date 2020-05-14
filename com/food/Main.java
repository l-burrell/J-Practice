package com.food;

public class Main {

	public static void main(String[] args) {
		CheeseBurger cb = new CheeseBurger();
		System.out.println(cb.getBun());
		cb.getPrice();
		cb.getCalories();
		
		GrilledBurger gb = new GrilledBurger();
		System.out.println("\n" + gb.getBun());
		System.out.println("Does this burger have double meat? " + gb.hasDoubleMeat());
		gb.addDoubleMeat();
		System.out.println("Does this burger have double meat? " + gb.hasDoubleMeat());
		gb.getPrice();
		gb.getCalories();
	}
}
