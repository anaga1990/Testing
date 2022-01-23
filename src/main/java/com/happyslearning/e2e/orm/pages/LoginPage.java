package com.happyslearning.e2e.orm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement usernameText;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement passwordText;

	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginbutton;

	@FindBy(xpath = "//a[@id='welcome']")
	WebElement welcomeUserIcon;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logout;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginWithmultiuserData(String user, String pass) {
		usernameText.sendKeys(user);
		passwordText.sendKeys(pass);
		loginbutton.click();
	}

	public void logoutUser() {
		welcomeUserIcon.click();
		logout.click();
	}
}
