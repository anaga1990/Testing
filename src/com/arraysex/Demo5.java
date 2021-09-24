package com.arraysex;

public class Demo5 {
	public static void main(String[] args) {
		char[] c = {'a','b','6','8','f'};
		
		char[] copyied = c.clone();
		for (char d : copyied) {
			System.out.print(d+ " ");
		}
		
		System.out.println();
		System.out.println("copy using system class started");
		
		char[] scopie = new char[10];
		// (form_array, from_array_index_to_copie, to_array, to_array_index_to_be_copie, length
		System.arraycopy(c, 2, scopie, 0, c.length-2);
		for (char d : scopie) {
			System.out.print(d+" ");
		}
	}

}
