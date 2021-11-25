package day6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarEx7 {

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
		LocalDate date = LocalDate.now();
		LocalDate userDate=date.plusWeeks(30);//yyyy-mm-dd
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM YYYY");
		String userMonth=formatter.format(userDate);
		System.out.println(userMonth+"userMonth");
		
		// I want click current day +7 days
		while (!(driver.findElement(By.xpath("//td[@class='monthTitle']")).getText().equalsIgnoreCase(userMonth))) {
			driver.findElement(By.cssSelector("td[class='next'] button")).click();
		}
		
		formatter = DateTimeFormatter.ofPattern("d");
		String userDay=formatter.format(userDate);
		System.out.println(userDay+" :userDay");
		List<WebElement> selectDateDD = driver.findElements(By.xpath("//td[contains(@class,'day')]"));
		System.out.println(selectDateDD.size());
		for (WebElement webElement : selectDateDD) {
			if (webElement.getText().equals(userDay)) {
				webElement.click();
			}
		}
		
		
	}
}
