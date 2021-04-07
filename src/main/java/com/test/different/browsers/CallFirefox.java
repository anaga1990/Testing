package com.test.different.browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CallFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	}
}
