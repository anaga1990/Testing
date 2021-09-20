package com.abstraction;

public abstract class Bike {

	int a = 30;

	abstract void engin(); // abstract method

	abstract void width();

	abstract void fuelTankSize();

	final void bikeWheels(int radiusOfTyre) {
		System.out.println(" bike must have only 2 wheels &  " + radiusOfTyre);
	}

	static void length() {
		System.out.println("length of bike is : 180 CM ");
	}

	private static void bikeModel() {
		System.out.println("Honda Shine Bike ");
	}

	void test() {

	}

	public void ccOfBike(int cc) {
		System.out.println(" bike cc is " + cc);
	}

	public static void main(String[] args) {
		// Bike b = new Bike();
		Bike.bikeModel();
	}

	Bike() {
		System.out.println(" I am default constructer in Adstarct class");
	}

	Bike(int q) {
		System.out.println(" I am default constructer in Adstarct class");
	}

	{
		int a = 2000;
		System.out.println("I am from non-static block from abstract class");
	}

}
