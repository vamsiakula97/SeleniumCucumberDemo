package SeleniumCucumber.pages.module;


import SeleniumCucumber.pages.locators.AdminPageLocators;
import SeleniumCucumber.utilities.Dynamic;
import SeleniumCucumber.utilities.SafeActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;





public class AdminPage extends SafeActions implements AdminPageLocators {
	public WebDriver driver;

	public AdminPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	public void selectSectionOfAdmin(String Module, String SubModule, String SectionName) {

		safeMouseOverAndClickElement(Dynamic.getNewLocator(section,Module), 10);
		safeMouseOverAndClickElement(Dynamic.getNewLocator(section,SubModule), 10);
		try {
			safeClick(Dynamic.getNewLocator(section,SectionName), 10);
			System.out.println("Selected "+SectionName+" page under "+SubModule+" module of "+Module+" tab");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void verifySectionPage(String Title, String Module) {

		isElementDisplayed(Dynamic.getNewLocator(sectionByIndex,Title,"2"), 10);
		System.out.println("" + Title + " Page of " + Module + " tab of Orange HRM is displayed");
	}

	public void clickButton(String Button)  {
		try {
			safeClick(Dynamic.getNewLocator(button,Button), 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void updateDetails(String New_Data,String Input_Data){

		safeClear(Dynamic.getNewLocator(update_data,New_Data),10);
		safeSendKeys(Dynamic.getNewLocator(update_data,New_Data),Input_Data,10);
	}

	public void validateUpdatedInformation(String New_Data,String Input_Data){

		String updated_Data=safeGetAttribute(Dynamic.getNewLocator(update_data,New_Data),"value",10);
		Assert.assertTrue(Input_Data.equals(updated_Data));
		System.out.println("Information Updated Successfully");
	}
}
