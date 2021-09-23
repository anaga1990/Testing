package com.arraysex;

public class Demo {
	public static void main(String[] args) {
		String[] names = new String[4];
		names[0] = "Naga";
		names[1] = "nani";
		names[2] = "lak";
		names[3] = "test";
		System.out.println(names);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println("task completed");
		System.out.println("___________________________________________");
		int size = names.length;
		System.out.println("array size "+size);
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("..continue remain code");
	}

}
