package com.line.qatest;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.line.base.E2eCoreApi;
import com.line.pom.LoginPage;

public class LoginTest2 extends E2eCoreApi{
	public WebDriver driver;
	
	private Logger logs = LogManager.getLogger(LoginTest2.class);
	@BeforeMethod
	public void setup() {
		driver = initilizeBrowser();
		logs.info("applications url Opend");
	}
	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginWithmultiuserData(null, null);
	}
	
	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
}
