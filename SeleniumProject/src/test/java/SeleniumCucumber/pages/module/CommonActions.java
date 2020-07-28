package SeleniumCucumber.pages.module;

import Selenium.base.BrowserSetUp;
import SeleniumCucumber.base.BrowserSetUpBDD;
import org.openqa.selenium.WebDriver;



public class CommonActions extends BrowserSetUp {

    public WebDriver driver;



    public void applicationLogin(String url, String username, String password)  {


        //Laumching the OrangeHRM Application
        openApplication(url);

        HomePage homePage=new HomePage(driver);
        LoginPage loginPage=new LoginPage(driver);

        //Verifying Login Page is Displayed or not
        loginPage.verifyLoginPage();

        //User Login
        loginPage.userLogin(username,password);
        loginPage.clickSubmit();

        //Verifying Home Page is Displayed or not
        homePage.verifyHomePage();

    }

}