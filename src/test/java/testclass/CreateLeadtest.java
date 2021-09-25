package testclass;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.CreateLead;
import com.pages.HomePage;
import com.pages.Loginpage;

import GenricLib.basetest;
import GenricLib.filelib;

public class CreateLeadtest extends basetest {

	basetest bt;
	CreateLead cl;
	Loginpage lp;
	filelib flib;
	HomePage hp;
//	Logger lg = Logger.getLogger(CreateLeadtest.class);
	
	
	@BeforeTest
	public void intialization() throws Throwable
	{
		bt = new basetest();
		bt.openbrowser();
//		lg.info("abcd");
		
	}
	
	@Test(priority=1)
	public void login() throws Throwable
	{
		lp = new Loginpage();
		flib = new filelib();
		lp.login(flib.readpropertydata(proppath, "username"), flib.readpropertydata(proppath, "password"));
	}
	
	@Test(priority=2)
	public void newlead()
	{
		hp = new HomePage();
		hp.clickOnNewLead();
		
	}
	
	@Test(priority=3)
	public void passcompanyname() throws Throwable
	{
		cl =new CreateLead();
//		cl.details(prop.getProperty("E:\\Eclipse\\ARMCRM\\data\\config.properties", "companyname"), prop.getProperty("E:\\Eclipse\\ARMCRM\\data\\config.properties", "leadname"));
		cl.details(flib.readpropertydata(proppath, "companyname"), flib.readpropertydata(proppath, "leadname"));
		
	}
	
	@AfterTest
	public void teardown()
	{
	    driver.quit();	
	}
	
	
}
