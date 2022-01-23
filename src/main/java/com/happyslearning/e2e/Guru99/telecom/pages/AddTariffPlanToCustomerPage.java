package com.happyslearning.e2e.Guru99.telecom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.happyslearning.e2e.unti.Reuse;

public class AddTariffPlanToCustomerPage {
	private WebDriver driver;

	By enterYourCustomerID = By.xpath("//input[@id='customer_id']");
	By submit = By.xpath("//input[@name='submit']");

	By approvedPlan = By.xpath("//h2[normalize-space()='Approved Tariff Plans']");
	By addTariffPlantoCustomer = By.xpath("//input[@value='Add Tariff Plan to Customer']");

	By congratulationTariffPlanAss = By.xpath("//h2");

	By home = By.xpath("//a[@class='button']");
	// 857487

	// title=Guru99 Add Tariff Plan to Customer
	public AddTariffPlanToCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	public String addTariffPlanToCustomerSim(String customerID) {
		driver.findElement(enterYourCustomerID).sendKeys(customerID);
		Reuse.screeShot(driver);
		driver.findElement(submit).click();
		Reuse.screeShot(driver);
		driver.findElement(approvedPlan).click();
		Reuse.screeShot(driver);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
		Reuse.screeShot(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.activeElement.click();");
		Reuse.screeShot(driver);
		driver.findElement(addTariffPlantoCustomer).click();
		Reuse.screeShot(driver);
		String confirmationMeesage = driver.findElement(congratulationTariffPlanAss).getText().trim().toLowerCase();
		return confirmationMeesage;
	}

	public TeleComHomePage navigateToHome() {
		driver.findElement(home).click();
		Reuse.screeShot(driver);
		return new TeleComHomePage(driver);
	}
}
