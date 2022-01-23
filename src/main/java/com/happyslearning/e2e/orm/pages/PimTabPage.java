package com.happyslearning.e2e.orm.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class PimTabPage {
	public WebDriver driver;

	@FindBy(xpath = "//a[@id='menu_pim_Configuration']")
	WebElement configurationMenu;

	@FindBy(xpath = "//a[@id='menu_pim_listCustomFields']")
	WebElement customFieldsSubMenu;

	@FindBys({ @FindBy(xpath = "//td[@class='tdName tdValue']/a") })
	List<WebElement> resultsList;

	// uses Logout data Start
	@FindBy(xpath = "//a[@id='welcome']")
	WebElement welcomeUserIcon;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logout;
	// uses Logout data End
	
	public void logoutUser() {
		welcomeUserIcon.click();
		logout.click();
	}

	public PimTabPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void customFieldsDetails() {
		configurationMenu.click();
		customFieldsSubMenu.click();
		for (WebElement data : resultsList) {
			System.out.println(data.getText());
		}
	}

}
