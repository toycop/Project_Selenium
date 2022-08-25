package com.application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;

/**
 * 
 * @author sairam
 *
 * Construtor: LoginPage
 * 
 */

public class LoginPage
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	/**
	 * Page Object Repository
	 */
	
	@FindBy(xpath="//input[@name='txtUsername']") WebElement uname;
	
	@FindBy(xpath="//input[@name='txtPassword']") WebElement pass;
	
	//@FindBy(RelativeLocator.="//input[@value='Login']") WebElement btnLogin;
	
	/**
	 * login() method
	 * @param username
	 * @param Password
	 */
	public void login(String username, String Password)
	{
		uname.sendKeys(username);
		
		pass.sendKeys(Password);
		
		//btnLogin.click();
	}
}
