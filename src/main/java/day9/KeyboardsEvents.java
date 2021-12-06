package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardsEvents {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
	}
	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--disable-extensions");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lenovo");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ARROW_DOWN).perform();
			actions.sendKeys(Keys.ENTER).perform();
			
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
