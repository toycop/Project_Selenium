package com.application.pages;


//import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.application.utilities.BrowserFactory;
import com.application.utilities.ConfigDataProvider;
import com.application.utilities.ExcelDataProvider;
import com.aventstack.extentreports.ExtentReports;


public class BaseClass 
{
	
	public WebDriver driver;
	
	public ExtentReports report;
	
	public ExcelDataProvider excel;
	
	public ConfigDataProvider config;
	
	
	@BeforeSuite
	public void setUpSuite()
	{
		
		report=new ExtentReports();
		
		excel=new ExcelDataProvider();
		
		config=new ConfigDataProvider();
	}
	
	
	
	/**
	 * This method will be initialized/triggered before any test case starts execution
	 */
	
	
	@BeforeClass
	public void setUp()
	{
		
		//Reporter.log("Base Class : Triggered setUp() method started Here ...", true);
		
		//logger=Logger.getLogger("Project_Name");
		
		//PropertyConfigurator.configure("log4j.properties");
		
		driver=BrowserFactory
				.startApplication(driver, config.getBrowser(), config.stagingUrl()); 
		
		//Reporter.log("Base Class : setUp() method completed Here ...", true);
		
	}	
	
	
	/**
	 * This method will be initialized/triggered after the test case completes execution
	 */
	
	
	  @AfterClass public void tearDown() 
	  { 
		  Reporter.log("Base Class: Triggered tearDown()method Started.................Here"
				  ,true);
	  
	  driver.quit();
	  
	  Reporter.log("********Browser Session Ended********", true); }
	 

}
