package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	private WebDriver driver;
	private By email = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By sigin = By.xpath("//input[@id='btnLogin']");
	private By incorrectLoginAlert = By.xpath("//span[@id='spanMessage']");
	
	@FindBy(xpath = "//a[@id='welcome']")
	WebElement userProfile;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement signout;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		System.out.println("LoginPage driver : "+ driver);
	}

	public void enterUserDetails(String emailText, String passwordText) {
		driver.findElement(email).sendKeys(emailText);
		driver.findElement(password).sendKeys(passwordText);
	}

	public HomePage clickOnSigin() {
		driver.findElement(sigin).click();
		return new HomePage(driver);
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
		userProfile.click();
		signout.click();
	}
	
}
