package com.runtime.polymoorphism;

public class CNRB extends RBI{

	@Override
	void houseLoan() {
		System.out.println("CNRB house loan rate of interest is 6.0%");
	}

	@Override
	void carLoan() {
		System.out.println("CNRB car loan interst is 10.02%");
	}
	
}
