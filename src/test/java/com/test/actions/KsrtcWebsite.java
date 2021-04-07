package com.test.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KsrtcWebsite {
	@Test
	public void ksrtc() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://ksrtc.in/oprs-web/");
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).click();
        driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("tiru");
        List<WebElement> sourceCity=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        for (WebElement webElement : sourceCity) {
			if (webElement.getText().equalsIgnoreCase("TIRUPATHI")) {
				webElement.click();
				break;
			}
		}
        driver.findElement(By.id("toPlaceName")).click();
        driver.findElement(By.cssSelector("#toPlaceName")).sendKeys("ONGOLE");
        driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[@class='ui-menu-item']/a[starts-with(text(),'ONGOLE')]")).click();
        
	}
}
