package testclass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LeadPage;

import GenricLib.basetest;

public class LeadPageTest {
	
	basetest bt;
	LeadPage clp;
	LoginTest lp;
	
	@BeforeTest
	public void initialization() throws Throwable
	{
		bt = new basetest();
		bt.openbrowser();	
	}
	
	@Test(priority=1)
	public void login() throws Throwable
	{
		lp = new LoginTest();
		lp.logintest();
	}
	
	@Test(priority=2)
	public void leadmodule()
	{
		clp = new LeadPage();
		clp.lead();
	}
	
	@Test(priority=3)
	public void newleadbutton()
	{
		clp.newleadlink();
	}
	
	
	@AfterTest
	public void teardown()
	{
		bt.closebrowser();
	}
	
	
}
