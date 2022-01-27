package com.api.util;

import java.util.Random;

public class RandamData {
	public static String genString() {
		int min = 97;
		int max = 122;
		Random random = new Random();
		String data = random.ints(min, max).limit(10)
				.collect(StringBuffer::new, StringBuffer::appendCodePoint, StringBuffer::append).toString();
		return data;
	}

	public static String genMailId() {
		int min = 97;
		int max = 122;
		Random random = new Random();
		String data = random.ints(min, max).limit(15)
				.collect(StringBuffer::new, StringBuffer::appendCodePoint, StringBuffer::append).toString();
		int number = genNumber();
		String mailid = data + "."+number + "@gmail.com";
		return mailid;
	}

	public static int genNumber() {
		int min = 1;
		int max = 99999;
		int number = (int) (Math.random() * (max - min + 1) + min);
		return number;
	}
	
	public static long genMobNo() {
		long min = 7000077777L;
		long max = 9999999999L;
		long number = (long) (Math.random() * (max - min + 1) + min);
		return number;
	}
	
	public static String randomAlphanumericString() {
	    int leftLimit = 48; // numeral '0'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();

	    System.out.println(generatedString);
	    return generatedString;
	}

}
