package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricLib.basetest;

public class CreateLead extends basetest {

	public CreateLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='property(Company)']") WebElement companyname;
	@FindBy(xpath = "//input[@name='property(Last Name)']") WebElement Leadname;
	@FindBy(xpath="//input[@value='Save']") WebElement savebtn;
	
	public void details(String cmpname, CharSequence ln)
	{
		companyname.sendKeys(cmpname);	
		Leadname.sendKeys(ln);
		savebtn.click();
	}

}
