package com.test.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class ActionClassEx {
	@Test
	public void AmazonSignin() {
		System.setProperty("webdriver.chrome.driver", "C:/Worldline/Testing/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("LAPTOPS").doubleClick().build().perform();
		action.moveToElement(element).contextClick().build().perform();
	}
}
