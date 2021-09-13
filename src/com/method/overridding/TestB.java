package com.method.overridding;

public class TestB extends TestA {
	// Annotation
	//2nd generation
	void getPersonInfo(String string) {
		System.out.println(string);
		int a = 10;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		// Overriding means same like parent method but method Body must be change
	}

	
	void testBBBB() {
		
	}

	public static void main(String[] args) {
		TestB b = new TestB();
		b.checkExamScore();
		b.getPersonInfo("nagarjuna");
	}
}
