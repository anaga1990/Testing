package com.line.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.line.base.E2eCoreApi;


public class AdminTabPage extends E2eCoreApi {

	public WebDriver driver;
	public String dataUsername;
	public String dataEmployeeName;
	public String dataStatus;
	
	@FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
	WebElement userManagementMenu;

	@FindBy(xpath = "//a[@id='menu_admin_Job']")
	WebElement jobMenu;

	@FindBy(xpath = "//a[@id='menu_admin_viewJobTitleList']")
	WebElement viewJobTitleListSubMenu;

	@FindBy(xpath = "//a[@id='menu_admin_workShift']")
	WebElement workShiftSubMenu;
	// end of menus
	
	//uses Logout data Start
	@FindBy(xpath = "//a[@id='welcome']")
	WebElement welcomeUserIcon;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logout;
	//uses Logout data End
	

	// start of user Search Menu
	@FindBy(xpath = "//a[@id='menu_admin_viewSystemUsers']")
	WebElement usersSubMenu;

	@FindBy(xpath = "//input[@id='searchSystemUser_userName']")
	WebElement usernameText;

	@FindBy(xpath = "//select[@id='searchSystemUser_userType']")
	WebElement userRole;

	@FindBy(xpath = "//input[@id='searchBtn']")
	WebElement search;

	@FindBy(xpath = "//table[@id='resultTable']/tbody//td[2]/a")
	WebElement verifyUsername;

	@FindBy(xpath = "//table[@id='resultTable']/tbody//td[4]")
	WebElement verifyEmployeeName;

	@FindBy(xpath = "//table[@id='resultTable']/tbody//td[5]")
	WebElement verifyStatus;

	public AdminTabPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String searchUserAndGetDetails(String userName) {
		userManagementMenu.click();
		getShot(driver);
		usersSubMenu.click();
		getShot(driver);
		usernameText.sendKeys(userName);
		getShot(driver);
		search.click();
		getShot(driver);
		String s1Username = verifyUsername.getText().trim();
		String s1EmployeeName=verifyEmployeeName.getText().trim();
		String s1Status=verifyStatus.getText().trim();
		System.out.println(s1Username+" "+s1EmployeeName+" "+s1Status);
		this.dataUsername=s1Username;
		this.dataEmployeeName=s1EmployeeName;
		this.dataStatus=s1Status;
		getShot(driver);
		return s1Username+":"+s1EmployeeName+":"+s1Status;
	}
	
	public void logoutUser() {
		welcomeUserIcon.click();
		getShot(driver);
		logout.click();
		getShot(driver);
	}
}
