package com.oops.ex;

public class ExOFClass {
	int a ; //instance Variable
	static int b;  //static Variable
	
	public void test() {    //non-static method
		int c =12;
		System.out.println("I am from test Method   -> "+c);
	}
	public static void testTwo() {  // static method
		int c = 20; //local 
		System.out.println("I am from static testTwo Method   -> "+c);
	}
	
	{         //non-static block
		System.out.println("I am from non-static Block");
	}
	
	static {  //static block
		System.out.println("I am from Static Block");
	}
	
	public static void main(String[] args) {
		
		//Class_name ex = new  Class_name();
		ExOFClass ex = new ExOFClass();  // Object creation
		//ex = 1101288798
		//instance or non-static -> variables/methods/blocks load at run time
		System.out.println(ex.a);   // you can call instance or non-static -> variables using object reference
		ex.test();   				// you can call instance or non-static -> methods using object reference
		ExOFClass.testTwo();    // static variables/methods/blocks load at compile Time at Class reference
		System.out.println(ExOFClass.b);  // you can call static variables/methods using Class name
		
		System.out.println(ex.hashCode()); //1101288798
	}
	
}
