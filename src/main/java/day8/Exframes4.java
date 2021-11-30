package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exframes4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		driver.switchTo().frame(1); // high or parent frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"))); // nested or child frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		
	}
}
