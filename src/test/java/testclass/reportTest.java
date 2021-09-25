package testclass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Loginpage;
import com.pages.reports;

import GenricLib.basetest;
import GenricLib.filelib;

public class reportTest extends basetest{

	Loginpage lp;
	reports r;
	basetest bt;
	filelib flib;
	
	@BeforeTest
	public void initialization() throws Throwable
	{
		bt = new basetest();
		bt.openbrowser();
		flib = new filelib();
		lp=new Loginpage();
		lp.login(flib.readpropertydata(proppath, "username"), flib.readpropertydata(proppath, "password"));
	}
	
	@Test
	public void reportTabTest()
	{
		r = new reports();
		r.clickOnTab();
	}
	
	@AfterTest
	public void teardown()
	{
		bt.closebrowser();
	}
}
