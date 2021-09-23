package com.next;

public class BasicsOFArray {
	public static void main(String[] args) {
		int courseID[] = new int[5];//declaration and instantiation  
		courseID[0]=10010;//initialization  
		courseID[1]=20010;
		courseID[2]=20020;
		courseID[3]=20003;
		courseID[4]=506678;
		
		System.out.println(courseID[4]);
		System.out.println(courseID[1]);
		System.out.println("____________________________________________");
		for(int i = 0; i<5; i++) {
			System.out.println("Record "+ (i+1) +" is  "+courseID[i]);
		}
		
		System.out.println(" declaration, instantiation and initialization in single line");
		int a[]={33,3,4,5};//declaration, instantiation and initialization  
		for(int i = 0; i<4; i++) {
			System.out.println("Record "+ (i+1) +" is  "+a[i]);
		}
		
		System.out.println("Character type array");
		char[] ch = {'j','a','v','a','-','t','o','-','t','e','s','t'};
		for(char  itr : ch) {
			System.out.print(itr);
		}
		
		
	}
}
