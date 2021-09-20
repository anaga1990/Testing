package com.abs;

public interface CarBluePrint {
	int a = 20;
	static int b = 30;
	final int c = 444;
	
	void test();
	
	private void display() {
		System.out.println("private Methods in interface");
	}
	
	static void mOne() {
		System.out.println("I am static method in interface");
	}
	
	public abstract void mTwo();
	
	void mThree();
	
	default void Time() {
		System.out.println(" default method in Interface");
	}
	
	public static void main(String[] args) {
		//CarBluePrint bluePrint = new CarBluePrint();
		System.out.println(CarBluePrint.a);
		TestTATA c = new TestTATA();
		c.carCompany();
		c.heightOfCar();
		c.lengthOfCar();
		c.widthOfCar();
		c.totalNumberOfCarModels();
		Car.listOfModles();
	}
	
}
