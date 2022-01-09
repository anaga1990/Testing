package com.line.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class E2eCoreApi {
	public WebDriver driver;
	public Properties props;

	private static Logger logs = LogManager.getLogger(E2eCoreApi.class);

	public E2eCoreApi() {

	}

	public WebDriver initilizeBrowser() {
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File(System.getProperty("user.dir") + "/config/config.properties"));
			props = new Properties();
			props.load(fis);
			logs.info("properties loaded");
		} catch (FileNotFoundException e) {
			logs.error(" given properties File Not Found");
			e.printStackTrace();
		} catch (IOException e) {
			logs.error("Input file not found: please check path of of the files might wrong");
			e.printStackTrace();
		}
		String nameOfTheBrowser = props.getProperty("browser");
		String browserMode = props.getProperty("headlessMode");
		if (nameOfTheBrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			if(browserMode.equalsIgnoreCase("true")) {
				options.addArguments("--headless");
				options.addArguments("window-size=1920,1080");
			}
			options.addArguments("chrome.switches","--disable-extensions");
			driver = new ChromeDriver(options);
			logs.info("ChromeDriver started for Test");
			driver.manage().window().maximize();
		} else if (nameOfTheBrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			if(browserMode.equalsIgnoreCase("true")) {
				options.addArguments("--headless");
				options.addArguments("window-size=1920,1080");
			}
			driver = new FirefoxDriver(options);
			logs.info("FirefoxDriver started for Test");
		} else if (nameOfTheBrowser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options =new EdgeOptions();
			if(browserMode.equalsIgnoreCase("true")) {
				options.setCapability("UseChromium", true);
				options.setCapability(browserMode, false);
				options.getCapabilityNames();
				System.out.println(options.getCapabilityNames());
			}
			driver = new EdgeDriver(options);
			logs.info("EdgeDriver started for Test");
			driver.manage().window().maximize();
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Long.parseLong(props.getProperty("implicitly_wait")),
				TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(props.getProperty("page_load_time_out")),
				TimeUnit.SECONDS);
		driver.get(props.getProperty("base_url"));
		return driver;
	}

	public void closeBrowser() {
		logs.info(props.getProperty("browser") + " browser stopped ");
		driver.quit();
	}

	public void getShot(WebDriver driver) {
		/*
		 * maybe StackTraceElement e = stacktrace[3] this number needs to be corrected
		 * (current method->parent method->grandParent Method name it will give you
		 */
		StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
		StackTraceElement e = stacktrace[3];
		String methodName = e.getMethodName();
		System.out.println("getShot methodName " + methodName);
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY_MM_dd_HHmmss");
		String patternType = dateFormat.format(date);
		String location = System.getProperty("user.dir") + "/SnapShots/" + methodName;
		System.out.println("screenshots Locations used ================> " + location);
		File DestFile = new File(location + "/" + patternType + ".png");
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
