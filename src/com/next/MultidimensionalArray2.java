package com.next;

public class MultidimensionalArray2 {
	public static void main(String[] args) {
		char[][] ch = new char[4][4];
		ch[0][0]='a';
		ch[0][1]='b';
		ch[0][2]='c';
		ch[0][3]='d';
		
		ch[1][0]='1';
		ch[1][1]='2';
		ch[1][2]='3';
		ch[1][3]='4';
		
		ch[2][0]='L';
		ch[2][1]='O';
		ch[2][2]='V';
		ch[2][3]='E';
		
		ch[3][0]='J';
		ch[3][1]='A';
		ch[3][2]='v';
		ch[3][3]='a';
		
		System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}
}
