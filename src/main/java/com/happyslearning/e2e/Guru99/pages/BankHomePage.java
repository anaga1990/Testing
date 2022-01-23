package com.happyslearning.e2e.Guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankHomePage {
	private WebDriver driver;

	By newCustomer = By.xpath("//a[normalize-space()='New Customer']");
	By editCustomer = By.xpath("//a[normalize-space()='Edit Customer']");
	By deleteCustomer = By.xpath("//a[normalize-space()='Delete Customer']");
	By newAccount = By.xpath("//a[normalize-space()='New Account']");
	By editAccount = By.xpath("//a[normalize-space()='Edit Account']");
	By deleteAccount = By.xpath("//a[normalize-space()='Delete Account']");
	By miniStatement = By.xpath("//a[normalize-space()='Mini Statement']");
	By customisedStatement = By.xpath("//a[normalize-space()='Customised Statement']");
	By logOut = By.xpath("//a[normalize-space()='Log out']");

	public BankHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public NewCustomer navigateNewCustomer() {
		driver.findElement(newCustomer).click();
		return new NewCustomer(driver);
	}
	
	public void navigateEditCustomer() {
		driver.findElement(editCustomer).click();
	}
	
	public void navigateDeleteCustomer() {
		driver.findElement(deleteCustomer).click();
	}

}
