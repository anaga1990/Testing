package com.happyslearning.e2e.unti;

import java.util.Random;

public class RandomDataManager {

	public static int getRandomNumber(int range) {
		Random random = new Random();
		int number = random.nextInt(range);
		return number;
	}

	public static long getMobileNumber() {
		long minimun = 6100000000L;
		long maxmium = 9999999999L;
		long mobNo = (long) (Math.random() * (maxmium - minimun + 1) + minimun);
		return mobNo;
	}

	public static String getName(int range) {
		Random random = new Random();
		int minimun = 97;
		int maxmium = 122;
		String generatedName = random.ints(minimun, maxmium).limit(range)
				.collect(StringBuffer::new, StringBuffer::appendCodePoint, StringBuffer::append).toString();
		return generatedName;
	}
	
	
	public static String getMailId() {
		Random random = new Random();
		int minimun = 97;
		int maxmium = 122;
		int number = random.nextInt(999999);
		String generatedName = random.ints(minimun, maxmium).limit(15)
				.collect(StringBuffer::new, StringBuffer::appendCodePoint, StringBuffer::append).toString();
		return generatedName+"."+number+"@gmail.com";
	}
	
	
	

}
