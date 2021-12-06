package day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardsEvents3 {
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
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lenovo");
			Thread.sleep(3000);
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
			int value = list.size();
			Actions actions = new Actions(driver);
			if (value >4) {
				for (int i = 0; i < 4; i++) {
					actions.sendKeys(Keys.ARROW_DOWN).perform();
					Thread.sleep(1000);
					System.out.println(" if condition run");
				}
			}else {
				for (int i = 0; i < value; i++) {
					actions.sendKeys(Keys.ARROW_DOWN).perform();
					Thread.sleep(1000);
				}
			}
			
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
