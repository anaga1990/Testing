package com.test.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class AmzanGetAllLinks {
	@Test
	public void AmazonSignin() {
		System.setProperty("webdriver.chrome.driver", "C:/Worldline/Testing/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        int elements = driver.findElements(By.tagName("a")).size();
        System.out.println("links count : " + elements);
        WebElement FooterElement=driver.findElement(By.cssSelector(".navFooterLine.navFooterLinkLine.navFooterDescLine"));
        int Fotterelements=FooterElement.findElements(By.tagName("a")).size();
        System.out.println("Fotterelements links count : " + Fotterelements);
	}
}
