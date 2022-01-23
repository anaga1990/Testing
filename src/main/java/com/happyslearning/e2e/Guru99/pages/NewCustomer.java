package com.happyslearning.e2e.Guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomer {
	private WebDriver driver;

	By name = By.xpath("//input[@name='name']");
	By genderMale = By.xpath("//tbody/tr[5]/td[2]/input[1]");
	By genderFeMale = By.xpath("//tbody/tr[5]/td[2]/input[2]");
	By dob = By.xpath("//input[@id='dob']");
	By addr = By.xpath("//textarea[@name='addr']");
	By city = By.xpath("//input[@name='city']");
	By state = By.xpath("//input[@name='state']");
	By zipcode = By.xpath("//input[@name='pinno']");
	By emailid = By.xpath("//input[@name='emailid']");
	By sub = By.xpath("//input[@name='sub']");

	public NewCustomer(WebDriver driver) {
		this.driver = driver;
	}

	public String createNewCustomer(String customerName, String dateOfbirth, String addressData, String newUserEmail) {
		driver.findElement(name).sendKeys(customerName);
		driver.findElement(dob).sendKeys(dateOfbirth);
		driver.findElement(addr).sendKeys(addressData);
		driver.findElement(city).sendKeys("Bangalore");
		driver.findElement(state).sendKeys("KA");
		driver.findElement(zipcode).sendKeys("560036");
		driver.findElement(emailid).sendKeys("nagga.833828383@gmail.com");
		driver.findElement(sub).click();
		String alertConformation = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertConformation;
	}
	

}
