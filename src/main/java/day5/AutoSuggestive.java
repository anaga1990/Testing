package day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("ben");
		List<WebElement> searchResults = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
		System.out.println(searchResults.size());
		for (WebElement element : searchResults) {
			if (element.getText().equals("Benz Circle, Vijayawada")) {
				element.click();
				break;
			}
		}
		
		driver.findElement(By.id("dest")).sendKeys("ben");
		List<WebElement> destsearchResults = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
		System.out.println(destsearchResults.size());
		for (WebElement element : destsearchResults) {
			System.out.println(element.getText());
			if (element.getText().equals("Bengaluru")) {
				element.click();
				break;
			}
		}
	}
}
