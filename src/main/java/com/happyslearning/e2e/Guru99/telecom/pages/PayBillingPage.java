package com.happyslearning.e2e.Guru99.telecom.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.happyslearning.e2e.unti.Reuse;

public class PayBillingPage {
	private WebDriver driver;

	By enterYourCustomerID = By.xpath("//input[@id='customer_id']");
	By submit = By.xpath("//input[@value='submit']");

	By customerID = By.xpath("//h3[contains(text(),'Customer ID:-')]");
	By TotalBill = By.xpath("//b[normalize-space()='Total Bill']//following::b");

	By home = By.xpath("//a[@class='button']");

	public PayBillingPage(WebDriver driver) {
		this.driver = driver;
	}

	public TeleComHomePage navigateToHome() {
		driver.findElement(home).click();
		return new TeleComHomePage(driver);
	}

	public void payBilling(String customerNumber) {
		driver.findElement(enterYourCustomerID).sendKeys(customerNumber);
		Reuse.screeShot(driver);
		driver.findElement(submit).click();
		Reuse.screeShot(driver);
	}

	public List<String> getBillingDetails() {
		String cusID = driver.findElement(customerID).getText();
		Reuse.screeShot(driver);
		String totalAmount = driver.findElement(TotalBill).getText();
		List<String> data = new ArrayList<String>();
		data.add(cusID);
		data.add(totalAmount);
		return data;
	}

}
