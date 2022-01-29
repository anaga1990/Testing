package com.happyslearning.e2e.Guru99.telecom.pages;

import org.testng.annotations.Test;

import com.happyslearning.e2e.base.BrowserManager;
import com.happyslearning.e2e.unti.PropsMgr;
import com.happyslearning.e2e.unti.RandomDataManager;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AddTariffPlanPageTest {

	private WebDriver driver;
	BrowserManager browserManager = new BrowserManager();
	String dataFile = "/src/test/resources/testData.properties";

	@Test
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

	@BeforeMethod
	public void preCondition() {
		driver=browserManager.startTheBrowser();
		browserManager.openApplication();
		System.out.println("driver seesion id from preCondition : "+driver);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("afterMethod executed successfully");
	}

}
