package com.relational;

public class ExOfRelational {
	public static void main(String[] args) {
		//< >
		System.out.println(10 > 20);
		int a = 20;
		int b = 30;
		System.out.println(a < b);
		//>=, <= 
		System.out.println(10>=10); //just check value comapre 
		System.out.println(10<=10);
		
		//a ==b, != 100 not 0  account balance 200, 1000, 1000
		a =40;
		b =40;
		System.out.println(a==b); //memory area location //String constan pool string a = "naga"; STring ss = new String("naga")
		System.out.println("____________________");
		System.out.println(a!=40);
		
		String string = "naga"; //heap memory //string constan pool its sub cataogory in Heap area
		String string2 = new String("naga"); //heap memory
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println(string==string2); // its going to compare memory area same or not
		System.out.println(string.equals(string2)); //its check just value
		
	}
}
