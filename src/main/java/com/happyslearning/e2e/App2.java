package com.happyslearning.e2e;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App2 {

	public static void main(String[] args) throws InterruptedException {

		By numberMustNotBeBlank = By.xpath("//label[@id='message2']");
		By enterYourCustomerID = By.xpath("//input[@id='customer_id']");
		By submit = By.xpath("//input[@name='submit']");
		By addTariffPlanToCustomer = By.xpath(
				"//div[@class='flex-item left']//div//h3//a[@href='assigntariffplantocustomer.php'][normalize-space()='Add Tariff Plan to Customer']");

		By xyz = By.xpath("//h2[normalize-space()='Approved Tariff Plans']");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/telecom/assigntariffplantocustomer.php");
		driver.findElement(enterYourCustomerID).sendKeys("857487");
		driver.findElement(submit).click();
		driver.findElement(xyz).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

	}
}
