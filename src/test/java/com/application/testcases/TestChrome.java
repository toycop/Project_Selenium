package com.application.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestChrome 
{
	
	public static void main(String[] args) {

		  //System.setProperty("webdriver.gecko.driver","/Users/sairam/Downloads/geckodriver");

	       WebDriver driver=new FirefoxDriver(); // place the geckodriver.exe file in /usr/local/bin folder

	       driver.manage().window().maximize();

	       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	       driver.get("https://www.google.com");

	       System.out.println("FF Browser Opened successfully");
	       
	       driver.quit();

	   }
}
