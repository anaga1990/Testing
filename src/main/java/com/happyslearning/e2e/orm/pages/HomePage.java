package com.happyslearning.e2e.orm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	public WebDriver driver;
	
	@FindBy(xpath = "//b[normalize-space()='Admin']")
	WebElement admin;

	@FindBy(xpath = "//b[normalize-space()='PIM']")
	WebElement pim;

	@FindBy(xpath = "//b[normalize-space()='Leave']")
	WebElement leave;

	@FindBy(xpath = "//a[@id='welcome']")
	WebElement welcomeUserIcon;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logout;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AdminTabPage clickonAdminTab() {
		admin.click();
		return new AdminTabPage(driver);
	}

	public PimTabPage clickonPimTab() {
		pim.click();
		return new PimTabPage(driver);
	}

	public LeaveTabPage clickonLeaveTab() {
		leave.click();
		return new LeaveTabPage(driver);
	}

	public void logoutUser() {
		welcomeUserIcon.click();
		logout.click();
	}
}
