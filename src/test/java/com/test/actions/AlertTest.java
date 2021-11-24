package com.test.actions;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertTest {
    @Test
    public void alertAction() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Worldline/Testing/drivers/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nag");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nag");
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
    }
}
