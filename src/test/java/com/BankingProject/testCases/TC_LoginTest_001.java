package com.BankingProject.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BankingProject.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void Login_Test()
	{
		LoginPage lp = new LoginPage(driver);
		lp.getURL();
		logger.info("URL accessed");
		
		lp.getUsername(userID);
		logger.info("Username entered");
		
		lp.getPassword(Password);
		logger.info("Password entered");
		
		lp.submit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Logged in successfully");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login failed");
		}
		
}

}

