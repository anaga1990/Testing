package com.qa.page.object.modle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.scenarios.BaseTest;

public class Login extends BaseTest{
	
	@FindBy (xpath = "//input[@id='txtUsername']")
	WebElement usernameText;
	
	@FindBy (xpath = "//input[@id='txtPassword']")
	WebElement passwordText;
	
	@FindBy (xpath = "//input[@id='btnLogin']")
	WebElement loginButton;
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginOrm() {
		loginButton.click();
	}
	
}
