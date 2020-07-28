package SeleniumCucumber.pages.steps;

import SeleniumCucumber.base.BrowserSetUpBDD;
import SeleniumCucumber.pages.module.AdminPage;
import SeleniumCucumber.pages.module.HomePage;
import SeleniumCucumber.pages.module.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class StepDefinitions {

	BrowserSetUpBDD getDriver;
	WebDriver driver;

	public StepDefinitions() {
		this.driver = getDriver.driver;
	}


	HomePage homePage = new HomePage(driver);
	LoginPage loginPage = new LoginPage(driver);
	AdminPage adminPage=new AdminPage(driver);

	//Verifying Login Page is Displayed or not
	@Given("^User is on login page$")
	public void loginPageVerification() {
		loginPage.verifyLoginPage();
	}

	//User Login with username and password
	@When("User enters username as {string} and enters password as {string}")
	public void userLogin(String username, String password) {
		loginPage.userLogin(username, password);
	}

	//User clicks submit button
	@When("^User clicks submit button$")
	public void clickSubmit() {
		loginPage.clickSubmit();
	}

	//Verifying Home Page is Displayed or not
	@Then("^User is redirected to Home Page$")
	public void homePageVerification() {
		homePage.verifyHomePage();
	}

	//Verification of invalid user login
	@Then("User is on login page only")
	public void user_is_on_login_page_only() {
		loginPage.verifyLoginPage();
		System.out.println("User login failed");
	}

	//User Login with username and password using DataTable
	@When("User enters username and password using DataTable")
	public void userLoginUsingDataTable(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		loginPage.userLogin(list.get(0).get("username"), list.get(0).get("password"));
	}

	//Selection and Verification of Required Section Page
	@Given("User is on {string} page under {string} module of {string} tab")
	public void selectSectionOfAdmin(String section, String sub_module_name, String module_name) {
		adminPage.selectSectionOfAdmin(module_name,sub_module_name,section);
		adminPage.verifySectionPage(section,module_name);
	}

	//Clicking of buttons like edit/save
	@When("User clicks {string} button")
	public void clickButton(String Button) {
		adminPage.clickButton(Button);
	}

	//Updating and Saving the fields in the Section Page
	@When("User updates the field {string} with {string}")
	public void updateDetailsOfSectionPage(String newData, String inputForNewData) {
		adminPage.updateDetails(newData, inputForNewData);
	}

	//refreshing the webpage to reflect the updations done on Section Page
	@When("User will refresh the webpage")
	public void refresh() {
		driver.navigate().refresh();
	}

	//Validating the Updated fields in the Section Page
	@Then("User will find the updated field {string} with {string}")
	public void validateUpdatedInformationOfSectionPage(String newData, String inputForNewData) {
		adminPage.validateUpdatedInformation(newData, inputForNewData);
	}
}

