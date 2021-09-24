package com.stringex;

public class BasicString {
	public static void main(String[] args) {
		String names = "nagarajuna";
		String name1 = "nagarajuna ";
		String string = new String("nagarajuna");
		String string1 = new String("nagarajuna");
		System.out.println(name1.hashCode());
		System.out.println(names.hashCode());
		System.out.println(string.hashCode());
		System.out.println(string1.hashCode());
		
		System.out.println(name1.charAt(6));
		int i = name1.compareTo(names); // compareTo method will check actual value present in a String
		System.out.println(i);
		int a =name1.compareTo(string1); // compareTo method will check actual value present in a String
		System.out.println(a);
		
		if(names==name1) {
			System.out.println("both are equal");
		}
		
		if(string==string1) { // == method will check about address of the object
			System.out.println("both are equal");
		}else {
			System.out.println(" string and string1 not equal");
		}
		
		if(string.equals(string1)) {  //equals check the value of String
			System.out.println("from equals method "+" both are equal");
		}
		
		
		
	}
}
