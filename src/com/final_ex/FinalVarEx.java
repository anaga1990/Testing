package com.final_ex;

public class FinalVarEx {
	final int age ;  // cannot change
	
	FinalVarEx(){
		age = 200;
		
	}
	void mOne() {
		System.out.println(age);
	}
	public static void main(String[] args) {
		FinalVarEx ex = new FinalVarEx();
		ex.mOne();
	}
}
