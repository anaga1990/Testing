package com.arraysex;

public class Demo2 {
	public static void main(String[] args) {
		String[] names = new String[4];
		names[0] = "master bed";
		names[1] = "child bed";
		names[2] = "XXX things";
		names[5]= ""; // error  java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
	}

}
