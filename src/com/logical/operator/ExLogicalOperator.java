package com.logical.operator;

public class ExLogicalOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c = 20;
		System.out.println(a>b); // true
		System.out.println(a<c); //true
		System.out.println(a>c); // false
		System.out.println(a>b && a<c); // condition1 = true && condition2 =true final value =true
		System.out.println(a<b && a<c); // condition1 = false && condition2 =true final value =false
		
		System.out.println(a>b || a<c); // condition1 = true && condition2 =true final value =true
		System.out.println(a<b || a<c); // condition1 = false && condition2 =true final value =true

	}
}
