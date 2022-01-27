package com.api.test.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesManager {
	static Properties pro = new Properties();
	static Properties globalPro = new Properties();
	
	public static void writeProp(String key, String value) {
		try {
			OutputStream outputStream = new FileOutputStream(System.getProperty("user.dir") + "/src/test/resources/globalTest.properties");
			pro.setProperty(key, value);
			pro.store(outputStream, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static String readProp(String key) {
		String valueOfKey = null;
		try {
			InputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/globalTest.properties");
			pro.load(inputStream);
			valueOfKey=pro.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valueOfKey;
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
		return valueOfKey;
	}
}
