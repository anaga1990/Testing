package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement droplocator = driver.findElement(By.id("dropdown-class-example"));
		DropDownEx2.selectDropdownbyIndex(droplocator, 1);
		DropDownEx2.selectDropdownbyIndex(droplocator, 2);
		DropDownEx2.selectDropdownbyIndex(droplocator, 0);
		DropDownEx2.selectDropdownbyVisibleText(droplocator, "Option3");
	}
	
	//generic method to select based on index
	public static void selectDropdownbyIndex(WebElement element, int indexvalue) {
		Select select = new Select(element);
		select.selectByIndex(indexvalue);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	//generic method to select based on VisibleText 
	public static void selectDropdownbyVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
