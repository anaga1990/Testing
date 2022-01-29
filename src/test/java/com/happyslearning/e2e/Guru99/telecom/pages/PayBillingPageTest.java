package com.happyslearning.e2e.Guru99.telecom.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.happyslearning.e2e.base.BrowserManager;
import com.happyslearning.e2e.unti.PropsMgr;

public class PayBillingPageTest {
	private WebDriver driver;
	BrowserManager browserManager = new BrowserManager();
	String dataFile = "/src/test/resources/testData.properties";

	@Test(dependsOnGroups = {"customer","addplanToCus"})
	public void  payBillingPageTestMethod() {
		TeleComHomePage teleComHomePage = new TeleComHomePage(driver);
		PayBillingPage payBillingPage=teleComHomePage.navigateToPayBilling();
		payBillingPage.payBilling(PropsMgr.getProp("customerId"));
		List<String> data = payBillingPage.getBillingDetails();
		String customerId = data.get(0);
		String actualTotalAmount=data.get(1);
		System.out.println("customerId is --> "+customerId);
		System.out.println("actualTotalAmount is --> "+actualTotalAmount);
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
