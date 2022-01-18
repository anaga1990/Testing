package com.qa.core;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.ConfigManager;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverManager {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> manageDriver = new ThreadLocal<>();
	public ConfigManager configManager = new ConfigManager();
	Properties prop = configManager.initProperties();
	

	/**
	 * this method will initialize browser with user provided type
	 *
	 */
	public WebDriver initWebBrowser(String browser) {
		System.out.println("User provided Browser is : " + browser);
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			if (prop.getProperty("browser_headless_mode").equalsIgnoreCase("true")) {
				options.addArguments("--headless");
				options.addArguments("window-size=1920,1080");
			}
			options.addArguments("chrome.switches","--disable-extensions");
			manageDriver.set(new ChromeDriver(options));
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			manageDriver.set(new FirefoxDriver());
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			manageDriver.set(new EdgeDriver());
		} else {
			if (browser != null) {
				System.out
						.println("user not provided valid browser, but test will be run by Default Browser as chrome");
				WebDriverManager.chromedriver().setup();
				manageDriver.set(new ChromeDriver());
			}
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return manageDriver.get();
	}
}
