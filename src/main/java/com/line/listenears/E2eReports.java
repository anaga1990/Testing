package com.line.listenears;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class E2eReports {
	static ExtentReports extentReports;
	private static Logger logs = LogManager.getLogger(E2eReports.class);

	/**
	 * java based ExtentReport
	 */
	public static ExtentReports startJavaExtentReports() {
		if (Objects.isNull(extentReports)) {
			String reportsPath = System.getProperty("user.dir") + "/reports/e2eReport.html";
			logs.info("ExtentReports" + " invoked with " + reportsPath);

			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportsPath);
			sparkReporter.config().setTheme(Theme.DARK);
			sparkReporter.config().setDocumentTitle("Java Extent Report");

			extentReports = new ExtentReports();
			extentReports.attachReporter(sparkReporter);
		}
		return extentReports;
	}

	/**
	 * Json based ExtentReport, title report name and if any theme type changes have
	 * to be updated in JSON files
	 */
	public static ExtentReports startJsonExtentReports() {
		if (Objects.isNull(extentReports)) {
			String reportsPath = System.getProperty("user.dir") + "/reports/e2esonReport.html";
			final File CONF = new File(System.getProperty("user.dir") + "/config/spark-config.json");
			logs.info("ExtentReports" + " invoked with " + reportsPath);
			extentReports = new ExtentReports();
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportsPath);
			try {
				sparkReporter.loadJSONConfig(CONF);
			} catch (IOException e) {
				e.printStackTrace();
			}
			extentReports.attachReporter(sparkReporter);
		}
		return extentReports;
	}

	/**
	 * XML based ExtentReport, title report name and if any theme type changes have
	 * to be updated in XML files
	 */
	public static ExtentReports startXmlExtentReports() {
		if (Objects.isNull(extentReports)) {
			String reportsPath = System.getProperty("user.dir") + "/reports/e2eXmlReport.html";
			final File CONF = new File(System.getProperty("user.dir") + "/config/spark-config.xml");
			logs.info("ExtentReports" + " invoked with " + reportsPath);
			extentReports = new ExtentReports();
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportsPath);
			try {
				sparkReporter.loadXMLConfig(CONF);
			} catch (IOException e) {
				e.printStackTrace();
			}
			extentReports.attachReporter(sparkReporter);
		}
		return extentReports;
	}
}
