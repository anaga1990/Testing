package com.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyInfoCheckTest {
	
	WebDriver driver;
	@Test
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
	
	@Test
	public void myinfo() {
		driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();
		String expectedtitle="OrangeHRM";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getTitle(), expectedtitle, "title of Info Correct");
		String actualFirstName = driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).getAttribute("value");
		String expectedFirstName = "Ali";
		softAssert.assertEquals(actualFirstName, expectedFirstName, "first Name matched");
	}
	
	@BeforeMethod
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
