package com.arraysex;

public class TwoDimenctionAr {
	public static void main(String[] args) {
		char[][] c = { { 'a', 'b', 'c' }, { '1', '2', '3' }, { 'x', 'y', 'z' }, { '$', '*', '@' } };
		System.out.println(c.length);
		System.out.print(c[0][0]+" ");
		System.out.print(c[0][1]+" ");
		System.out.print(c[0][2]+" ");
		System.out.println();
		System.out.print(c[1][0]+" ");
		System.out.print(c[1][1]+" ");
		System.out.print(c[1][2]+" ");
		System.out.println();
		System.out.print(c[2][0]+" ");
		System.out.print(c[2][1]+" ");
		System.out.print(c[2][2]+" ");
		System.out.println();
		System.out.print(c[3][0]+" ");
		System.out.print(c[3][1]+" ");
		System.out.print(c[3][2]+" ");
		
		System.out.println();
		//a b c
		//1 2 3
		//x y z
		//$ * @
		System.out.println(c[1]); 
		for (int row = 0; row < c.length; row++) {
			for (int cell = 0; cell < c.length-1; cell++) {
				System.out.print(c[row][cell]+ "  ");
			}
			
			System.out.println();
		}
	}
}
