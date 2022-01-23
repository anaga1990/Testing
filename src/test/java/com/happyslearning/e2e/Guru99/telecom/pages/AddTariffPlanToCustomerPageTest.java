package com.happyslearning.e2e.Guru99.telecom.pages;

import org.testng.annotations.Test;

import com.happyslearning.e2e.base.BrowserManager;
import com.happyslearning.e2e.unti.PropertiesFactory;

import org.testng.annotations.BeforeMethod;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class AddTariffPlanToCustomerPageTest {

	private WebDriver driver;
	BrowserManager browserManager = new BrowserManager();
	String dataFile = "/src/test/resources/testData.properties";
	Properties properties = PropertiesFactory.loadPropertieFile(dataFile);

	@Test(groups = {"addplanToCus"})
	public void addTariffPlanToCustomerTest() {
		TeleComHomePage teleComHomePage = new TeleComHomePage(driver);
		AddTariffPlanToCustomerPage addTariffPlanToCustomerPage = teleComHomePage.navigateToAddTariffPlanToCustomer();
		String actualMesage = addTariffPlanToCustomerPage
				.addTariffPlanToCustomerSim(properties.getProperty("customerId"));
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
