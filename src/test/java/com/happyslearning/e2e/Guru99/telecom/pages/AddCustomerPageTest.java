package com.happyslearning.e2e.Guru99.telecom.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.happyslearning.e2e.base.BrowserManager;
import com.happyslearning.e2e.unti.PropertiesFactory;
import com.happyslearning.e2e.unti.RandomDataManager;

public class AddCustomerPageTest {
	private WebDriver driver;
	BrowserManager browserManager = new BrowserManager();
	Properties properties = PropertiesFactory.loadPropertieFile();
	String dataFile = "/src/test/resources/testData.properties";

	@BeforeMethod
	public void preCondition() {
		driver = browserManager.startTheBrowser();
		driver.get(properties.getProperty("baseurl"));
		System.out.println("driver seesion id from preCondition : " + driver);
	}

	@Test(groups = { "customer" })
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
		PropertiesFactory.setProp(dataFile, "customerId", customerId, true);

		Assert.assertEquals(message, "Please Note Down Your CustomerID");
		System.out.println("customerId id : " + customerId);
		teleComHomePage = addCustomerPage.navigateToHome();
	}

	@AfterMethod
	public void closeActions() {
		System.out.println("driver seesion id from closeActions : " + driver);
		driver.quit();

	}

}
