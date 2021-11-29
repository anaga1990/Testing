package day7;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsEx {
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
		System.out.println(mainWindow);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		while (iterator.hasNext()) { //false
			String childWindow = iterator.next();
			System.out.println(" : windowname:**: "+childWindow );
			if (!(childWindow.equals(mainWindow))) {
				driver.switchTo().window(childWindow);
			}
		}
		System.out.println(" X page url : "+driver.getCurrentUrl());
		System.out.println(" X page title: " +driver.getTitle());
		driver.close();
		driver.switchTo().window(mainWindow);
		
		System.out.println(" XX page url : "+driver.getCurrentUrl());
		System.out.println(" XX page title: " +driver.getTitle());
		driver.quit();
	}
}
