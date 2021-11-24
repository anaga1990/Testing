package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); // only chrome, edge, 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Id locator
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // used
		Thread.sleep(3000);
		// Name locator
		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
		Thread.sleep(3000);
		// link text locator
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(3000);
		// partialLinkText locator
		driver.findElement(By.partialLinkText("Packages")).click();
		System.out.println("done");
		Thread.sleep(10000);
		driver.close();
		
	}
}
