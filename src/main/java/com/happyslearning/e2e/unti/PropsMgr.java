package com.happyslearning.e2e.unti;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;


public class PropsMgr {
	static Properties props = new Properties();
	static Properties globalProps = new Properties();
	public static String getProp(String Key) {
		String propvalue = null;
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/testData.properties");
			props.load(fis);
			propvalue = props.getProperty(Key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propvalue;
	}
	
	public static void setProp(String Key, String Value) {
		try {
			FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"/src/test/resources/testData.properties");
			props.setProperty(Key, Value);
			props.store(fos, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getGlobalProp(String Key) {
		String propvalue = null;
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\test.properties");
			globalProps.load(fis);
			propvalue = globalProps.getProperty(Key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propvalue;
	}
	
}
