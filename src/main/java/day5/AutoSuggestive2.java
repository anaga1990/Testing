package day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive2 {
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
			driver.get("https://www.google.co.in/");
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
			List<WebElement> searchResults = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
			System.out.println(searchResults.size());
			for (WebElement element : searchResults) {
				System.out.println(element.getText());
			}
			System.out.println("################### 2nd loop ############################");
			for (WebElement element : searchResults) {
				System.out.println(element.getText());
				if (element.getText().equalsIgnoreCase("SELENIUM interview questions")) {
					element.click();
					break;
				}
			}

		} finally {
			driver.close();
		} 
	}
}
