package com.happyslearning.e2e.Guru99.telecom.pages;

import org.testng.annotations.Test;

import com.happyslearning.e2e.base.BrowserManager;
import com.happyslearning.e2e.unti.PropsMgr;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class AddTariffPlanToCustomerPageTest {

	private WebDriver driver;
	BrowserManager browserManager = new BrowserManager();

	@Test(groups = {"addplanToCus"})
	public void addTariffPlanToCustomerTest() {
		TeleComHomePage teleComHomePage = new TeleComHomePage(driver);
		AddTariffPlanToCustomerPage addTariffPlanToCustomerPage = teleComHomePage.navigateToAddTariffPlanToCustomer();
		String actualMesage = addTariffPlanToCustomerPage
				.addTariffPlanToCustomerSim(PropsMgr.getProp("customerId"));
		System.out.println(actualMesage);
	}

	@BeforeMethod
	public void preCondition() {
		driver = browserManager.startTheBrowser();
		browserManager.openApplication();
		System.out.println("driver seesion id from preCondition : " + driver);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("afterMethod executed successfully");
	}

}
