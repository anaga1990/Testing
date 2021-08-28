package com.bitwise.operator;

public class ExOfBitwiseVsLogicalOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		System.out.println(a < b & a > c); // false & true //
		// a<b > 1st condition = false still '&' operator check 2nd condition
		// & true and true = true
		// false and true = false
		// true and false = false
		// false and false = false
		System.out.println(10 > 20 | 20 < 7); // false & true //
		// | true and true = true
		// false and true = true
		// true and false = true
		// false and false = false
		System.out.println("we are now starting logical Operators");
		System.out.println((a < b) && (a > c)); // false & true //
		//what is difrence B/w '&' and '&&'
		//single & if 1st condition false even tho 2nd condition will executed
		// double && if 1st condition false , then 2nd condition not executed
		System.out.println((a<5) & (a++<2));  // true & false
		System.out.println("A value from just singe &  "+a);
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("B value before && operation"+ b);
		
		System.out.println((10<5) && (b++>2));  // true & false //10>2 11
		System.out.println("B value value from just double &&  "+b);
		System.out.println("________________________________________________");
		System.out.println(true | (c++<2)); //if 1 st condition true then also 2nd condition will check by Bitwise | operator
		System.out.println(true || (d++<2));//if 1 st condition true then 2nd condition not check by logical || operator 
		System.out.println("C value value from just double &&  "+c);
		System.out.println("D value value from just double &&  "+d);
		
	}

}
