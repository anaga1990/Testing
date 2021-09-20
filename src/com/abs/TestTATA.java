package com.abs;

public class TestTATA extends TATATiago{
	public static void main(String[] args) {
		Car c = new TestTATA();
		c.carCompany();
		c.heightOfCar();
		c.lengthOfCar();
		c.widthOfCar();
		c.totalNumberOfCarModels();
		Car.listOfModles();
	}

	@Override
	void heightOfCar() {
		System.out.println("1750MM "+getClass());
		
	}
	
}


