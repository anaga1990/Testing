package day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.spicejet1.com/323232");
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).sendKeys("ben");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).sendKeys("ben");
		
	}
}
