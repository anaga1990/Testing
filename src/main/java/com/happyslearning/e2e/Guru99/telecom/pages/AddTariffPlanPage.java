package com.happyslearning.e2e.Guru99.telecom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.happyslearning.e2e.unti.Reuse;

public class AddTariffPlanPage {
	private WebDriver driver;

	
	By monthlyRental = By.xpath("//input[@id='rental1']");
	By freeLocalMinutes = By.xpath("//input[@id='local_minutes']");
	By freeInternationalMinutes = By.xpath("//input[@id='inter_minutes']");
	By freeSMSPack = By.xpath("//input[@id='sms_pack']");
	By localPerMinutesCharges = By.xpath("//input[@id='minutes_charges']");
	By InternationalPerMinutesCharges = By.xpath("//input[@id='inter_charges']");
	By sMSPerCharges = By.xpath("//input[@id='sms_charges']");
	By submit = By.xpath("//input[@name='submit']");
	By congratulationYouAddTariff = By.xpath("//h2[normalize-space()='Congratulation you add Tariff Plan']");
	By home=By.xpath("//a[@class='button']");
	
	public AddTariffPlanPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addTariffPlan(String monthlyRentalInRupes, String freeLocalMits, String localPerMinutesChargesInRupes) {
		driver.findElement(monthlyRental).sendKeys(monthlyRentalInRupes);
		Reuse.screeShot(driver);
		driver.findElement(freeLocalMinutes).sendKeys(freeLocalMits);
		Reuse.screeShot(driver);
		driver.findElement(freeInternationalMinutes).sendKeys("100");
		Reuse.screeShot(driver);
		driver.findElement(freeSMSPack).sendKeys("100");
		Reuse.screeShot(driver);
		driver.findElement(localPerMinutesCharges).sendKeys(localPerMinutesChargesInRupes);
		Reuse.screeShot(driver);
		driver.findElement(InternationalPerMinutesCharges).sendKeys("12");
		Reuse.screeShot(driver);
		driver.findElement(sMSPerCharges).sendKeys("1");
		Reuse.screeShot(driver);
		driver.findElement(submit).click();
		Reuse.screeShot(driver);
	}
	
	
	public String getConformation() {
		return driver.findElement(congratulationYouAddTariff).getText().trim().toLowerCase();
	}
	
	public TeleComHomePage navigateToHome() {
		driver.findElement(home).click();
		Reuse.screeShot(driver);
		return new TeleComHomePage(driver);
	}
}
