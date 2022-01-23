package com.line.utill;

import java.util.Random;

public class RandamStringGenerater {
	public static void main(String[] args) {

		generatingRandomAlphabeticString();
		generatingRandomMailid();
		generatingMobileNumber();
		generatingNumber(100);
	}

	public static void generatingRandomAlphabeticString() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		System.out.println(generatedString);
	}

	public static String generatingRandomMailid() {
		Random random = new Random();
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		String randomName = random.ints(leftLimit, rightLimit).limit(15)
				.collect(StringBuffer::new, StringBuffer::appendCodePoint, StringBuffer::append).toString();
		int randomInt = random.nextInt(1000000);
		String mailId = randomName + randomInt + "@gmail.com";
		System.out.println(" Mail Id Created For Test IS :: " + mailId);
		return mailId;
	}

	public static long generatingMobileNumber() {
		long mini_Range = 6170000000L;
		long max_Range = 9999999999L;
		long randomNum = (long) (Math.random() * (max_Range - mini_Range + 1) + mini_Range);
		System.out.println(randomNum);
		return randomNum;
	}

	public static int generatingNumber(int max_Range) {
		int minValue = 1; 
		int maxValue = max_Range;
		int randomNum = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
		System.out.println(randomNum);
		return randomNum;
	}

}
