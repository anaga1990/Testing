package com.runtime.polymoorphism;

public class PNB extends RBI{

	@Override
	void houseLoan() {
		System.out.println("PNB house loan rate of interest is 7.2%");
	}

	@Override
	void carLoan() {
		System.out.println("PNB car loan interst is 8.9%");
	}
	
}
