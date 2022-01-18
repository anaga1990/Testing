package com.qa.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("chrome.switches","--disable-extensions");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		By email = By.id("txtUsername");
		By password = By.id("txtPassword");
		By sigin = By.xpath("//input[@id='btnLogin']");
		driver.findElement(email).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(sigin).click();
		List<WebElement> data = driver.findElements(By.xpath("//ul[@id='mainMenuFirstLevelUnorderedList']/li/a/b"));
		for (WebElement webElement : data) {
			String str = webElement.getText();
			System.out.println(str);
		}
		
	}
}
