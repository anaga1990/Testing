package com.line.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.line.base.E2eCoreApi;

public class LeaveTabPage extends E2eCoreApi {
	public WebDriver driver;

	@FindBy(xpath = "//a[@id='menu_leave_applyLeave']")
	WebElement applymenu;

	@FindBy(xpath = "//input[@id='calFromDate']")
	WebElement fromDate;

	@FindBy(xpath = "//input[@id='calToDate']")
	WebElement toDate;

	@FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	WebElement showLeavewithStatusAll;

	@FindBy(xpath = "//input[@id='btnSearch']")
	WebElement searchbutton;

	@FindBys({ @FindBy(xpath = "//tbody//td[1]/a") })
	List<WebElement> resultsOfDates;

	@FindBys({ @FindBy(xpath = "//tbody//td[3]") })
	List<WebElement> resultsOfLeaveType;

	// uses Logout data Start
	@FindBy(xpath = "//a[@id='welcome']")
	WebElement welcomeUserIcon;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logout;
	// uses Logout data End

	public void logoutUser() {
		welcomeUserIcon.click();
		logout.click();
	}

	public LeaveTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void serachLeaveDetails(String dateFrom, String tillDate) {
		//date format used for this method = YYYY-MM-dd
		fromDate.sendKeys(dateFrom);
		getShot(driver);
		toDate.sendKeys(tillDate);
		getShot(driver);
		if (!(showLeavewithStatusAll.isSelected())) {
			showLeavewithStatusAll.click();
			getShot(driver);
		}
		searchbutton.click();
		for (WebElement webElement : resultsOfDates) {
			System.out.println(webElement.getText());
			getShot(driver);
		}

		for (WebElement webElement : resultsOfLeaveType) {
			System.out.println(webElement.getText());
			getShot(driver);
		}
		
	}

}
