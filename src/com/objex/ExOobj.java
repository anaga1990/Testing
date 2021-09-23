package com.objex;

public class ExOobj {
	int a ;
	int b ;
	int c;
	//.
	//.
	int zxxx;
	
	public ExOobj(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) throws Throwable {
		ExOobj o = new ExOobj(1, 4);
		ExOobj o1 = new ExOobj(1, 3);
		ExOobj o2 = new ExOobj(1, 4);
		
		Boolean getCompare=o.equals(o1);
		System.out.println(getCompare);
		getCompare=o.equals(o2);
		System.out.println(getCompare);
		o.finalize(); // Garbage collector // object not used , get those objects and delete from JVM
		Class<? extends ExOobj> ii = o1.getClass();// runtime class name
		System.out.println(ii);
		System.out.println(o2.hashCode()); // Unique id for each object
		System.out.println(o.hashCode());
		System.out.println(o1.hashCode());
		String ss = o.toString(); // address of object stored in heap memory
		//if you override toSting method it will provide instance variable values
		
		System.out.println(ss);
		//o.wait(t2.wait for t1 to logout);  // no scope for testing
		//o.wait(t3.wait for t1 &  t2 to logout);  // no scope for testing
		//o.notify();  // no scope for testing
		//o.notifyAll();  // no scope for testing
		//o.clone();  // no scope for testing
		
		
		//array
		
	}

	@Override
	public String toString() {
		return "ExOobj [a=" + a + ", b=" + b + "]";
	}
}
