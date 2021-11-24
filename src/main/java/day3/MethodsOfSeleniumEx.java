package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfSeleniumEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//click used 
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("hide-textbox")).click();
		driver.close();
		System.out.println("task finished");
		
		
	}
}
