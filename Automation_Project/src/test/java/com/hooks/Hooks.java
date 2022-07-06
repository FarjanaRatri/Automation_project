package com.hooks;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	

	@Before
	public void initialization() {
		setUp();
		
	}	
	@After
	public void tearDown( ) {
		driver.quit();
	}
	

}
