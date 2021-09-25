package GenricLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class reportListeners implements ITestListener {


	public static ExtentReports extent;
	public static ExtentTest test;
	
	public void onTestStart(ITestResult result) 
	{	
		test = extent.createTest(result.getName());
		test.log(Status.INFO, result.getName()+"method started");
		
	}
	  
	public void onTestSuccess(ITestResult result) 
	{
		test=extent.createTest(result.getName());
		test.pass(MarkupHelper.createLabel("case has passed", ExtentColor.GREEN));	
	}
	 
	public void onTestFailure(ITestResult result) 
	{
		test = extent.createTest(result.getName());
		test.fail(MarkupHelper.createLabel("case has failed", ExtentColor.RED));
		test.fail(result.getThrowable());
	    WebDriverCommonLib wdcl = new WebDriverCommonLib();
	    test.addScreenCaptureFromPath(wdcl.getpageScreenshot(result.getName()));	
	}
	 
	public void onTestSkipped(ITestResult result) 
	{
		test = extent.createTest(result.getName());
		test.skip(MarkupHelper.createLabel("case has skipped", ExtentColor.BLUE));
	    test.skip(result.getThrowable());
	}
	 
	public void onStart(ITestContext context) 
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Windows 10\\git\\repository\\zohocrm\\reports\\TestReports.html");
		
		//customization of view report
		spark.config().setDocumentTitle("plerqCRM");
		spark.config().setReportName("Extent report 1");
		spark.config().setTheme(Theme.STANDARD);
		
		//setting system info
		extent.setSystemInfo("Author", "AMK");
		extent.setSystemInfo("Os", "windows 10");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("TestRunner Name", context.getName());
	}
	 
	public void onFinish(ITestContext context) 
	{
		//writing all logs into report
		extent.flush();
	}

}
