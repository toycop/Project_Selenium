package com.application.utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory 
{
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String url)
	{
		
		if(browserName.equals("safari")) 
		{
			
			driver=new SafariDriver();
		}
		else
		{
			System.out.println("We Don't support this browser");
		}
		/*
		if(browserName.equals("Chrome")) 
		{
			//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			driver=new ChromeDriver();
			
			System.out.println("Chrome Driver not Implemented yet");
			
		} 
		else if(browserName.equals("Firefox"))
		{
			//System.setProperty("webdriver.chrome.driver","./Drivers/geckodriver.exe" );
			
			driver=new FirefoxDriver();
			
			System.out.println("Firefox Driver not Implemented yet");
		} 
		else if(browserName.equals("IEBrowser")) 	
		{
			//System.setProperty("webdriver.chrome.driver","./Drivers/IEDriverServer.exe" );
			
			driver=new InternetExplorerDriver();
			
			System.out.println("IE Driver not Implemented yet");
		}
		else
		{
			System.out.println("We Don't support this browser");
		}
		*/
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;	
	}
	
}
