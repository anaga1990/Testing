package com.assignment.operator;

public class ExAssignmentOperator {
	public static void main(String[] args) {
		int a = 2;
		int b = 10;
		int c = 20;
		System.out.println(a);
		//+=
		//-=, %=, *=, &=,|=,<<=, >>=, >>>=
		a+=2;  //a = a+2 = 2+2 = 4
		System.out.println(a);
		b-=4;  // 10-4 = 6
		System.out.println("b value with '-' operator "+b);
		b/=2; //6/2 = 3
		System.out.println("b value with '/' operator "+b);
		System.out.println("c value now "+c);
		c*=2; //20*2 = 40
		System.out.println("c value afer mulitiplication "+c);
		c%=7;
		System.out.println(c);
		int d =2;
		d^=-2;// d=-d+-2 = -2+-2 = -2-2=-4
		System.out.println(d);
		int z =2;
		z&=2;
		System.out.println(z&=2);
		
	}
}




//hold ctrl + A // to select all code
//hold ctrl + hold shif +F