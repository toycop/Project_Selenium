package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.application.utilities.BrowserFactory;
import com.application.utilities.ExcelDataProvider;

public class BaseClass 
{
	
	public WebDriver driver;
	
	public ExcelDataProvider excel;
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel=new ExcelDataProvider();
	}
	
	
	/**
	 * This method will be initialized/triggered before any test case starts execution
	 */
	@BeforeClass
	public void setUp()
	{
		
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://www.freecrm.com/index.html"); 
		
	}
		
	
	/**
	 * This method will be initialized/triggered after the test case completes execution
	 */
	@AfterClass
	public void tearDown(WebDriver driver)
	{
		driver.quit();
	}

}
