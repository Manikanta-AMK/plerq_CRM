package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricLib.basetest;

public class Loginpage extends basetest {

	public  Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userName") WebElement usernameTB;
	@FindBy(id="passWord") WebElement passwordTB;
	@FindBy(xpath="//input[@type='image']") WebElement signinbtn;
	

	public WebElement getusername()
	{
		return usernameTB;
	}
	
	public void setusername(WebElement usernameTB)
	{
		this.usernameTB = usernameTB;
	}
	
    public WebElement getpassword()
    {
    	return passwordTB;
    }
    
    public void setpassword(WebElement passwordTB)
    {
    	this.passwordTB = passwordTB;
    }
    
    public WebElement getsignin()
    {
    	return signinbtn;
    }
	
    public void setsignin(WebElement signinbtn)
    {
    	this.signinbtn = signinbtn;
    }
    
    public void login(String validusername, String validpassword)
    {
    	usernameTB.sendKeys(validusername);
    	passwordTB.sendKeys(validpassword);
    	signinbtn.click();
    }
    
	
	
	
}
