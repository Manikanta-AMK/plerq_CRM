package GenricLib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
public class basetest implements IAutoConst {

	public static WebDriver driver;
	public Properties prop;
	
	public void openbrowser() throws Throwable
	{		
		filelib flib = new filelib();
		prop = new Properties();
		String browserName = flib.readpropertydata(proppath, "browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(chromekey, chromevalue);
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(firefoxkey, firefoxvalue);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		String testurl = flib.readpropertydata(proppath,"url");
		driver.get(testurl);
	
		WebDriverCommonLib wdcl = new WebDriverCommonLib();
		wdcl.verify(wdcl.getpagetitle(), flib.readpropertydata(proppath, "logintitle"), "HomePage");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void closebrowser()
	{
		driver.quit();
	}
}
