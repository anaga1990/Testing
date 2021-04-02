package com.test.basic.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DifferentLocatorsAndHowToCallTest {
    @Test
    public void Run(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/?locale=in");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("test");
        driver.findElement(By.name("pw")).sendKeys("123445");
        driver.findElement(By.linkText("Forgot Your Password?")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("#username")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1222");
        Dimension l = driver.findElement(By.tagName("input")).getSize();
        System.out.println(l);
    }
}
