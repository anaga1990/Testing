package com.happyslearning.e2e.Guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	By username = By.cssSelector("input[name='uid']");
	By password = By.xpath("//input[@name='password']");
	By login    = By.xpath("//input[@name='btnLogin']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public BankHomePage loginBankApplication(String user, String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		return new BankHomePage(driver);
	}
	
}
