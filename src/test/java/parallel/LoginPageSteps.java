package parallel;

import java.util.Properties;

import org.junit.Assert;

import com.qa.core.DriverManager;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.util.ConfigManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private LoginPage loginPage = new LoginPage(DriverManager.getDriver());
	public ConfigManager configManager = new ConfigManager();
	Properties prop = configManager.initProperties();
	private HomePage homePage;

	@Given("user should be login page")
	public void user_should_be_login_page() {
		DriverManager.getDriver().get(prop.getProperty("base_url"));
	}

	@When("user provide Email address {string} and Password {string}")
	public void user_provide_email_address_and_password(String string, String string2) {
		loginPage.enterUserDetails(string, string2);
	}

	@And("user click on Sigin")
	public void user_click_on_sigin() {
		loginPage.clickOnSigin();
	}


	@But("user verify error {string}")
	public void user_verify_error(String expectedMessage) {
		String actualError = loginPage.getIncorrectMessage();
		System.out.println("actualError is : "+actualError +" : expected Error is : "+expectedMessage);
		Assert.assertTrue(actualError.contains(expectedMessage));
	}
	
	@Then("user validate the loginPage Title as {string}")
	public void user_validate_the_login_title_as(String expectedTitle) {
		String title = loginPage.getTitle();
		System.out.println("expectedTitle : "+ expectedTitle);
		System.out.println("ActualTitle : "+ title);
		Assert.assertEquals(expectedTitle, title);
	}
	
	@And("logout User")
	public void logout_User() {
		homePage.signOutAccount();
	}
}
