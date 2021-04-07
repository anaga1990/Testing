package com.test.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderTest {
	@Test
	public void uiHandle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().deleteAllCookies();
		driver.findElement(By.cssSelector("#travel_date")).click();
		WebElement getMonth=driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='datepicker-switch']"));
		
		while (!getMonth.getText().contains("June")) {
			System.out.println("loop got month is : "+getMonth.getText());
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.cssSelector("div[class='datepicker-days'] td.day"));
		Integer count=dates.size();
		for (int i = 0; i < count; i++) {
			String getnumber=driver.findElements(By.cssSelector("div[class='datepicker-days'] td.day")).get(i).getText();
			if (getnumber.equals("23")) {
				driver.findElements(By.cssSelector("div[class='datepicker-days'] td.day")).get(i).click();
				break;
			}
		}
	}

}
