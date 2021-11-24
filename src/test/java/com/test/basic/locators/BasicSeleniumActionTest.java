package com.test.basic.locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BasicSeleniumActionTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Worldline/Testing/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // radio button click
        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        Thread.sleep(5000);
        // check box click
        driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
        // select from static dropdown
        Thread.sleep(5000);
        Select select = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
        select.selectByIndex(1);
        //submit or link click
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'Home')]")).click();
    }
}
