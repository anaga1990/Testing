package com.stringex;

public class BasicString2 {
	public static void main(String[] args) {
		String name1 = "NaGARAJUNA";
		String string1 = new String("nagarajuna");
		
		System.out.println(name1.compareToIgnoreCase(string1)); // ignore the case sensitive
		System.out.println(name1.compareTo(string1)); // not ignore the case sensitive
		String a = "    java  java java      ";
		System.out.println(a);
		System.out.println(a.trim());
		String ss = "java";
		System.out.println(ss);
		ss.concat(string1); // still ss variable hold the old vaule = java
		System.out.println(ss);
		ss=ss.concat(string1); // ss will hold java + string1(string1 = nagarjuna), ss= javanagarjuna
		System.out.println(ss);
		System.out.println(ss.toUpperCase()); // to make value in capital letters
		System.out.println(name1.toLowerCase()); // to make value in small letters
		System.out.println(string1.contentEquals("nagarajuna"));
		System.out.println(string1.contains("una"));
		
	}
}
