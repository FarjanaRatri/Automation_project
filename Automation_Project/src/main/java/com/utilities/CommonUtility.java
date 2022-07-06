package com.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;

public class CommonUtility extends BaseClass {
	
	public static WebElement getExplicitWait(WebElement elem, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elem));
		return element;
		
	}
	
	
}
