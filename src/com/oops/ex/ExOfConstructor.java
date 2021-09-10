package com.oops.ex;

public class ExOfConstructor {
	int age;
	//4 bites  ,long 8 bites 
	// Constructor be name must be class name
	public ExOfConstructor() {  // default constructor must be zero parameters/Arguments
		System.out.println("I am default Constructor");
	}
	
	public ExOfConstructor(int a) { // its not A default constructor its parameters constructor
		age = a;
		System.out.println("I am from parameterized Constructor  is of int data type");
	}
	
	public ExOfConstructor(long a) { // its not A default constructor its parameters constructor
		age = (int)a;
		System.out.println("I am from parameterized Constructor");
	}
	void printInstanceValue() { // method
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		ExOfConstructor ofConstructor = new ExOfConstructor();
		ofConstructor.printInstanceValue();
		ofConstructor = new ExOfConstructor(89);
		ofConstructor.printInstanceValue();
		ofConstructor = new ExOfConstructor(2020022L);
		ofConstructor.printInstanceValue();
	}
}
