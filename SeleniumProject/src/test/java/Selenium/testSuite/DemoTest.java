package Selenium.testSuite;

import Selenium.pages.module.AdminPage;
import Selenium.pages.variables.CommonVariables;
import Selenium.utilities.DataProviderClass;
import org.testng.annotations.Test;


public class DemoTest extends CommonVariables {



	@Test(dataProvider="ApplicationAccess",dataProviderClass= DataProviderClass.class)
	public void tc_OpenApplication(String url,String username,String password){


		//Accessing the application using user credentials
		applicationLogin(url,username,password);

	}

	@Test(dataProvider="ApplicationAccess",dataProviderClass= DataProviderClass.class)
	public void tc_UpdateGeneranalInformation(String url,String username,String password){

		//Accessing the application using user credentials
		applicationLogin(url,username,password);

		AdminPage adminPage=new AdminPage(driver);

		//Selection of Required Section Page
		adminPage.selectSectionOfAdmin(module_name,sub_module_name,section);

		//Verifying Section Page is Displayed or not
		adminPage.verifySectionPage(section,module_name);

		//Updating and Saving the fields in the Section Page
		adminPage.clickButton(editButton);
		adminPage.updateDetails(newData, inputForNewData);
		adminPage.clickButton(saveButton);

		//refreshing the webpage to reflect the updations done on Section Page
		driver.navigate().refresh();

		//Validating the Updated fields
		adminPage.validateUpdatedInformation(newData, inputForNewData);

	}
}
