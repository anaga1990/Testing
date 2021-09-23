package com.next;

public class CopyOFArray {
	public static void main(String[] args) {
		int arr[]={1,9,3,6,7}; 
		int a[]=new int[3];
		
		System.arraycopy(arr, 0, a, 0, 3);
		for (int i : a) {
			System.out.print(i+ " ");
		}
	}
}
