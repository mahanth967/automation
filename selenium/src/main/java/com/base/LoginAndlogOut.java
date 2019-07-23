package com.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.Status;
import com.objectRepository.Logout;

public class LoginAndlogOut extends Base{
	

	@BeforeSuite
	public WebDriver intail()
	{
	WebDriver driver=Base.intailizeBrowser("chrome");
	return driver;
	}

	@BeforeTest
	public void extent()
	{	
		Base.setExtent();
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.log(Status.FAIL, "Test Case Failed iS"+ result.getName());
			logger.log(Status.FAIL, "Test Case Failed iS"+ result.getThrowable());
			String screenshotPath=Base.getScreenshot(driver, result.getName());
			logger.addScreenCaptureFromPath(screenshotPath);
			
			
		}
		else
			if(result.getStatus()==ITestResult.SKIP)
			{
				logger.log(Status.SKIP, "Test Case Skip iS"+ result.getName());
			}
			else
				if(result.getStatus()==ITestResult.SUCCESS)
				{
					logger.log(Status.PASS, "Test Case Pass iS"+ result.getName());
				}
	}
	
	
	@AfterTest
	public void endExtent()
	{
		reports.flush();
	}
	
	/*
	 * @AfterSuite public void quit() throws InterruptedException { Logout
	 * log=PageFactory.initElements(driver,Logout.class);
	 * log.Google_Account.click(); log.signOut.click(); Thread.sleep(7000);
	 * 
	 * }
	 */
	 
	 
}
