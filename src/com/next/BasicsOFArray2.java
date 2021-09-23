package com.next;

public class BasicsOFArray2 {

	public static void main(String[] args) {
		BasicsOFArray2 b2 = new BasicsOFArray2();
		b2.markesSheet(new int[] {95,34,56,23,56,87,56});
	}
	
	public void markesSheet(int markes[]) {
		System.out.println("Number of subjects : "+ markes.length);
		int total =0;
		for (int i = 0; i < markes.length; i++) {
			System.out.println("subject "+ (i+1)+ " : "+markes[i]);
			total= total+markes[i];
		}
		System.out.println(total);
	}
	
}
