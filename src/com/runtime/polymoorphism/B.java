package com.runtime.polymoorphism;

public class B extends A{
	void dob() {
		System.out.println("27/19/2020");
	}
	public static void main(String[] args) {
		A a = new B();
		a.dob();
	}
}
