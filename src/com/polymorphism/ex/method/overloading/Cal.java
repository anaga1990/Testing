package com.polymorphism.ex.method.overloading;

public class Cal {
	public void addition(float b) {
		System.out.println("float type");
	}
	
	public void addition(float b, int d) {
		System.out.println("float type");
	}
	
	public int addition() {
		System.out.println("int with no argument");
		return 0;
	}
	
	public int addition(int b, int c) {
		System.out.println("int with 2 arguments");
		return 0;
	}
	
	public long addition(long b, int c) {
		System.out.println("long");
		return 0;
	}
	
	//1)compile time Polymorphism,static Polymorphism, method overloading
	//1)different arguments
	//2)you can have different return Type
	public static void main(String[] args) {
		Cal cal = new Cal();
		cal.addition();
		cal.addition(1122);
		cal.addition(2, 2);
		cal.addition(1223, 12);
		
	}
	
	
}
