package com.line.extent.reports.indetailed;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportsOfExtentEx5AttachScrrenShots {
	ExtentReports extentReports;
	WebDriver driver;

	@BeforeSuite
	public void setup() {
		extentReports = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("withScreenShot_Extent.html");
		try {
			sparkReporter.loadXMLConfig(new File("Configuration/extentreport-with-logo-config.xml"));
			extentReports.attachReporter(sparkReporter);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testOne() throws IOException {
		ExtentTest test = extentReports.createTest("Login Test");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		test.pass("chrome Browser started");
		driver.manage().window().maximize();
		test.pass("browser maximized");
		driver.get("https://google.com");
		test.pass("base url enterted",
				MediaEntityBuilder.createScreenCaptureFromBase64String(getShotAsbase64()).build());

	}

	@AfterSuite
	public void tearDown() {
		driver.close();
		extentReports.flush();
		try {
			Desktop.getDesktop().browse(new File("withScreenShot_Extent.html").toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getShot(WebDriver driver) {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd_HHmmss");
		String patternType = dateFormat.format(date);
		File DestFile = new File(System.getProperty("user.dir")+ "/screenshots/"+patternType + ".png");
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getShotAsbase64()  {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}
	
	

}
