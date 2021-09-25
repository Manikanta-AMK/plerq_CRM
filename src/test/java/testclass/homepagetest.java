package testclass;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.HomePage;

import GenricLib.WebDriverCommonLib;
import GenricLib.basetest;
import GenricLib.filelib;

public class homepagetest {

	basetest bt;
	LoginTest lg;
	HomePage hp;
	
	@BeforeTest
	public void initaialmethod() throws Throwable
	{
		bt = new basetest();
		bt.openbrowser();
	}
	
	@Test(priority=1)
	public void login() throws Throwable
	{
		lg = new LoginTest();
		lg.logintest();
	}
	
	@Test(priority=3)
	public void newlead()
	{
		hp.clickOnNewLead();
	}
	
	@Test(priority=2)
	public void verifyhometitle() throws Throwable
	{
		hp = new HomePage();
		 WebElement title = hp.homepageTitle();
		 WebDriverCommonLib wdcl = new WebDriverCommonLib();
		 filelib flib = new filelib();
		 String title2 = wdcl.getElementScreenshot("C:\\Users\\Windows 10\\git\\repository\\zohocrm\\ScreenShot", title);

		if(title2.equals(flib.readpropertydata(title2, "homepagetitle")))
		{
			System.out.println("title is correct");
		}else {
			System.out.println("title is wrong");
		}	
	}
	
	@AfterTest
	public void teardown()
	{
		bt.closebrowser();
	}
}
