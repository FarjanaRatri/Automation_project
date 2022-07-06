package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PageFactoryElements extends BaseClass {
	//Page Factory is a repository used to store all our elements of locator
	//Page Factory uses the encapsulation concepts from java
	//Encapsulation uses private variable, getter and setter method, finish within class
	
	//Create a constructor-
	//A constructor is a special type method that has the same class name as method name
	//A constructor invokes or bring out implicitly or automatically
	
	public PageFactoryElements() {
		PageFactory.initElements( driver ,this);
		}
	
	//We have to use pagefactory annotation to store the elements
	
	@FindBy(xpath = "(//*[@class='css-mx98y1-Text eczcs4p0'])[9]")
	@CacheLookup
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(id = "input-email-address")
	@CacheLookup
    private WebElement email;

	public WebElement getEmail() {
		return email;
	}
    
    @FindBy(id ="input-password")
    @CacheLookup
    private WebElement password;     // variable are private which is encapsulation

	public WebElement getPassword() {     //   method is public so that we can call the method to the step-definition ( getter/ setter method)
		return password;
	}
    
	@FindBy(xpath ="//*[text()='Sign in']")
	@CacheLookup
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}
	
	

}
