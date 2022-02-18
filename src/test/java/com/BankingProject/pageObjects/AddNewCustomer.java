package com.BankingProject.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewCustomer {
	
	WebDriver driver;
	
	public AddNewCustomer(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void clickNewCustomer()
	{
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
	}
	
	public void addCustomer(String custName)
	{
		driver.findElement(By.name("name")).sendKeys(custName);
	}
	
	public void selectGender(String gender)
	{
		if(gender.equalsIgnoreCase("male"))
			driver.findElement(By.xpath("//input[@name='rad1' and @value='m']"));
		else
			driver.findElement(By.xpath("//input[@name='rad1' and @value='f']"));
	}
	
	public void addDateOfBirth(String year, String month, String day)
	{
		driver.findElement(By.name("dob")).sendKeys(year);
		driver.findElement(By.name("dob")).sendKeys(month);
		driver.findElement(By.name("dob")).sendKeys(day);		
	}
	
	public void addAddress(String address)
	{
		driver.findElement(By.name("addr")).sendKeys(address);
	}
	
	public void addCity(String cityName)
	{
		driver.findElement(By.name("city")).sendKeys(cityName);
	}
	
	public void addState(String stateName)
	{
		driver.findElement(By.name("state")).sendKeys(stateName);
	}
	
	public void addPincode(String pincode)
	{
		driver.findElement(By.name("pinno")).sendKeys(pincode);
	}
	
	public void addMobilenumber(String mobilenumber)
	{
		driver.findElement(By.name("telephoneno")).sendKeys(mobilenumber);
	}
	
	public void addEmail(String email)
	{
		driver.findElement(By.name("emailid")).sendKeys(email);
	}
	
	public void addPassword(String custPassword)
	{
		driver.findElement(By.name("password")).sendKeys(custPassword);
	}
	
	public void AddCustSubmit()
	{
		driver.findElement(By.name("Submit")).click();
	}

}
