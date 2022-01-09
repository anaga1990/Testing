package com.line.extent.reports.indetailed;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportsOfExtentOnlyFaildTestS {

	@Test
	public void extentTest() throws IOException {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Sparkv5Json.html");
		ExtentSparkReporter failedReport = new ExtentSparkReporter("failed_Sparkv5Json.html").filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		ExtentSparkReporter failedAndSkipedReport = new ExtentSparkReporter("failed_and_Skiped_Sparkv5Json.html").filter().statusFilter().as(new Status[] {Status.FAIL, Status.SKIP}).apply();
		final File CONF = new File("Configuration/spark-config.json");
		spark.loadJSONConfig(CONF);
		
		/*
		 * spark.config().setTheme(Theme.DARK);
		 * spark.config().setDocumentTitle("Non-RegrationTestReport");
		 * spark.config().setReportName("ExtentReportV2");
		 */
		extent.attachReporter(spark, failedReport, failedAndSkipedReport);

		// create a test node
		ExtentTest test = extent.createTest("Bank Login").assignAuthor("nagarjuna/a1002889").assignCategory("sanity")
				.assignCategory("non-regression").assignDevice("chrome 96");

		test.pass("bank login test started Successfully");
		test.info("url is added");
		test.pass("bank login test completed");

		test = extent.createTest("Manager Test").assignAuthor("nagarjuna/a1002889").assignCategory("regression");
		test.skip("create acount");
		test.info("details added");
		test.skip("transfer funds");

		test = extent.createTest("New customer Test").assignAuthor("venu/a1002001").assignCategory("regression").assignDevice("chrome 96");;
		test.pass("new customer test started");
		test.pass("add details");
		test.info("missing some mandate fields");
		test.fail("new customer unsuccess");

		test = extent.createTest("edit customer Test").assignAuthor("venu/a1002001").assignCategory("regression");
		test.pass("edit customer started");
		test.info("edit customer success");
		test.pass("edit customer end");

		test = extent.createTest("delete customer Test").assignAuthor("venu/a1002001").assignCategory("regression");
		test.pass("delete customer started");
		test.info("delete customer success");
		test.pass("delete customer end");

		test = extent.createTest("new Account Test").assignAuthor("nagarjuna/a1002889").assignCategory("regression");
		test.pass("add new acount started");
		test.info("account number not matched");
		test.fail("add new acount unsuccess");

		test = extent.createTest("edit Account Test").assignAuthor("nagarjuna/a1002889").assignCategory("sanity");
		test.pass("edit Account started");
		test.info("none");
		test.fail("edit Account end");

		test = extent.createTest("delete Account Test").assignAuthor("nagarjuna/a1002889").assignCategory("sanity");
		test.pass("delete Account stated");
		test.info("delete account completed");
		test.fail("delete Account successfully end");

		test = extent.createTest("mini statement Test").assignAuthor("nagarjuna/a1002889").assignCategory("sanity");
		test.pass("mini statement started");
		test.info("no data");
		test.fail("mini statement failed");

		test = extent.createTest("customised statement Test").assignAuthor("nagarjuna/a1002889").assignCategory("sanity");
		test.pass("customised statement started");
		test.info(" selected customised from and to date for Statement");
		test.pass("customised statement end");
		
		extent.flush();
		Desktop.getDesktop().browse(new File("failed_Sparkv5Json.html").toURI());
		
		//Desktop.getDesktop().browse(new File("failed_and_Skiped_Sparkv5Json.html").toURI());
	}
}
