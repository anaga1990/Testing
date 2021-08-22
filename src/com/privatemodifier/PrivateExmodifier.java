package com.privatemodifier;

public class PrivateExmodifier {
	
	public static void main(String[] args) {
		PrivateExmodifier em = new PrivateExmodifier();
		em.privateMethod();
		System.out.println("before age value change "+em.age);
		em.age = em.age+39;
		System.out.println("after age value change "+em.age);
	}
	
	private int age= 29;
	private void privateMethod() {
		System.out.println("we are in private method");
	}
	
	
	
}
