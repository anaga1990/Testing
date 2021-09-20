package com.abstraction;

public class Xmodelbike extends HondaBike {

	@Override
	void engin() {
		System.out.println("1111111");
	}

	@Override
	void width() {
		System.out.println("22222");
	}

	public static void main(String[] args) {
		Bike b = new Xmodelbike();
		b.bikeWheels(5);
		b.ccOfBike(125);
		b.engin();
		b.width();
	}

}
