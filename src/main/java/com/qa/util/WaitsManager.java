package com.qa.util;

public class WaitsManager {
	
	public static void staticWait(long numberOfSeconds) {
		try {
			Thread.sleep(numberOfSeconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
