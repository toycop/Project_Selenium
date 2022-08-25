package com.application.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{

	Properties pro;
		
	public ConfigDataProvider()
	{
		try
		{
			File src=new File("/Users/sairam/eclipse-workspace/com.mukesh.training/Config/config.properties");
			
			FileInputStream fis=new FileInputStream(src);
			
			pro=new Properties();
			
			pro.load(fis);
			
		}catch(Exception e)
		{
			System.out.println("Failed to Load Config.properties file"+e.getMessage());
		}
	}
	
	/*
	 * public String getConfigData() {
	 * 
	 * }
	 */
	
	public String stagingUrl()
	{
		return pro.getProperty("qaUrl");
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	
		
}
