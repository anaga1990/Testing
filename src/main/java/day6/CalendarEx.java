package day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		
		//int a = 33030;
		WebElement calendarDate = driver.findElement(By.xpath("//td[@class='monthTitle']"));
		System.out.println(calendarDate.getText());
		driver.findElement(By.cssSelector("td[class='next'] button")).click();
		List<WebElement> selectDateDD = driver.findElements(By.xpath("//td[contains(@class,'day')]"));
		System.out.println(selectDateDD.size());
		for (int i = 0; i < selectDateDD.size(); i++) {
			if (selectDateDD.get(i).getText().equals("12")) {
				selectDateDD.get(i).click();
				break;
			}
		}
		//driver.close();
	}
}
