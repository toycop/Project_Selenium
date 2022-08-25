package com.application.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.application.pages.BaseClass;
import com.application.pages.LoginPage;
import com.application.utilities.BrowserFactory;
import com.application.utilities.Helper;


public class TC_Login_Valid_Credentials extends BaseClass
{	
	LoginPage loginPage;
	
	@Test(description="This LoginApp() method will check login functionality")
	public void loginApp()
	{
	
		//System.out.println("TestCase starts here");
		
		//Reporter.log("TC_Login_Valid: Test case execution started here", true);
		
		//System.out.println("Execution 1");
		
		//System.out.println("Execution 2");
		
		//System.out.println("Execution 3");
		
		//Reporter.log("TC_Login_Valid: Test case execution Ends here", true);
		
		//loginPage= PageFactory.initElements(driver, LoginPage.class);
		
		//loginPage.login("Admin", "admin");
		
		Helper.captureScreenShots(driver);
	}

	
}
