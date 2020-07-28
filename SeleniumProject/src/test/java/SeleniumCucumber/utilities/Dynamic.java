package SeleniumCucumber.utilities;


import org.openqa.selenium.By;

public class Dynamic
{
	/**
	 * Get dynamic locator resolved to normal one
	 * @param locator - locator that needs to be replaced
	 * @param dynamicText - text that is dynamic in the locator
	 * @return By - new locator after placing required text in the locator string
	 */

	public static By getNewLocator(By locator,String dynamicText)
	{
		String locatorType = locator.toString().split(": ")[0].split("\\.")[1];
		String newLocatorString = String.format(locator.toString().split(": ")[1],dynamicText);
		if ("xpath".equals(locatorType)) {
			locator = By.xpath(newLocatorString);
		} else if ("cssSelector".equals(locatorType)) {
			locator = By.cssSelector(newLocatorString);
		} else if ("id".equals(locatorType)) {
			locator = By.id(newLocatorString);
		} else if ("className".equals(locatorType)) {
			locator = By.className(newLocatorString);
		} else if ("name".equals(locatorType)) {
			locator = By.name(newLocatorString);
		} else if ("linkText".equals(locatorType)) {
			locator = By.linkText(newLocatorString);
		} else if ("partialLinkText".equals(locatorType)) {
			locator = By.partialLinkText(newLocatorString);
		} else if ("tagName".equals(locatorType)) {
			locator = By.tagName(newLocatorString);
		}
		return locator;
	}

	/**
	 *
	 * Get dynamic locator resolved to normal one
	 *
	 * @param locator - locator that needs to be replaced
	 * @param dynamicText - list of dynamic texts that need to be substituted in dynamic locator
	 * @return By - new locator after placing required texts in the locator string
	 */
	public static By getNewLocator(By locator,String... dynamicText)
	{
		String locatorType = locator.toString().split(": ")[0].split("\\.")[1];
		String newLocatorString = String.format(locator.toString().split(": ")[1],dynamicText);
		if ("xpath".equals(locatorType)) {
			locator = By.xpath(newLocatorString);
		} else if ("cssSelector".equals(locatorType)) {
			locator = By.cssSelector(newLocatorString);
		} else if ("id".equals(locatorType)) {
			locator = By.id(newLocatorString);
		} else if ("className".equals(locatorType)) {
			locator = By.className(newLocatorString);
		} else if ("name".equals(locatorType)) {
			locator = By.name(newLocatorString);
		} else if ("linkText".equals(locatorType)) {
			locator = By.linkText(newLocatorString);
		} else if ("partialLinkText".equals(locatorType)) {
			locator = By.partialLinkText(newLocatorString);
		} else if ("tagName".equals(locatorType)) {
			locator = By.tagName(newLocatorString);
		}
		return locator;
	}
}
