package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Props {
	static Properties pro = new Properties();
	static Properties globalPro = new Properties();
	public static void main(String[] args) {
		/*readProp("test");
		writeProp("demo", "true");
		readProp("demo");
		readProp("test");*/
		globalPropRead("baseurl");
	}
	
	public static void writeProp(String key, String value) {
		try {
			OutputStream outputStream = new FileOutputStream(System.getProperty("user.dir") + "/src/test/resources/globalTest.properties");
			pro.setProperty(key, value);
			pro.store(outputStream, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void readProp(String key) {
		try {
			InputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/globalTest.properties");
			pro.load(inputStream);
			System.out.println(pro.getProperty(key));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String globalPropRead(String key) {
		String valueOfKey = null;
		try {
			InputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties");
			globalPro.load(inputStream);
			valueOfKey=globalPro.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("valueOfKey printed is "+valueOfKey);
		return valueOfKey;
	}
}
