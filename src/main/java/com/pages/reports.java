package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricLib.basetest;

public class reports extends basetest {

	public reports()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='menuOff']  [text()='Reports']") private WebElement reportTab;
	
	public WebElement getReportTab()
	{
		return reportTab;
	}
	
	public WebElement setReportTab()
	{
		return reportTab;
	}
	
	public void clickOnTab()
	{
		reportTab.click();
	}
	
	
}
