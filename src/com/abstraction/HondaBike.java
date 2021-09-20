package com.abstraction;

public abstract class HondaBike extends Bike{

	@Override
	void fuelTankSize() {
		// TODO Auto-generated method stub
		
	}
	
	void enginType(String enginType) {
		System.out.println(getClass() +enginType);
	}

}
