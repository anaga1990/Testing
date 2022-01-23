package com.happyslearning.e2e.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.happyslearning.e2e.unti.PropertiesFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {
	public WebDriver driver;
	public Properties prop;
	public static ThreadLocal<WebDriver> mangeDriverThread = new ThreadLocal<WebDriver>();
	
	public WebDriver startTheBrowser() {
		prop = PropertiesFactory.loadPropertieFile();
		String browserName = prop.getProperty("browser");
		String isHeadlss = prop.getProperty("browser_headless");
		System.out.println("browserName used for Test is : "+browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			if(isHeadlss.equalsIgnoreCase("true")) {
				options.addArguments("--headless");
			}
			options.addArguments("window-size=1920,1080");
			mangeDriverThread.set(new ChromeDriver(options));
			getDriver().manage().window().maximize();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			//geckodriver
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			if(isHeadlss.equalsIgnoreCase("true")) {
				options.addArguments("--headless");
			}
			options.addArguments("window-size=1920,1080");
			mangeDriverThread.set(new FirefoxDriver(options));
		}else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			mangeDriverThread.set(new EdgeDriver());
			getDriver().manage().window().maximize();
		}else {
			System.out.println("user provided browser as "+ browserName +" is not configured , please check Browser, test running with default browser as Chrome ");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			if(isHeadlss.equalsIgnoreCase("true")) {
				options.addArguments("--headless");
			}
			options.addArguments("window-size=1920,1080");
			mangeDriverThread.set(new ChromeDriver(options));
			getDriver().manage().window().maximize();
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		System.out.println("driver seesion id from startTheBrowser : "+getDriver());
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return mangeDriverThread.get();
	}
	
	public void openApplication() {
		getDriver().get(prop.getProperty("baseurl"));
	}
	
}
