package com.arraysex;

public class Demo4 {
	public static void main(String[] args) {
		int nn[] = { 1, 3, 54, 6, 7, 10 };
		for (int rr : nn) { // enhanced for loop/ for-each
			System.out.print(rr+", ");
		}
		System.out.println();
		System.out.println("____________________________");
		for(int i = 0; i<nn.length; i++) {
			System.out.print(nn[i]+", ");
		}
		
	}

}
