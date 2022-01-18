package parallel;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.core.DriverManager;
import com.qa.util.ConfigManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksManager {
	private DriverManager driverManager;
	private WebDriver driver;
	private ConfigManager configManager;
	Properties prop;

	@Before(order = 0)
	public void launchBrowser() {
		configManager = new ConfigManager();
		prop = configManager.initProperties();
		String browserName = prop.getProperty("browser");
		driverManager = new DriverManager();
		driver = driverManager.initWebBrowser(browserName);
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.close();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenShotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);
		}
	}

}
