package com.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class LoginAndlogOut extends Base{
	
@BeforeSuite


	public void intail()
	{
	Base.intailizeBrowser("chrome");
	}


	
	 @AfterSuite 
	 public void quit() { 
		 signOut(); 
		 driver.quit();
		 }
	 
}
