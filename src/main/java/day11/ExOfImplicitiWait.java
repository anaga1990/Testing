package day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExOfImplicitiWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); 
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='feature__chapter__buttons']/div[1]/a[1]/span[2]")).click();
		System.out.println(driver.getTitle()+"==> after clicked on creat an account");
		driver.findElement(By.id("firstName")).sendKeys("nagarjuna");
		driver.findElement(By.id("lastName")).sendKeys("Annabathinababuex");
		driver.findElement(By.id("username")).sendKeys("nagarjuna.Annabathinababuex.Annabathinababuex");
		driver.findElement(By.name("Passwd")).sendKeys("Test1234$");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Test1234$");//30 seconds
		//locator = By.locater("ConfirmPasswd") //id,name, classname, xpath,css,linktext,tagname
		//webelement = driver.findElement(By.name("ConfirmPasswd"))
		WebDriverWait driverWait = new WebDriverWait(driver, 31); 
		driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("ConfirmPasswd"))));
	}
}
