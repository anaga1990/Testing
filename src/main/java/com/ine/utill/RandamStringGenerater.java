package com.ine.utill;

import java.util.Random;

public class RandamStringGenerater {
	public static void main(String[] args) {
		
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000000);  
		System.out.println("username"+ randomInt +"@gmail.com"); 
		RandamStringGenerater.generatingRandomAlphabeticString();
	}
	
	public static void generatingRandomAlphabeticString() {
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();

	    System.out.println(generatedString);
	}
}
