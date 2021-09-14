package com.final_ex;

public class FinalMethodEx {
	int age = 99;
	final void mOne() {  // final methods cannot be override in child class
		age = 20;
		System.out.println(age);
	}
}
