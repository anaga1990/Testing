package day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestive3 {
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
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
			for (WebElement webElement : list) {
				System.out.println(webElement.getText());
				if (webElement.getText().equals("lenovo ideapad")) {
					webElement.click();
					break;
				}
			}
			System.out.println("Jobs Success");
			
			// Inspect element
			// click on sources tab
			// type  in search bar
			// 'F8' key in keyboard
			// click on elements tab
			//"//div[@class='s-suggestion']/span[2]"
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
