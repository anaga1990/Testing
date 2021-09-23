package com.next;

public class ExArray {

	public static void main(String[] args) {
		ExArray arr = new ExArray();
		int size=arr.markesOfStudent().length;
		System.out.println(size);
		ExArray.markesOfStudent1();
	}
	
	public int[] markesOfStudent() {
		return new int[] {100,30,78,89,23,89,85};
	}
	
	
	public static int[] markesOfStudent1() {
		return new int[] {90,22,78,89,23,89,85};
	}
	
}
