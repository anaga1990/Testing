package com.line.qatest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	@Test(dataProvider = "test1", enabled = false)
	public void f(String user, String pass) {
		System.out.println(user +" : "+pass);
	}

	@DataProvider(name = "test1")
	public Object[][] createData1() {
		return new Object[][] { { "admin", "admin" }, { "admin1", "admin1" } };
	}
	
	@Test(dataProvider = "poiformatedDate", dataProviderClass = com.line.qatest.ExcelUtill.class)
	public void loginTest(String user, String pass) {
		System.out.println(" : "+user +" : "+pass);
	}

}
