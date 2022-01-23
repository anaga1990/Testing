package com.happyslearning.e2e.Guru99.telecom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.happyslearning.e2e.unti.Reuse;

public class TeleComHomePage {
	private WebDriver driver;

	By addCustomer = By.xpath(
			"//div[@class='flex-item left']//div//h3//a[@href='addcustomer.php'][normalize-space()='Add Customer']");
	By addTariffPlan = By.xpath("//a[normalize-space()='Add Tariff Plan']");
	By addTariffPlanToCustomer = By.xpath(
			"//div[@class='flex-item left']//div//h3//a[@href='assigntariffplantocustomer.php'][normalize-space()='Add Tariff Plan to Customer']");
	By payBilling = By
			.xpath("//div[@class='flex-item right']//div//h3//a[@href='billing.php'][normalize-space()='Pay Billing']");

	public TeleComHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public AddCustomerPage navigateToAddCustomer() {
		driver.findElement(addCustomer).click();
		Reuse.screeShot(driver);
		Reuse.adCloseAction(driver);
		Reuse.screeShot(driver);
		return new AddCustomerPage(driver);
	}

	public AddTariffPlanPage navigateToAddTariffPlan() {
		driver.findElement(addTariffPlan).click();
		Reuse.screeShot(driver);
		Reuse.adCloseAction(driver);
		Reuse.screeShot(driver);
		return new AddTariffPlanPage(driver);
	}

	public AddTariffPlanToCustomerPage navigateToAddTariffPlanToCustomer() {
		Reuse.screeShot(driver);
		driver.findElement(addTariffPlanToCustomer).click();
		Reuse.screeShot(driver);
		Reuse.adCloseAction(driver);
		Reuse.screeShot(driver);
		return new AddTariffPlanToCustomerPage(driver);
	}

	public PayBillingPage navigateToPayBilling() {
		Reuse.screeShot(driver);
		driver.findElement(payBilling).click();
		Reuse.screeShot(driver);
		Reuse.adCloseAction(driver);
		Reuse.screeShot(driver);
		return new PayBillingPage(driver);
	}

	public String getTitle() {
		return driver.getTitle();
		//title=Guru99 Telecom
	}
	
	
}
