package com.application.utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper 
{
	// Screenshots, alerts, frames, windows, sync issues, javascript Executor
	

	
	public static void captureScreenShots(WebDriver driver)
	{
		try
		{
		File src=((TakesScreenshot)driver)
				.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("./Screenshots/"+"report: "+getCurrentDateTime()+".png"));
		}
		catch(Exception e)
		{
			System.out.println("Failed to capture screenshot(s)"+e.getMessage());
		}
		
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentDate=new Date();
		
		return customFormat.format(currentDate);
	}
}
