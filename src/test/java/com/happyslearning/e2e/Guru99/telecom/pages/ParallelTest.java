package com.happyslearning.e2e.Guru99.telecom.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.happyslearning.e2e.base.BrowserManager;
import com.happyslearning.e2e.unti.PropsMgr;
import com.happyslearning.e2e.unti.RandomDataManager;

public class ParallelTest {
	private WebDriver driver;
	BrowserManager browserManager = new BrowserManager();

	@BeforeMethod
	public void preCondition() {
		driver = browserManager.startTheBrowser();
		driver.get(PropsMgr.getGlobalProp("baseurl"));
		System.out.println("driver seesion id from preCondition : " + driver);
	}
	
	@Test(priority = 1)
	public void addCustomerActionTest() {
		System.out.println("driver seesion id from addCustomerAction : " + driver);
		TeleComHomePage teleComHomePage = new TeleComHomePage(driver);
		AddCustomerPage addCustomerPage = teleComHomePage.navigateToAddCustomer();
		String address = "Plat No " + RandomDataManager.getRandomNumber(500) + " street "
				+ RandomDataManager.getName(10);
		String mobno = String.valueOf(RandomDataManager.getMobileNumber());
		addCustomerPage.addCustomer(RandomDataManager.getName(10), RandomDataManager.getName(7),
				RandomDataManager.getMailId(), address, mobno);
		List<String> customerIDList = addCustomerPage.getNewlyAddedCustomerId();
		String message = customerIDList.get(0);
		String customerId = customerIDList.get(1);
		PropsMgr.setProp("customerId", customerId);

		Assert.assertEquals(message, "Please Note Down Your CustomerID");
		System.out.println("customerId id : " + customerId);
		teleComHomePage = addCustomerPage.navigateToHome();
	}
	
	@Test(priority = 2)
	public void addTariffPlanTest() {
		TeleComHomePage teleComHomePage = new TeleComHomePage(driver);
		AddTariffPlanPage addTariffPlanPage=teleComHomePage.navigateToAddTariffPlan();
		//(String monthlyRentalInRupes, String freeLocalMits, String localPerMinutesChargesInRupes)
		String monthlyRentalInRupes=String.valueOf(RandomDataManager.getRandomNumber(2222));
		String freeLocalMits=String.valueOf(RandomDataManager.getRandomNumber(2000));
		String localPerMinutesChargesInRupes=String.valueOf(RandomDataManager.getRandomNumber(3));
		addTariffPlanPage.addTariffPlan(monthlyRentalInRupes, freeLocalMits, localPerMinutesChargesInRupes);
		PropsMgr.setProp("monthlyRentalInRupes", monthlyRentalInRupes);
		String actualMessage = addTariffPlanPage.getConformation();
		Assert.assertEquals(actualMessage, "congratulation you add tariff plan");
	}
	
	@Test(priority = 3)
	public void addTariffPlanToCustomerTest() {
		TeleComHomePage teleComHomePage = new TeleComHomePage(driver);
		AddTariffPlanToCustomerPage addTariffPlanToCustomerPage = teleComHomePage.navigateToAddTariffPlanToCustomer();
		String actualMesage = addTariffPlanToCustomerPage
				.addTariffPlanToCustomerSim(PropsMgr.getProp("cccustomerId"));
		System.out.println(actualMesage);
	}
	
	@Test(dependsOnMethods = {"addCustomerActionTest", "addTariffPlanToCustomerTest"})
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
	
	@AfterMethod
	public void closeActions() {
		System.out.println("driver seesion id from closeActions : " + driver);
		driver.quit();

	}

}
