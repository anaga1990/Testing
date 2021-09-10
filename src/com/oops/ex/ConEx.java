package com.oops.ex;

public class ConEx {
	int a = 10;
	int b = 0;
	int c = 0;

	public ConEx(int a) {
		this.a = a;
		fetchDetails();
	}

	public ConEx(int a, int b) {
		this.a = a;
		this.b = b;
		fetchDetails();
	}
	
	public ConEx(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		fetchDetails();
	}
	
	void fetchDetails() {
		System.out.println(a + " "+b +" "+c);
	}
	
	public static void main(String[] args) {
		ConEx ex = new ConEx(12, 20, 30);
	}

}
