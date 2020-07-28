package SeleniumCucumber.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class DataProviderClass extends SafeActions {
	public WebDriver driver;

	public DataProviderClass(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	@DataProvider(name ="ApplicationAccess")
	public static  Object[][] ApplicationAccess() {
		Object[][] applicationAccess = new Object[1][3];
		applicationAccess[0][0] = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		applicationAccess[0][1] = "Admin";
		applicationAccess[0][2] = "admin123";

		return applicationAccess;
	}
}
