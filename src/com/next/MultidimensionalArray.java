package com.next;

public class MultidimensionalArray {
	public static void main(String[] args) {
		char[][] ch = new char[2][2];
		ch[0][0]='a';
		ch[0][1]='b';
		ch[1][0]='c';
		ch[1][1]='s';
		System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}
}
