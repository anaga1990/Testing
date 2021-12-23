package com.qa.scenarios;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.utilities.MyProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	MyProperties myprops = new MyProperties();
	
	public String baseURL = myprops.getApplicationUrl();
	public String username = myprops.getUserName();
	public String password = myprops.getPassword();
	//public String browser = myprops.getBrowser();
	public static WebDriver driver;
	Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void browserSetup(String browser) {
		logger = Logger.getLogger("Elearning");
		PropertyConfigurator.configure("Log4j.properties");
		String browserName = browser;
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("chrome browser started");
			driver.manage().window().maximize();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			logger.info("firefox browser started");
		}else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			logger.info("Edge browser started");
		}else {
			logger.warn("No value given by user default value chrome browser picked to test scenarios");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("chrome browser started");
			driver.manage().window().maximize();
		}
		
		driver.manage().deleteAllCookies();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void browserClose() {
		driver.close();
	}

}
