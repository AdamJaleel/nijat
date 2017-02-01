package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignInPage {
	
	WebDriver driver;
	
	@Test
	public void titleTest(){
		driver.get("http://www.amazon.com");
	}
	
	

}
