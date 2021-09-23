package com.objex;

import java.util.Iterator;

public class Animal implements Cloneable{
	int a , b, c;
	String aa, bb, cc;
	public Animal(int a, int b, int c, String aa, String bb, String cc) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.aa = aa;
		this.bb = bb;
		this.cc = cc;
	}
	
	void results() {
		System.out.println(this.a +" "+this.b+ " "+ this.c+ " "+this.aa+ " "+this.bb+" "+this.cc);
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Animal animal = new Animal(1, 2, 3, "nagaa", "Yte", "Java");
		animal.results();
		Animal an = (Animal)animal.clone();
		an.results();
		Animal animal1 = new Animal(2, 2, 2, "nagaa", "naga", "Java");
		for(int i = 1; i<10;i++) {
			Animal ann = (Animal)animal1.clone();
			ann.results();
		}
		
	}
	
}
