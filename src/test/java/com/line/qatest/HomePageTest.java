package com.line.qatest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.line.base.E2eCoreApi;
import com.line.pom.AdminTabPage;
import com.line.pom.HomePage;
import com.line.pom.LeaveTabPage;
import com.line.pom.LoginPage;
import com.line.pom.PimTabPage;

public class HomePageTest extends E2eCoreApi {
	public WebDriver driver;
	LoginPage loginPage;
	HomePage homepage;
	AdminTabPage adminTabPage;
	PimTabPage pimTabPage;
	LeaveTabPage leaveTabPage;
	private Logger logs = LogManager.getLogger(HomePageTest.class);
	public String shot= new Throwable().getStackTrace()[0].getMethodName();

	@BeforeMethod
	public void SetUp() {
		driver = initilizeBrowser();
		logs.info("applications url Opend");
	}

	@Test(priority = 1)
	public void adminMenuTest() {
		loginPage = new LoginPage(driver);
		homepage = loginPage.loginAction();
		logs.info("login with user details successfully");
		adminTabPage = homepage.clickonAdminTab();
		logs.info("Admin Menu clicked successfully");
		adminTabPage.logoutUser();
		logs.info("login with user details successfully");
	}

	@Test(priority = 2)
	public void pimMenuTest() {
		loginPage = new LoginPage(driver);
		homepage = loginPage.loginAction();
		logs.info("login with user details successfully");
		pimTabPage = homepage.clickonPimTab();
		logs.info("pim menu clicked successfully");
		pimTabPage.logoutUser();
		logs.info("login with user details successfully");
	}

	@Test(priority = 3)
	public void leaveMenuTest() {
		loginPage = new LoginPage(driver);
		homepage = loginPage.loginAction();
		logs.info("login with user details successfully");
		leaveTabPage = homepage.clickonLeaveTab();
		logs.info("leave menu clciked successfully");
		leaveTabPage.logoutUser();
		logs.info("login with user details successfully");
	}

	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
}
