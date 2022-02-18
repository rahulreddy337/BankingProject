package com.BankingProject.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BankingProject.pageObjects.LoginPage;
import com.BankingProject.utilities.XLUtil;

public class TC_LoginDDT_002 extends BaseClass
{ 
	@Test(dataProvider ="loginData")
	public void loginDDT(String usr, String pwd)
	{		
		LoginPage lp = new LoginPage(driver);
		lp.getURL();
		logger.info("URL accessed");
		
		lp.getUsername(usr);
		logger.info("Username entered");
		
		lp.getPassword(pwd);
		logger.info("Password entered");
		
		lp.submit();
		
		if(isAlertPresent()==true) 
		{		
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.warn("Login failed");
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("User logged in successfully");
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
	}
	
	public boolean isAlertPresent()
	{
		try {
		driver.switchTo().alert();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	
	@DataProvider(name="loginData")
	String [][] getData() throws IOException
	{
		String path = "C:\\Users\\Jaspreet\\eclipse-workspace\\Mini Project\\BankingProject\\src\\test\\java\\com\\BankingProject\\testData\\DataDrivenTestData.xlsx";
		int rownum = XLUtil.getRowCount(path,"Sheet1");
		int colcount = XLUtil.getCellCount(path, "Sheet1", 1);
		String loginData[][] = new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				loginData[i-1][j]= XLUtil.getCellData(path,"Sheet1",i,j);
			}
		}
		return loginData;
		
	}

}
