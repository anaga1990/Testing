package com.privatemodifier;

public class PrivateExmodifier {
	
	public static void main(String[] args) {
		PrivateExmodifier em = new PrivateExmodifier();
		
		//classname exREFF = new classname();
		System.out.println(em.age); //29
		em.age = 40;
		System.out.println(em.age);
		
		em.privateMethod();
	}
	
	private int age= 29; //instance variable or non-static variable
	void privateMethod() {
		System.out.println("we are in private method");
	}
	
	// with the class
	
}
