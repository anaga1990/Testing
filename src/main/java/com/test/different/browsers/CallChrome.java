package com.test.different.browsers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CallChrome {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("FromTag")).click();
		driver.findElement(By.id("FromTag")).sendKeys("bang");
		//driver.findElement(By.xpath("//a[contains[text(),'Bangalore')]")).click();
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='list']/a"));
		for (WebElement nag : list) {
			if (nag.getText().equalsIgnoreCase("Bangalore, IN - Kempegowda International Airport (BLR)")) {
				nag.click();
			}
		}
		
		driver.findElement(By.id("ToTag")).sendKeys("hyd");
		driver.findElement(By.xpath("(//li[@role='presentation']/a)[11]")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ' and contains(text(),'2')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='ui-state-default ' and contains(text(),'5')])[2]")).click();
		WebElement selectAdult=driver.findElement(By.id("Adults"));
		Select select = new Select(selectAdult);
		select.selectByIndex(3); //4
		Thread.sleep(1000);
		select.selectByValue("2");//2
		Thread.sleep(1000);
		select.selectByVisibleText("6"); //6
		
		WebElement selectChildren=driver.findElement(By.id("Childrens"));
		select = new Select(selectChildren);
		select.selectByVisibleText("2"); //2
		Thread.sleep(2000);
		driver.findElement(By.id("SearchBtn")).click();
	}
}
