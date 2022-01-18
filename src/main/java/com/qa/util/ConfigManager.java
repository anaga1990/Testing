package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
	private Properties prop;
	private FileInputStream fis;

	public Properties initProperties() {
		prop = new Properties();
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/config/baseconfig.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public Properties initProperties(String configFileWithPath) {
		prop = new Properties();
		String configFileWithFullPath = null;
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "/"+configFileWithFullPath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
