package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.objectRepository.GmailLoginObject;
import com.utilities.ExcelRead;

public class Base {
	
	public static WebDriver driver;
	public static Scanner scan;
	public static String browser;
	public static FileInputStream fis;
	public static String fi;
	public static String gmail="C:\\Users\\Mahanth\\Desktop\\Automation\\Test Data\\Gmail.xlsx";
	public static ExtentReports reports;
	public static ExtentHtmlReporter extenthttp;
	public ExtentTest logger;
	public static ExcelRead excel=new ExcelRead();
	public static String DateName=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
	
	
	public static void  setExtent()
	{
	extenthttp=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/extentreports/"+DateName+"extent.html"));
	extenthttp.config().setDocumentTitle("Gmail Automation");// Title of the document name
	extenthttp.config().setReportName("Functional Report");
	extenthttp.config().setTheme(Theme.STANDARD);
	reports=new ExtentReports();
	reports.attachReporter(extenthttp);
	
	reports.setSystemInfo("Rosurce Name", "Mahanth");
	
	
	
	}

	
	
	public static WebDriver intailizeBrowser(String browser)
	{
			
    if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahanth\\eclipse-selenium\\selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		}
		else 
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		}
		else
		{
			System.out.println("Please select the appropiate browser");
		}
    return driver;
			
	}
	
    
	public static void swtichTab()
	{
		String parentWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
	    Iterator<String> ite=windows.iterator();
	    while (ite.hasNext()) {
			String child = ite.next();
			if(!parentWindow.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				
			}
			
		}
	}
	

	
	
	public static void waitForElement(WebElement element) 
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		
	}
	
	/*
	 * public static void waitForElementvisibility(WebElement element, String text)
	 * { WebDriverWait wait1=new WebDriverWait(driver, 30);
	 * wait1.until(ExpectedConditions.textToBePresentInElement(element, text)); }
	 */
	
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException
	{
		File utilsfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"/screenshots/"+screenshotName+DateName+".png";
		File finaldestination=new File(destination);
		FileUtils.copyFile(utilsfile, finaldestination);
		return destination;
	}


}
	
	


