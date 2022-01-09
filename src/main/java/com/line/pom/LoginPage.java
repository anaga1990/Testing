package com.line.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.line.base.E2eCoreApi;

public class LoginPage extends E2eCoreApi {
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

	public HomePage loginAction() {
		usernameText.sendKeys("Admin");
		getShot(driver);
		passwordText.sendKeys("admin123");
		getShot(driver);
		loginbutton.click();
		getShot(driver);
		return new HomePage(driver);
	}
	public void loginWithmultiuserData(String user, String pass) {
		usernameText.sendKeys(user);
		getShot(driver);
		passwordText.sendKeys(pass);
		getShot(driver);
		loginbutton.click();
		getShot(driver);
	}

	public void logoutUser() {
		welcomeUserIcon.click();
		getShot(driver);
		logout.click();
	}
}
