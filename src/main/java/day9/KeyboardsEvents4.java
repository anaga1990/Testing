package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardsEvents4 {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
	}
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		try {
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--disable-extensions");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://text-compare.com/");
			driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hi, welcome to evening batch");
			
			Actions actions = new Actions(driver); 
			
			//ctrl + a
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("a");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			Thread.sleep(2000);
			//ctrl +c
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("c");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			Thread.sleep(2000);
			//tab
			actions.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			//ctrl + v
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("v");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			System.out.println("Jobs Success");
			
		} finally {
			try {
				Thread.sleep(4000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.close();
		} 
	}
}
