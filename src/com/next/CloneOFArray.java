package com.next;

public class CloneOFArray {
	public static void main(String[] args) {
		int i[]={1,9,3,6,7};
		
		int a[] =i.clone();
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
	}
}
