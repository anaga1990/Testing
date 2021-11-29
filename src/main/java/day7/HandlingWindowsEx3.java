package day7;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsEx3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(" main page url : "+driver.getCurrentUrl());
		System.out.println(" main page title: " +driver.getTitle());
		driver.findElement(By.id("openwindow")).click();
		System.out.println("after cliked on openwindow");
		String mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String string : windows) {
			if(!(string.equals(mainWindow))){
				driver.switchTo().window(string);
			}
		}
		System.out.println(" X page url : "+driver.getCurrentUrl());
		System.out.println(" X page title: " +driver.getTitle());
		driver.close();
		driver.switchTo().window(mainWindow);
		driver.quit();
	}
}
