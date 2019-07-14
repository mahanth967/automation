package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.objectRepository.Logout;

public class LoginAndlogOut extends Base{
	



	@BeforeSuite
	public void intail()
	{
	Base.intailizeBrowser("chrome");
	}


	
	
	/*
	 * @AfterSuite public void quit() throws InterruptedException { Logout
	 * log=PageFactory.initElements(driver,Logout.class);
	 * log.Google_Account.click(); log.signOut.click(); Thread.sleep(7000);
	 * 
	 * }
	 */
	 
	 
}
