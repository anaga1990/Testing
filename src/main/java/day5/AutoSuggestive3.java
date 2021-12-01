package day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive3 {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
	}

	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			// Inspect element
			// click on sources tab
			// type  in search bar
			// 'F8' key in keyboard
			// click on elements tab
			//"//div[@class='s-suggestion']/span[2]"
		} finally {
			driver.close();
		} 
	}
}
