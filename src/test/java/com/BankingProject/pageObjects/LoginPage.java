package com.BankingProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	//By UserID = By.name("uid");
	//By Password = By.name("password");
	//By Login = By.name("btnLogin");
	//By Logout = By.xpath("/html/body/div[3]/div/ul/li[15]/a");
	
	
	
	public LoginPage(WebDriver driver1)
	{
		driver = driver1;
		PageFactory.initElements(driver1,this); //additional method
	}
	
	//@FindBy(how=How.NAME,using="uid");
	@FindBy(name="uid")
	WebElement UserID;

	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="btnLogin")
	WebElement Login;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement Logout;
	
	public void getURL()
	{
		driver.get("https://demo.guru99.com/v4/");
	}
	
	public void getUsername(String username)
	{
		UserID.sendKeys(username);	
	}
	
	public void getPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void submit()
	{
		Login.click();
	}
	
	public void clickLogout()
	{
		Logout.click();
	}

}
