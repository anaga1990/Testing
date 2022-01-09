package com.line.extent.reports.indetailed;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportsOfExtentEx4XmlConfigWithCompanyLogo {

	@Test
	public void extentTest() throws IOException {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("ReportsOfExtentWithCompanyLogo.html");
		
		final File CONF = new File("Configuration/extentreport-with-logo-config.xml");
		spark.loadXMLConfig(CONF);
		
		extent.attachReporter(spark);

		// create a test node
		ExtentTest test = extent.createTest("Bank Login");

		test.pass("bank login test started Successfully");
		test.info("url is added");
		test.pass("bank login test completed");

		test = extent.createTest("Manager Test");
		test.skip("create acount");
		test.info("details added");
		test.skip("transfer funds");

		test = extent.createTest("New customer Test");
		test.pass("new customer test started");
		test.pass("add details");
		test.info("missing some mandate fields");
		test.fail("new customer unsuccess");

		test = extent.createTest("edit customer Test");
		test.pass("edit customer started");
		test.info("edit customer success");
		test.pass("edit customer end");

		test = extent.createTest("delete customer Test");
		test.pass("delete customer started");
		test.info("delete customer success");
		test.pass("delete customer end");
		
		extent.flush();
		Desktop.getDesktop().browse(new File("ReportsOfExtentWithCompanyLogo.html").toURI());
	}
}
