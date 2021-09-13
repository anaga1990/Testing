package com.method.overridding;

public class TestC extends TestB  {
	// Annotation
	

	public static void main(String[] args) {
		TestC b = new TestC();
		b.checkExamScore();
		b.getPersonInfo("nagarjuna");
	}
}
