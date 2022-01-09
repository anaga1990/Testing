package com.line.qatest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.line.base.E2eCoreApi;
import com.line.pom.AdminTabPage;
import com.line.pom.HomePage;
import com.line.pom.LoginPage;

public class AdminMenuPageTest extends E2eCoreApi {
	public WebDriver driver;
	LoginPage loginPage;
	HomePage homepage;
	AdminTabPage adminTabPage;
	private Logger logs = LogManager.getLogger(AdminMenuPageTest.class);
	public String shot= new Throwable().getStackTrace()[0].getMethodName();

	@Test
	public void userDetailsVaidation() {
		loginPage = new LoginPage(driver);
		homepage = loginPage.loginAction();
		logs.info("login with user details successfully");
		adminTabPage = homepage.clickonAdminTab();
		logs.info("Admin menu clicked successfully");
		String data=adminTabPage.searchUserAndGetDetails(props.getProperty("username"));
		logs.info("user details fetched from Admin:user management:user page successfully");
		String[] getdata= data.split(":");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(getdata[0], props.getProperty("username"));
		sa.assertEquals(getdata[2], "Enabled");
		adminTabPage.logoutUser();
		logs.info("from adminTabPage logout successfully");
		sa.assertAll();
	}


	@BeforeMethod
	public void SetUp() {
		driver = initilizeBrowser();
		logs.info("applications url Opend");
	}

	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
	
}
