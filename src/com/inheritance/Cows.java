package com.inheritance;

public class Cows extends Animal{
	int numberOfCowsInMYHouse =20;
	
	public static void main(String[] args) {
		Cows cow = new Cows();
		cow.animalColor("white");
		cow.animalFood("gross");
		cow.typeOfFoodWillGiveToUS();
		System.out.println(cow.numberOfCowsInMYHouse);
		
		
		Animal animal = new Animal();
		animal.animalColor("Green");
	 // IS-A relation ship Inhertance
		
	}
	
	void typeOfFoodWillGiveToUS() {
		System.out.println("milk");
	}
	
}
