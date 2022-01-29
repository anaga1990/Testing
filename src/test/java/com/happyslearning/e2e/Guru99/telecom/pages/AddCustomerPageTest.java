package com.happyslearning.e2e.Guru99.telecom.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.happyslearning.e2e.base.BrowserManager;
import com.happyslearning.e2e.reports.ReportsManagerBasic;
import com.happyslearning.e2e.unti.PropsMgr;
import com.happyslearning.e2e.unti.RandomDataManager;

public class AddCustomerPageTest {
	private WebDriver driver;
	BrowserManager bb = new BrowserManager();
	ExtentReports extent;
	
	@BeforeSuite
	public void reportsCOnfig() {
		extent = ReportsManagerBasic.ExtentsReposrtsConfig();
		extent.createTest("addCustomerActionTest");
	}
	
	@BeforeMethod
	public void setup() {
		driver=bb.startTheBrowser();
		bb.openApplication();
	}
	
	@Test(groups = {"customer"})
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
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
