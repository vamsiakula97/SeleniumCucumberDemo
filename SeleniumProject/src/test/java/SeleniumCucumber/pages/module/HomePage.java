package SeleniumCucumber.pages.module;


import SeleniumCucumber.pages.locators.HomePageLocators;
import SeleniumCucumber.utilities.SafeActions;
import org.openqa.selenium.WebDriver;


public class HomePage extends SafeActions implements HomePageLocators {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }
    public void verifyHomePage(){

        isElementDisplayed(welcomeNote,10);
        System.out.println("Home Page of Orange HRM is displayed");
    }


}