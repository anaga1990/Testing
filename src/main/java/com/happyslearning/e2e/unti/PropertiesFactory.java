package com.happyslearning.e2e.unti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFactory {
	static FileInputStream fileReader;
	static FileOutputStream fileWriter;
	static Properties properties;
	static Properties dynamicFileproperties;

	// overloading();
	public static Properties loadPropertieFile() {
		String baseDir = System.getProperty("user.dir");
		String fileName = "/src/main/resources/test.properties";
		System.out.println("propertie file with location : " + baseDir + fileName);
		try {
			fileReader = new FileInputStream(baseDir + fileName);
			properties = new Properties();
			properties.load(fileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	/**
	 * 
	 * @param propertiesFileWithPath file you want to read by properties class
	 * @return
	 */
	public static Properties loadPropertieFile(String propertiesFileWithPath) {
		String baseDir = System.getProperty("user.dir");
		String fileName = propertiesFileWithPath;
		System.out.println("propertie file with location : " + baseDir + fileName);
		dynamicFileproperties = new Properties();
		try {
			fileReader = new FileInputStream(baseDir + fileName);
			dynamicFileproperties.load(fileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dynamicFileproperties;
	}

	public static void setProp(String propertiesFileWithPath, String Key, String Value,
			boolean condition) {
		String baseDir = System.getProperty("user.dir");
		String fileName = propertiesFileWithPath;
		System.out.println("propertie file with location : " + baseDir + fileName);
		dynamicFileproperties = new Properties();
		try {
			fileWriter = new FileOutputStream(baseDir + fileName, true);
			dynamicFileproperties.setProperty(Key, Value);
			dynamicFileproperties.store(fileWriter, "updated");
			if (condition == true) {
				dynamicFileproperties.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
