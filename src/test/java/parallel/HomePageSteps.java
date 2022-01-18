package parallel;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.testng.Assert;

import com.qa.core.DriverManager;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.util.ConfigManager;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	public ConfigManager configManager = new ConfigManager();
	Properties prop = configManager.initProperties();
	private LoginPage loginPage = new LoginPage(DriverManager.getDriver());
	private HomePage homePage;
	private String actualHomepageTitle;
	private String actualUsername;

	@Given("user has alreday logged in to application")
	public void user_has_alreday_logged_in_to_application(DataTable dataTable) {
		List<Map<String, String>> credintial = dataTable.asMaps();
		String userName = credintial.get(0).get("username");
		String pwd = credintial.get(0).get("password");
		DriverManager.getDriver().get(prop.getProperty("base_url"));
		homePage = loginPage.siginToAccount(userName, pwd);
	}

	@Given("User is on HomePage")
	public void user_is_on_home_page() {
		this.actualHomepageTitle = homePage.getTitle();
	}

	@Then("user verify the my account menu")
	public void user_verify_the_my_account_menu(DataTable expectedMenu) {
		List<String> actualMenuItems = homePage.getMenuList();
		System.out.println(actualMenuItems);
		List<String> expectedMenuItems = expectedMenu.asList();
		System.out.println(expectedMenuItems);
		Assert.assertTrue(actualMenuItems.containsAll(expectedMenuItems));
	}

	@Then("check my account menu Sections count should be {int}")
	public void check_my_account_menu_sections_count_should_be(Integer expectedMenusNumber) {
		int actualCount = homePage.getMenuListCount();
		int expectedCount = expectedMenusNumber;
		Assert.assertTrue(actualCount == expectedCount);
	}

	@Then("User logout from HomePage")
	public void user_logout_from_home_page() {
		homePage.signOutAccount();
	}

	@When("click on Admin Menu and click on user management and click on user")
	public void click_on_admin_menu_and_click_on_user_management_and_click_on_user() {
		homePage.navgateToUserSubMenuInAdminMenu();
	}

	@When("serach with username {string}")
	public void serach_with_username(String string) {
		this.actualUsername=homePage.UserSerachAction();
	}

	@Then("verify username Details as {string}")
	public void verify_username_details(String string) {
		Assert.assertEquals(actualUsername, string);
	}

	@Then("user validate the Homepage Title as {string}")
	public void user_validate_the_Homelogin_title_as(String expectedTitle) {
		System.out.println("ActualTitle : " + actualHomepageTitle);
		Assert.assertEquals(expectedTitle, actualHomepageTitle);
	}

}
