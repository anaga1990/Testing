package com.oops.ex;

public class ConEx2 {
	int a = 10;
	int b;
	int c;

	public ConEx2(int a) {
		this(50,100,202);
		this.a = a;
		fetchDetails();
	}

	public ConEx2(int a, int b) {
		this.a = a;
		this.b = b;
		fetchDetails();
	}
	
	public ConEx2(int a, int b, int c) {
		this(2000,3000);
		this.a = a;
		this.b = b;
		this.c = c;
		fetchDetails();
	}
	
	void fetchDetails() {
		System.out.println(a + " "+b +" "+c);
	}
	
	public static void main(String[] args) {
		ConEx2 ex = new ConEx2(5000);
	}

}
