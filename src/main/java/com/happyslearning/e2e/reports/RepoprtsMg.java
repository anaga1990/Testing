package com.happyslearning.e2e.reports;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class RepoprtsMg {
	static ExtentReports extentReport;

	public static ExtentReports reportsConfig() {
		if (Objects.isNull(extentReport)) {
			try {
				String baseProjectPath = System.getProperty("user.dir");
				String reports = baseProjectPath + "/target/TeleComProject.html";
				File xmlConfFile = new File(baseProjectPath + "/src/test/resources/spark-config.xml");
				extentReport = new ExtentReports();
				ExtentSparkReporter spark = new ExtentSparkReporter(reports);
				spark.loadXMLConfig(xmlConfFile);
				extentReport.attachReporter(spark);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return extentReport;
	}
}
