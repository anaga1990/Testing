
public class Hello {

	static int a = 20; // static variable
	int age= 31; // non-static variable or instance Variable loaded at run time and age = 0

	static {
		// static block
		System.out.println(" I am from Static block");
	}

	static {
		// static block
		System.out.println(" I am from Static block1");
	}

	// javac Hello.java   > compileing java class >> Hello.class
	// java Hello >> it will do the actions for us		
	//> then memory allocated to all static variables, 2) load
	// static methods
	// 3) load static block & execute
	// 4) main method
	// 5) based on order is there any static methods is called/ is there any object creation or not /

	public static void test() {
		// static method
		// static method will call by classname reff
		// Hello.test() // calling of static method

		System.out.println("I am from static method");
	}

	{
		// non -static block
		System.out.println("I am from non-static block");
	}

	{
		// non -static block
		System.out.println("I am from non-static block2");
	}

	public void m1() {
		// non-static method
		// non-static method able to call by object_reff
		System.out.println("I am from non-static method");
	}

	public static void main(String[] args) { // main method
		System.out.println("java");

		// object creation
		// classname object_reff = new classname();
		// hold ctrl + space in eclipse tool
		Hello hello = new Hello();

		// to call non-static variable or instance Variable you need use object_reff
		System.out.println(hello.age);
		hello.m1();
		Hello.test();

	}
}
