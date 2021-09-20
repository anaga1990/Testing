package com.runtime.polymoorphism;

public class SBI extends RBI{

	@Override
	void houseLoan() {
		System.out.println("SBI house loan rate of interest is 6.2%");
	}

	@Override
	void carLoan() {
		System.out.println("SBI car loan interst is 8.6%");
	}
	
}
