package SeleniumCucumber.pages.locators;

import org.openqa.selenium.By;

public interface AdminPageLocators {

	By section  = By.xpath("//*[text()='%s']");
	By sectionByIndex  = By.xpath("(//*[text()='%s'])[%s]");

	By button = By.cssSelector("input[value='%s']");
	By update_data=By.xpath("//label[text()='%s']/following-sibling::input[@type='text']");

	By select_module = By.xpath("//b[text()='%s']");
	By select_sub_module = By.xpath("//a[text()='%s']");
	By general_information = By.xpath("//a[text()='%s");
}
