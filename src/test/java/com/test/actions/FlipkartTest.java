package com.test.actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class FlipkartTest {
	public WebDriver driver;
	@Test
	public void flipkart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Worldline/Testing/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
        WebElement fotter=driver.findElement(By.xpath("//div[@class='_2Brcj4']"));
        int links=fotter.findElements(By.tagName("a")).size();
        System.out.println("links : "+links);
        for (int i = 0; i < links; i++) {
			fotter.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		}
        Set<String> allWindows=driver.getWindowHandles();
        Iterator<String> iterator = allWindows.iterator();
        while (iterator.hasNext()) {
        	driver.switchTo().window(iterator.next());
			String string=driver.getTitle();
			System.out.println(string);
		}
        
	}
	@AfterTest
	public void tearDown() {
		System.out.println("_____________________");
		driver.quit();
	}
}
