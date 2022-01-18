package com.qa.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;
	
	By userProfile = By.xpath("//a[@id='welcome']");
	By signout = By.xpath("//a[normalize-space()='Logout']");
	
	By menuList = By.xpath("//ul[@id='mainMenuFirstLevelUnorderedList']/li/a/b");
	
	//admin menu
	By AdminMenu = By.xpath("//b[normalize-space()='Admin']");
	By userManagement = By.xpath("//a[@id='menu_admin_UserManagement']");
	By user = By.xpath("//a[@id='menu_admin_viewSystemUsers']");
	By usernameSerach = By.id("searchSystemUser_userName");
	By serachButton = By.id("searchBtn");
	By getAdminDetails = By.xpath("//td[@class='left']/a");
	//My Info
	By myInfoMenu = By.xpath("//b[normalize-space()='My Info']");
	By firstname = By.id("personal_txtEmpFirstName");
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		System.out.println("LoginPage driver : "+ driver);
	}
	
	
	public void navgateToUserSubMenuInAdminMenu() {
		driver.findElement(AdminMenu).click();
		driver.findElement(userManagement).click();
		driver.findElement(user).click();
	}
	public String UserSerachAction() {
		driver.findElement(usernameSerach).sendKeys("Admin");
		driver.findElement(serachButton).click();
		String userName = driver.findElement(getAdminDetails).getText();
		return userName;
	}
	
	public List<String> getMenuList() {
		List<String> lists = new ArrayList<>();
		List<WebElement> menuItems=driver.findElements(menuList);
		for (WebElement ele : menuItems) {
			String eachMenuItem = ele.getText();
			lists.add(eachMenuItem);
		}
		return lists;
	}
	
	public int getMenuListCount() {
		List<WebElement> menuItems=driver.findElements(menuList);
		return menuItems.size();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String myInfo() {
		driver.findElement(myInfoMenu).click();
		String employeeName = driver.findElement(firstname).getAttribute("value");
		return employeeName;
	}
	
	public void signOutAccount() {
		driver.findElement(userProfile).click();
		driver.findElement(signout).click();
	}
}
