package SeleniumCucumber.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserSetUpBDD {

    public static WebDriver driver;

    @Before
    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver", "resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        System.out.println("Launched OrangeHRM application successfully");
    }


    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser");

        driver.quit();
        System.out.println("Session ended successfully");
    }

}