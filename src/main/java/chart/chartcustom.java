package chart;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.Loginpage;

import GenricLib.WebDriverCommonLib;
import GenricLib.basetest;
import GenricLib.reportListeners;

@Listeners(GenricLib.reportListeners.class)
public class chartcustom extends basetest{

	@Test
	public void runreport()
	{
		Loginpage lp = new Loginpage();
		WebDriverCommonLib wdcl = new WebDriverCommonLib();
		
		reportListeners.extent.createTest("runreport").assignAuthor("AMK");
		wdcl.elementStatus(lp.getusername(), 1, "username textbox");
		wdcl.elementStatus(lp.getpassword(), 1, "password textbox");
		wdcl.elementStatus(lp.getsignin(), 1, "signin");
	}
	
}
