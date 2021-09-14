package com.method.overridding;

public class B extends A{
	int a = 20;

	
	public static void main(String[] args) {
		B b = new B();
		b.mOne(20, 3);
	}

	@Override
	void mOne(int a, int b) {
		System.out.println(a+b);
	}

}
