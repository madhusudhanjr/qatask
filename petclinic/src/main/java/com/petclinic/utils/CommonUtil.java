package com.petclinic.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * CommonUtil Class is used to keep utility methods used across the project
 * 
 * @author madhusudhan.jr@gmail.com
 */
public class CommonUtil {

	/**
	 * This method is used to wait till the visible of the Element
	 * 
	 * @param driver
	 * @param TimeUnit in sec
	 * @param element
	 */
	public static WebElement explicitWaitTillVisible(WebDriver driver, int sec, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, sec);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method is used to force click on the WebElement using Javascript
	 * Executor
	 * 
	 * @param driver
	 * @param element
	 */
	public static void clickUsginJSExecutor(WebDriver driver, WebElement element) {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	/**
	 * This method is used to select the option from the Combo box WebElement
	 * 
	 * @param driver
	 * @param element
	 */
	public static void selectOptionByVisibleText(WebElement element, String visibleText) {

		Select petType = new Select(element);
		petType.selectByVisibleText(visibleText);
	}

}
