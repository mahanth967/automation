package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveToOffsetAction;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.objectRepository.GmailLoginObject;
import com.utilities.ExcelRead;

public class Base {
	
	public static WebDriver driver;
	public static Scanner scan;
	public static String browser;
	public static FileInputStream fis;
	public static String fi;
	public static String gmail="C:\\Users\\Mahanth\\Desktop\\Automation\\Test Data\\Gmail.xlsx";
	
	public static ExcelRead excel=new ExcelRead();


	
	
	public static void intailizeBrowser(String browser)
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
	
	  
	public static void dateStamp()
	{
		Date d=new Date();
		String Screenshot=d.toString().replace(":", "_").replace(" ", "_");
		
	}
	
}
	
	


