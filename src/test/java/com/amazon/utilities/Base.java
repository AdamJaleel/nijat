package com.amazon.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	//have a protected driver
	protected WebDriver driver;
	//start the driver here
	//@BeforeMethod runs before every test method
	@BeforeMethod
	public void setUp(){
		String browser = "chrome";
		//switch case
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		if(driver!= null){
			driver.close();
		}
	}
	//close the driver here
	
	
	
	
	
	
}
