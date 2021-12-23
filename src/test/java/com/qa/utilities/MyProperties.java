package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class MyProperties {
	Properties properties;

	public MyProperties() {
		File configPropFile = new File("./Configuration/config.properties");
		System.out.println("file name used : -> " + configPropFile);

		try {
			FileInputStream fileInputStream = new FileInputStream(configPropFile);
			properties = new Properties();
			properties.load(fileInputStream);
		} catch (Exception e) {
			System.out.println("exception with : " + e.getMessage());
		}
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("base_url");
		return url;
	}
	
	public String getUserName() {
		String user = properties.getProperty("username");
		return user;
	}
	
	public String getPassword() {
		String pass = properties.getProperty("password");
		return pass;
	}
	
	public String getBrowser() {
		String webBrowser = properties.getProperty("browser");
		return webBrowser;
	}

}
