package day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarEx6 {

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
		
		// I want click current day +7 days
		String userMonth="aug 2022";
		while (!(driver.findElement(By.xpath("//td[@class='monthTitle']")).getText().equalsIgnoreCase(userMonth))) {
			driver.findElement(By.cssSelector("td[class='next'] button")).click();
		}
		
		/*while (true) {
			WebElement calendarDate = driver.findElement(By.xpath("//td[@class='monthTitle']"));
			String getMonthAndYear=calendarDate.getText();
			if(getMonthAndYear.equalsIgnoreCase(userMonth)) {
				break;
			}else {
				driver.findElement(By.cssSelector("td[class='next'] button")).click();
			}
		}*/
		String UserTodaysDate="24";
		List<WebElement> selectDateDD = driver.findElements(By.xpath("//td[contains(@class,'day')]"));
		System.out.println(selectDateDD.size());
		for (WebElement webElement : selectDateDD) {
			if (webElement.getText().equals(UserTodaysDate)) {
				webElement.click();
			}
		}
	}
}
