package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricLib.basetest;

public class LeadPage extends basetest{

	public LeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='menuOn']") WebElement leadmodule;
	@FindBy(xpath="//a[text()='New Lead']") WebElement newLead;
	@FindBy(xpath="//td[text()=' Create Lead\r\n"
			+ "	']")WebElement createnewlead;
	
	
	public void lead()
	{
		leadmodule.click();
	}
	
	public void newleadlink()
	{
		newLead.click();
	}
	
	public void createleadlink()
	{
		createnewlead.getText();
		 
	}
	
}
