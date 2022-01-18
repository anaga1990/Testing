package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	private By email = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By sigin = By.xpath("//input[@id='btnLogin']");
	private By incorrectLoginAlert = By.xpath("//span[@id='spanMessage']");
	
	By userProfile=By.xpath("//a[@id='welcome']");
	
	By signout = By.xpath("//a[normalize-space()='Logout']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		System.out.println("LoginPage driver : "+ driver);
	}

	public void enterUserDetails(String emailText, String passwordText) {
		driver.findElement(email).sendKeys(emailText);
		driver.findElement(password).sendKeys(passwordText);
	}

	public void clickOnSigin() {
		driver.findElement(sigin).click();
	}

	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getIncorrectMessage() {
		return driver.findElement(incorrectLoginAlert).getText();
	}
	
	
	public HomePage siginToAccount(String emailText, String passwordText) {
		driver.findElement(email).sendKeys(emailText);
		driver.findElement(password).sendKeys(passwordText);
		driver.findElement(sigin).click();
		return new HomePage(driver);
	}
	
	public void signOutAccount() {
		driver.findElement(userProfile).click();
		driver.findElement(signout).click();
	}
	
}
