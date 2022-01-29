package com.happyslearning.e2e.reports;

//import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class ReportsManagerBasic {
	static ExtentReports extent;

	public static ExtentReports ExtentsReposrtsConfig() {

		try {
			extent = new ExtentReports();
			// xml reports configuration
			final File CONF = new File("./src/test/resources/spark-config.json");
			ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
			spark.loadJSONConfig(CONF);
			extent.attachReporter(spark);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return extent;
	}
	
	public static void repoartsGen() {
		extent.flush();
		
	}

	public static void customs() {

		try {
			ExtentReports extent = new ExtentReports();

			// java code
			// spark.config(ExtentSparkReporterConfig.builder().theme(Theme.DARK).documentTitle("MyReport").build());

			// xml reports configuration
			final File CONF = new File("./src/test/resources/spark-config.json");
			ExtentSparkReporter spark = new ExtentSparkReporter("spark/sparkCustoms.html")
					.viewConfigurer().viewOrder().as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST,
							ViewName.AUTHOR, ViewName.DEVICE, ViewName.EXCEPTION, ViewName.LOG, ViewName.CATEGORY })
					.apply();

			spark.loadJSONConfig(CONF);
			extent.attachReporter(spark);

			extent.createTest("my extents reports").assignAuthor("nagarjuna").assignDevice("Jenkins")
					.assignCategory("sanity")
					.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!")
					.log(Status.FAIL, "element not click able at this posint")
					.log(Status.SKIP, "dependency test no exuected");

			extent.createTest("my extents reports1").assignAuthor("sangemash").log(Status.PASS,
					"This is a logging event for MyFirstTest, and it passed!");

			extent.createTest("my extents reports2").log(Status.PASS,
					"This is a logging event for MyFirstTest, and it passed!");

			extent.createTest("my extents reports3").log(Status.SKIP, "dependency test no exuected");

			extent.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void test() {

		try {
			extent = new ExtentReports();

			// xml reports configuration
			final File CONF = new File("./src/test/resources/spark-config.json");
			ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
			spark.loadJSONConfig(CONF);
			extent.attachReporter(spark);

			extent.createTest("my extents reports")
					.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!")
					.log(Status.FAIL, "element not click able at this posint")
					.log(Status.SKIP, "dependency test no exuected");

			extent.createTest("my extents reports1").log(Status.PASS,
					"This is a logging event for MyFirstTest, and it passed!");

			extent.createTest("my extents reports2").log(Status.PASS,
					"This is a logging event for MyFirstTest, and it passed!");

			extent.createTest("my extents reports3").log(Status.SKIP, "dependency test no exuected");

			extent.flush();
			//  to open reports automatically once test execution over
			// Desktop.getDesktop().browse(new File("target/Spark.html").toURI());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		test();
		//customs();
	}
}
