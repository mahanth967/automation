package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	
	@FindBy(xpath="//*[@class='gb_xa gbii']") public WebElement Google_Account;
	@FindBy(xpath="//*[@class='gb_Qf gb_jb']/div[2]/a") public WebElement signOut;

}
