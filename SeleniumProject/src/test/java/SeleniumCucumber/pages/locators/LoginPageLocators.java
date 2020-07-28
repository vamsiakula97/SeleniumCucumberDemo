package SeleniumCucumber.pages.locators;

import org.openqa.selenium.By;

public interface LoginPageLocators {


	By welcomeNote=By.cssSelector("[id='divLogo']");
	By username=By.cssSelector("[name='txtUsername']");
	By password =By.cssSelector("[name='txtPassword']");
	By login=By.cssSelector("[name='Submit']");
}
