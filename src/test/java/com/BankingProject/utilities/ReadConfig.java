package com.BankingProject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()   /* Method used to read data from config.properties file */
	{
		File src = new File("./Configuration/config.properties");
		try
		{
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	
	public String getURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getusername()
	{
		String username = pro.getProperty("userID");
		return username;
	}
	
	public String getpassword()
	{
		String password = pro.getProperty("Password");
		return password;
	}
	
	public String getchromeDriverpath()
	{
		String chromeDriverpath = pro.getProperty("chromePath");
		return chromeDriverpath;
	}
	
	public String getfirefoxDriverpath()
	{
		String firefoxDriverpath = pro.getProperty("firefoxPath");
		return firefoxDriverpath;
	}
	
	public String getiepath()
	{
		String iepath = pro.getProperty("iePath");
		return iepath;
	}
	
	
	

}
