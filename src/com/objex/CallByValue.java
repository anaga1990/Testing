package com.objex;

public class CallByValue {
	// call by value in java
	int age = 18;
	void addAge(int age) {
		this.age = age+15;
	}
	
	public static void main(String[] args) {
		CallByValue call = new CallByValue();
		call.addAge(10);
		System.out.println(call.age);
	}
	
}
