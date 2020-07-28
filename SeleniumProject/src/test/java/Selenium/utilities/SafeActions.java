package Selenium.utilities;

import Selenium.base.BrowserSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SafeActions  {
    public WebDriver driver;

    public SafeActions(WebDriver driver){
        this.driver=driver;
    }

    public void safeClick(By locator, double waiting) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, (long) waiting);
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void safeSendKeys(By locator,String keyword,double waiting){
        WebDriverWait wait = new WebDriverWait(driver, (long) waiting);
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(keyword);
    }

    public void safeClear(By locator,double waiting){
        WebDriverWait wait = new WebDriverWait(driver, (long) waiting);
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
    }

    public String safeGetAttribute(By locator,String sAttributeValue,double waiting){
        WebDriverWait wait = new WebDriverWait(driver, (long) waiting);
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        String sValue=element.getAttribute(sAttributeValue);
        return sValue;

    }

    public void isElementDisplayed(By locator,double waiting){
        WebDriverWait wait = new WebDriverWait(driver, (long) waiting);
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.isDisplayed();
    }

    public void safeMouseOverAndClickElement(By locator,double waiting){
        WebDriverWait wait = new WebDriverWait(driver, (long) waiting);
        WebElement HoverElement = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(HoverElement));
        Actions builder = new Actions(driver);
        builder.moveToElement(HoverElement).build().perform();
    }


}
