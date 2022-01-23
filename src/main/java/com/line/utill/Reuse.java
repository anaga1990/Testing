package com.line.utill;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.line.base.E2eCoreApi;

public class Reuse extends E2eCoreApi {
	
	public static String genericWindowhandle(WebDriver driver, WebElement element) {

		// Store the ID of the original window
		String originalWindow = driver.getWindowHandle();

		// Check we don't have other windows open already
		assert driver.getWindowHandles().size() == 1;
		// Click the link which opens in a new window
		element.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		// Wait for the new window or tab
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		// Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		return originalWindow;
	}

	public static void selectByVisibleTextFromStaticDropDown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}


	public static void scroolToDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void mouseOverAction(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public static void scrollToElement(WebDriver driver, WebElement element) {
		Coordinates coordinate = ((Locatable) element).getCoordinates();
		coordinate.onPage();
		coordinate.inViewPort();
	}

	public static void scrollToSpecificCoordinates(WebDriver driver, int x_coordinate, int y_coordinate) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollTo(" + x_coordinate + "," + y_coordinate + ")");
	}

	public static void jsClickByElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void jsSendKeys(WebDriver driver, WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + data + "'", element);
	}

	public static void jsClickByLocator(WebDriver driver, By locator) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement toBeClickElement = driver.findElement(locator);
		executor.executeScript("arguments[0].click();", toBeClickElement);
	}

}
