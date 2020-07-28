package SeleniumCucumber.pages.module;


import SeleniumCucumber.pages.locators.LoginPageLocators;
import SeleniumCucumber.utilities.SafeActions;
import org.openqa.selenium.WebDriver;


public class LoginPage extends SafeActions implements LoginPageLocators {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void verifyLoginPage(){

        isElementDisplayed(welcomeNote,10);
        System.out.println("Login Page of Orange HRM is displayed");
    }
    public void userLogin(String Username,String Password) {

        safeSendKeys(username,Username,10);
        System.out.println("Entered '"+Username+"' as username");
        safeSendKeys(password,Password,10);
        System.out.println("Entered '"+Password+"' as password");
    }

    public void clickSubmit(){

        try {
            safeClick(login,10);
            System.out.println("User logged in successfully");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}