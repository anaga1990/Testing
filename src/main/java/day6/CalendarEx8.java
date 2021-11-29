package day6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarEx8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		LocalDate date = LocalDate.now();
		LocalDate userDate=date.plusWeeks(1);//yyyy-mm-dd  // dd-MMM-YYYY
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
		String usDate=formatter.format(userDate);
		System.out.println(usDate+" usDate");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly')", driver.findElement(By.id("onward_cal")));
		js.executeScript("arguments[0].setAttribute('value','"+usDate+"')",  driver.findElement(By.id("onward_cal")));
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		
		
		
		
		
	}
}
