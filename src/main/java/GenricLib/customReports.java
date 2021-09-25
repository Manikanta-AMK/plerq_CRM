package GenricLib;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class customReports {

//	@Test
	public void runReporter()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Windows 10\\git\\repository\\zohocrm\\reports\\myReports.html");
		ExtentReports repo=new ExtentReports();
		repo.attachReporter(spark);
		ExtentTest test = repo.createTest("LoginTest");
		test.log(Status.PASS, "pass");
		repo.flush();
	}
	
	@Test
	public void runreporter2()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("c:\\users\\windows 10\\git\\repository\\Zohocrm\\reports\\BugReport.html");
		ExtentReports repo = new ExtentReports();
		repo.attachReporter(spark);
		ExtentTest test= repo.createTest("Logintest").assignAuthor("AMK").assignCategory("smokeTest").assignDevice("windows10_Chrome");
	    
		test.log(Status.PASS, "pass");
		repo.flush();
	}
	
}
