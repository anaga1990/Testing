package com.superex;

public class B extends A{
	int a = 30;
	String b = "classB";
	
	B(){
		System.out.println("I am from B class");
	}
	
	void test() {
		System.out.println("Method from  B class ");
		super.test();
		System.out.println(super.age);
		super.age = 43954;
		System.out.println(super.age);
		System.out.println(super.ahsx);
	}
	public static void main(String[] args) {
		B b = new B();
		b.test();
	}
	
}
