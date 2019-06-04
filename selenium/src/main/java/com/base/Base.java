package com.base;

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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveToOffsetAction;
import org.openqa.selenium.support.PageFactory;

import com.objectRepository.GmailLoginObject;

public class Base {
	
	public static WebDriver driver;
	public static Scanner scan;
	public static String browser;
	
	
	
	public static String intailizeBrowser(String browser)
	{
		//System.out.println("Please enter browser name");
		//scan=new Scanner(System.in);
		//browser=scan.nextLine();
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahanth\\eclipse-selenium\\selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		}
		else
		{
			System.out.println("Please select the appropiate browser");
		}
		return browser;		
	}
	
	public static void signOut()
	{
		driver.findElement(By.xpath(".//*[@class='gb_xa gbii']")).click();
		driver.findElement(By.xpath(".//*[@class='gb_0 gb_If gb_Pf gb_pe gb_jb']")).click();
		
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
	
	 public static void mouse(Object WebElement )
	    {
		 //  WebElement=element;
	    	Actions builder=new Actions(driver);
	    	//Action build=builder.moveToElement().bu
	    	
	    }
	
	
	public static void javaScript(String Script) 
	{
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript(Script);
	
		
		
		
	}
	}
	
	


