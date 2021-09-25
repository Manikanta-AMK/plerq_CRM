package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricLib.basetest;

public class HomePage extends basetest {

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New Lead']") WebElement newlead;
	@FindBy(xpath="//div[@class='title']") WebElement title; 
	
	public void clickOnNewLead()
	{
		newlead.click();
	}
	
	public WebElement homepageTitle()
	{
		return title;
	}
}
