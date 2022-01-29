package com.happyslearning.e2e.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.happyslearning.e2e.base.BrowserManager;

public class ListenerManager extends BrowserManager implements ITestListener {
	ExtentReports extentReport;
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		//Start test reports
		System.out.println("onTestStart");
		String currentTest = result.getName();
		String currentTest1 = result.getMethod().getMethodName();
		System.out.println("result.getName() is : "+currentTest);
		System.out.println("result.getMethod().getMethodName() is : "+currentTest1);
		test = extentReport.createTest(currentTest);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		String currentTest = result.getName();
		test.log(Status.PASS, currentTest);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		String currentTest = result.getName();
		test.log(Status.FAIL, currentTest);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
		String currentTest = result.getName();
		test.log(Status.SKIP, currentTest);
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
		//set reports configuration
		extentReport = RepoprtsMg.reportsConfig();
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		extentReport.flush();
		//"/target/TeleComProject.html";
		try {
			Desktop.getDesktop().browse(new File("target/TeleComProject.html").toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
