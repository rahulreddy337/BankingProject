package com.BankingProject.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.BankingProject.pageObjects.AddNewCustomer;
import com.BankingProject.pageObjects.LoginPage;

public class TC_AddNewCustomer_003 extends BaseClass{
	
	@Test
	public void addCustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.getURL();
		lp.getUsername(userID);
		lp.getPassword(Password);
		lp.submit();
		
		Thread.sleep(3000);
		
		AddNewCustomer anc = new AddNewCustomer(driver);
		anc.clickNewCustomer();
		anc.addCustomer("Rahul");
		anc.selectGender("male");
		anc.addDateOfBirth("001995", "12", "09");
		anc.addAddress("2 Eva Road");
		anc.addCity("Etobicoke");
		anc.addState("Ontario");
		anc.addPincode("500076");
		anc.addMobilenumber("6478927893");
		anc.addEmail("rahulQA@eshipper.com");
		anc.addPassword("admint7102");
		anc.AddCustSubmit();
		
		if(driver.getPageSource().contains("Customer Registered Successfully!!!"))
		{
			logger.info("Customer Registered Successfully");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Customer Creation failed");
			Assert.assertTrue(false);
		}
		
		
	}

}
