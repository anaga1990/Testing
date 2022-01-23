package com.happyslearning.e2e.Guru99.telecom.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.happyslearning.e2e.unti.Reuse;

public class AddCustomerPage {
	private WebDriver driver;

	private String newCustomerId;
	private String message;
	By IsBackgroundCheckDone = By.xpath("//label[normalize-space()='Done']");
	By firstName = By.xpath("//input[@id='fname']");
	By lastName = By.xpath("//input[@id='lname']");
	By email = By.xpath("//input[@id='email']");
	By enterYourAddress = By.xpath("//textarea[@id='message']");
	By mobileNumber = By.xpath("//input[@id='telephoneno']");
	By submit = By.xpath("//input[@name='submit']");

	By customerID = By.xpath("//table[@class='alt access']/tbody//td[2]/h3");
	By pleaseNoteDownYourCustomer = By.xpath("//b[normalize-space()='Please Note Down Your CustomerID']");

	By home = By.xpath("//a[@class='button']");

	// customerID=857487
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addCustomer(String fname, String lname, String mail, String address, String mobNo) {
		driver.findElement(IsBackgroundCheckDone).click();
		Reuse.screeShot(driver);
		driver.findElement(firstName).sendKeys(fname);
		Reuse.screeShot(driver);
		driver.findElement(lastName).sendKeys(lname);
		Reuse.screeShot(driver);
		driver.findElement(email).sendKeys(mail);
		Reuse.screeShot(driver);
		driver.findElement(enterYourAddress).sendKeys(address);
		Reuse.screeShot(driver);
		driver.findElement(mobileNumber).sendKeys(mobNo);
		Reuse.screeShot(driver);
		driver.findElement(submit).click();
		Reuse.screeShot(driver);
	}

	public List<String> getNewlyAddedCustomerId() {
		String message = driver.findElement(pleaseNoteDownYourCustomer).getText();
		Reuse.screeShot(driver);
		String cusId = driver.findElement(customerID).getText();
		List<String> data = new ArrayList<String>();
		data.add(message);
		data.add(cusId);
		this.newCustomerId = cusId;
		this.message = message;
		return data;
	}

	public String getCustmerValue() {
		return newCustomerId;
	}

	public String getConformationMessage() {
		return message;
	}

	public TeleComHomePage navigateToHome() {
		driver.findElement(home).click();
		Reuse.screeShot(driver);
		return new TeleComHomePage(driver);
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
