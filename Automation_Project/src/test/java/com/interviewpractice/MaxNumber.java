package com.interviewpractice;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaxNumber {

	public static void main(String[] args) {
		// 11,33,55,66,11,33,55
		
		int [] a= {11,33,55,66,11,33,55};
		int maxNum= Arrays.stream(a).max().getAsInt();
		
	    //System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");  // old code to open browser
		//WebDriver driver = new ChromeDriver();
		//challenge (SessionNotCreatedException)==> driver version should match with browser version
		
		 WebDriverManager.chromedriver().setup();  // new code to open browser to match driver and browser version.
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");          
		 
		 
		 
	}

}
