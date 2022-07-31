package com.application.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.application.pages.LoginPage;
import com.application.utilities.BrowserFactory;

public class LoginTestCRM 
{
	WebDriver driver;
	
	LoginPage loginPage;
	
	@Test
	public void loginApp()
	{
		
		BrowserFactory.startApplication(driver, "safari", "https://www.freecrm.com/index.html");
		
		loginPage= PageFactory.initElements(driver, LoginPage.class);
		
	}

	
}
