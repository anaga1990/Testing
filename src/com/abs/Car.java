package com.abs;

public abstract class Car {
	
	int a = 20;
	final static int v = 30;
	static int y = 30;
	abstract void widthOfCar();
	
	abstract void heightOfCar();
	
	abstract void lengthOfCar();
	
	void carCompany() {
		System.out.println("TATA car's ");
	}
	
	private void tt() {
		System.out.println("TATA car's ");
	}
	
	static void listOfModles() {
		System.out.println("Tiago, Tigor, Zest, Altroz, Nexon, Harrier, Safari");
	}
	
	final int totalNumberOfCarModels() {
		String[] carsList= {"Tiago", "Tigor", "Zest", "Altroz", "Nexon", "Harrier", "Safari"};
		int count=carsList.length;
		System.out.println(count);
		return count;
	}
	
	public Car() {
		System.out.println("default constructer ");
		this.a = 50;
	}
	
	public static void main(String[] args) {
		//Car car= new Car(); 
		Car.listOfModles();
	}
}
