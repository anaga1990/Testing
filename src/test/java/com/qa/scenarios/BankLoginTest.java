package com.qa.scenarios;

import org.testng.annotations.Test;

import com.qa.page.object.modle.BankLoginPage;


public class BankLoginTest extends BaseTest{
	@Test
	public void bank() {
		logger.info("bankTest started");
		BankLoginPage bankLoginPage = new BankLoginPage();
		bankLoginPage.loginBankApplication(username, password);
		logger.info("login page success");
		
	}
}
