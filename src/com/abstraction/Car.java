package com.abstraction;

public interface Car {

	int a = 20; //all variables by default "public static final" 
	final int b = 30;
	final static int c = 35;
	static int d = 35;
	//Since Java 8, we can have default and static methods in an interface.

	//Since Java 9, we can have private methods in an interface.
	
	void m();
	
	int MOne();
	
	default void getResuklst() {
		
	}
	
	static String test() {
		return "naga";
	}
	
	private static void Size() {
		
	}
	
	public static void main(String[] args) {
		//Car c = new Car();
			
		Car.Size();
	} 
	
}
