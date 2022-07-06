package com.interviewpractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {

	public static void main(String[] args) {
		
		// 1. How to open a browser in selenium
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");  // old code to open browser
		//WebDriver driver = new ChromeDriver();
		// 2.challenge (SessionNotCreatedException)==> driver version should match with browser version
		
		 WebDriverManager.chromedriver().setup();  // new code to open browser to match driver and browser version.
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");    
	     driver.get("http://automationpractice.com/index.php");
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // wait until HTML page loading //selenuim 3
	    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));// selenium 4
	    // driver.manage().timeouts().scripTimeout(Duration.ofSeconds())
	     
	}

}
