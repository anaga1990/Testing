package com.test.actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class ScreenShotTest {
	 @Test
	    public void alertAction() {
	        System.setProperty("webdriver.chrome.driver", "C:/Worldline/Testing/drivers/chromedriver.exe");
	        WebDriver driver =  new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        try {
				FileUtils.copyFile(screenShot, new File("D:\\SeleniumScreenshots\\demo.png"));
			} catch (IOException e) {
				e.getMessage();
			}
	 }
}
