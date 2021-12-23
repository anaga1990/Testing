package com.qa.page.object.modle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.scenarios.BaseTest;

public class BankLoginPage extends BaseTest{
	@FindBy(xpath = "//input[@name='uid']")
	WebElement useridText;
	
	@FindBy (xpath = "//input[@name='password']")
	WebElement passwordText;
	
	@FindBy (css = "input[value='LOGIN']")
	WebElement login;
	
	public BankLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginBankApplication(String userName, String password) {
		useridText.sendKeys(userName);
		passwordText.sendKeys(password);
		login.click();
	}
	
}
