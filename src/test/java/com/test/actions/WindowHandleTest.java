package com.test.actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTest {
	@Test
	public void windowAction() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows =driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWID=it.next();
        String chaildWID=it.next();
        Thread.sleep(3000);
        driver.switchTo().window(chaildWID);
        String titel1=driver.getTitle();
        String mailid=driver.findElement(By.xpath("//a[contains(text(),'.com')]")).getAttribute("href").split(":")[1];
        System.out.println(mailid);
        driver.switchTo().window(parentWID);
        String titel2=driver.getTitle();
        System.out.println(titel1);
        System.out.println(titel2);
        Assert.assertNotEquals(titel1, titel2);
        driver.findElement(By.id("username")).sendKeys(mailid);
	}
}
