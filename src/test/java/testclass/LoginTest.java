package testclass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Loginpage;

import GenricLib.basetest;
import GenricLib.filelib;

public class LoginTest extends basetest{

	Loginpage Lp;
	filelib flib;
	basetest bt;
	
	@BeforeTest
	public void initialization() throws Throwable
	{
		basetest bt = new basetest();
		bt.openbrowser();
	}
	
	@Test
	public void logintest() throws Throwable
	{
		
		Lp = new Loginpage();
		flib = new filelib();
		Lp.login(flib.readpropertydata(proppath, "username"),flib.readpropertydata(proppath, "password"));		
	}
	
	@AfterTest
	public void teardown()
	{
		bt.closebrowser();
	}

}
