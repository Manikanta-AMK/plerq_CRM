package GenricLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.common.io.Files;

public class WebDriverCommonLib extends basetest{
	
	
	public void elementStatus(WebElement element, int checkType, String elementName)
	{
		switch(checkType)
		{
		case 1:
			try 
			{
				element.isDisplayed();
				reportListeners.test.info(MarkupHelper.createLabel(elementName+"is displayed", ExtentColor.ORANGE));
			}catch(Exception e) {
				reportListeners.test.info(MarkupHelper.createLabel(elementName+"is displayed", ExtentColor.YELLOW));
			}
			break;
		case 2:
			try {
				element.isEnabled();
				reportListeners.test.info(MarkupHelper.createLabel(elementName+"is enabled", ExtentColor.ORANGE));
			}catch(Exception e)
			{
				reportListeners.test.info(MarkupHelper.createLabel(elementName+"is disabled", ExtentColor.YELLOW));
			}
			break;
		case 3:
			try {
				element.isSelected();
				reportListeners.test.info(MarkupHelper.createLabel(elementName+"is selected", ExtentColor.ORANGE));
			}catch(Exception e)
			{
				reportListeners.test.info(MarkupHelper.createLabel(elementName+"is not selected", ExtentColor.YELLOW));
			}break;
		}
	}
	
	public String getpagetitle()
	{
		return driver.getTitle();
	}
	
	public void verify(String actual, String expected, String Pagetitle)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log(Pagetitle+" is displayed, passed", true);
		
//		if(actual.equals(expected))
//		{
//			Assert.assertTrue(true);
//			reportListeners.test = reportListeners.extent.createTest("verify");
//			reportListeners.test.pass(MarkupHelper.createLabel("is displayed, pass", ExtentColor.GREEN));
//		}else {
//			Assert.assertTrue(false);
//			reportListeners.test = reportListeners.extent.createTest("verify");
//			reportListeners.test.fail(MarkupHelper.createLabel("is not displayed, fail", ExtentColor.RED));
//		}
	}
	
	public void selectOption(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectOption(int index, WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOption(String value, WebElement element )
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String value)
	{
		driver.switchTo().frame(value);
	}
	
	public void switchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public void mouseHover(WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public String getpageScreenshot(String screenshotName)
	{
		TakesScreenshot ts = (TakesScreenshot) basetest.driver; 
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dest="C:\\Users\\Windows 10\\git\\repository\\zohocrm\\ScreenShot"+screenshotName+".png";
		File destination = new File(dest);
		try {
			Files.copy(src, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dest;
	}
	
	public String getElementScreenshot(String path, WebElement element)
	{
//		TakesScreenshot ts =  (TakesScreenshot)basetest.driver;
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	
	public void dropdownenenabled(WebElement element, int elementname)
	{
		if(element.isEnabled())
		{
			Assert.assertTrue(true);
			Reporter.log(elementname+" element is enabled", false);
		}else {
			Assert.assertTrue(false);
			Reporter.log(elementname + " is diabled", true);
		}
	}
}
