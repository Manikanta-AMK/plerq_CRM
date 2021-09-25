//package testclass;
//
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.ARMCRM.accounts.newAccounts;
//import com.pages.Loginpage;
//
//import GenricLib.basetest;
//import GenricLib.filelib;
//
//public class accountpagetest extends basetest {
//
//	basetest bt;
//	Loginpage lp;
//	filelib flib;
////	newAccounts na;
//	
//	
//	
//	@BeforeTest
//	public void initialization() throws Throwable
//	{
//		bt = new basetest();
//		bt.openbrowser();
//	}
//	
//	@Test(priority=1)
//	public void login() throws Throwable
//	{
//		lp = new Loginpage();
//		flib = new filelib();
//		lp.login(flib.readpropertydata(proppath, "username"), flib.readpropertydata(proppath, "password") );
//	}
//	
//	@Test(priority=2)
//	public void newaccountmethod() throws Throwable
//	{
////		na = new newAccounts();
////		na.ac();
////		na.titleVerifying();
////		na.neA();
////		na.newaccountTitleverify();
////		na.accontname(flib.readexceldata(excelpath, "sheet2", 1, 0), flib.readexceldata(excelpath, "sheet2", 1,1 ), flib.readexceldata(excelpath, "sheet2", 1, 2));
//	}
//	
//	@Test(priority=3)
//	public void ac()
//	{
//		na.ac();
//	}
//	
//	@Test(priority=4)
//	public void verification() throws Throwable
//	{
//		na.titleVerifying();
//	}
//	
//	@Test(priority=5)
//	public void nea()
//	{
//		na.neA();
//	}
//	
////	@Test(priority=6)
////	public void newAV() throws Throwable
////	{
////		na.newaccountTitleverify();
////	}
//	
//	@Test(priority=7)
//	public void acname() throws Throwable
//	{
//		na.accontname(flib.readexceldata(excelpath, "sheet2", 1, 0), flib.readexceldata(excelpath, "sheet2", 1,1 ), flib.readexceldata(excelpath, "sheet2", 1, 2));
//	}
//	
//	@AfterTest
//	public void teardown()
//	{
//		driver.close();
//	}
//	
//}
