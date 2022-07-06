package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.pagefactory.PageFactoryElements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunction extends BaseClass {
	
	PageFactoryElements pf;
	
	@Given("User can open any browser")
	public void user_can_open_any_browser() {
		
		pf = PageFactory.initElements( driver, PageFactoryElements.class);
	    
	}

	@Given("User is able to enter {string} url")
	public void user_is_able_to_enter_url(String url) {
		driver.get(url);
		
	      
	}

	@When("User clicks on the Login in botton")
	public void user_clicks_on_the_login_in_botton() {
		pf.getLogin().click();
	   
	    
	}

	@When("user enters email {string} and password {string}")
	public void user_enters_email_and_password(String email, String password) {
		pf.getEmail().sendKeys(email);
		pf.getPassword().sendKeys(password);
	   
	    
	}

	@When("User clicks on Sign in botton")
	public void user_clicks_on_sign_in_botton() {
		pf.getSignin().click(); 
	   
	    
	}

	@Then("User is able to verify successful login & verify page title")
	public void user_is_able_to_verify_successful_login_verify_page_title() {
		System.out.println("The title of the website is:"+ driver.getTitle());
	   
		
	    
	}


}
