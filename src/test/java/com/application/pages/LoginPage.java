package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	@FindBy(name="username") WebElement uname;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath="//input[@value='Login']") WebElement loginBtn;
	
	
	/**
	 * login() method
	 * @param username
	 * @param Password
	 */
	public void login(String username, String Password)
	{
		uname.sendKeys(username);
		
		pass.sendKeys(Password);
		
		loginBtn.click();
	}
}
