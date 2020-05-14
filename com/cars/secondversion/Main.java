package com.cars.secondversion;

public class Main {

	public static void main(String[] args) {
		Toyota firstCar = new Toyota();
		firstCar.checkCondition();
		System.out.println(firstCar.getOwner());
		System.out.println("The vehicles price is $" + firstCar.calcPrice() + "\n");
		
		Toyota secondCar = new Toyota("Jim Rodgers", "black", true);
		System.out.println(secondCar.getOwner());
		System.out.println("The vehicles price is $" + secondCar.calcPrice());
		secondCar.changeGears(30);
		secondCar.setCurrentSpeed(54);
		System.out.println();
		secondCar.changeGears(2);
		secondCar.setCurrentSpeed(333);
	}
}
