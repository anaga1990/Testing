package com.test.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTest {
	@Test
	public void frames() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		// get middle frame text
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		String string=driver.findElement(By.id("content")).getText();
		System.out.println(string);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
		String string1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
		System.out.println(string1);
	}
}
