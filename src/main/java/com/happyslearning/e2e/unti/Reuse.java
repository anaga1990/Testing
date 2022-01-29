package com.happyslearning.e2e.unti;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reuse {

	public static void adCloseAction(WebDriver driver) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
		driver.findElement(By.cssSelector("svg")).click();
		//jsElementClick(driver, driver.findElement(By.cssSelector("svg")));
	}

	public static void screeShot(WebDriver driver) {

		/**
		 * StackTraceElement will help us to get TestMethod name
		 */
		StackTraceElement[] stactrace = Thread.currentThread().getStackTrace();
		StackTraceElement element = stactrace[3];
		String testMethod = element.getClassName();
		//System.out.println(element.getMethodName());

		/**
		 * getScreenshotAs method to take screen shot
		 */
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);

		/**
		 * created screenshot pattern using date
		 */
		Date date = new Date();
		SimpleDateFormat dateFormater = new SimpleDateFormat("YYYY_MM_dd_HHmmss");
		String pattren = dateFormater.format(date);

		/**
		 * location to store screen shot taken
		 */
		String locationOfFile = System.getProperty("user.dir") + "/screenshotsDir/" + testMethod + "/" + pattren
				+ ".png";

		File destination = new File(locationOfFile);
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void jsElementClick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
}
