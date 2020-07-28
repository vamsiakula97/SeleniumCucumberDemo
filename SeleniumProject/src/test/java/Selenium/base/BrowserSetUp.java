package Selenium.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BrowserSetUp  {

    public WebDriver driver;


    @BeforeTest
    public void openBrowser(){


        System.setProperty("webdriver.chrome.driver", "resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public  void openApplication(String url)  {
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }


}