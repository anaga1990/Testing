package com.test.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ScrollWindow {
	@Test
	public void scrollPageOrWindow() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Worldline/Testing/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,550);");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		List<WebElement> total=driver.findElements(By.cssSelector("div.tableFixHead td:nth-child(4)"));
		int sum=0;
		for (int i = 0; i < total.size(); i++) {
			System.out.println(driver.findElements(By.cssSelector("div.tableFixHead td:nth-child(4)")).get(i).getText());
			sum=sum +Integer.parseInt(driver.findElements(By.cssSelector("div.tableFixHead td:nth-child(4)")).get(i).getText());
		}
		System.out.println("Total count is : "+sum);
		String string=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int expected=Integer.parseInt(string);
		Assert.assertEquals(sum, expected);
	}
}
