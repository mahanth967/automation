package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginObject {
	@FindBy(xpath = ".//input[@class='whsOnd zHQkBf']") public WebElement username;
	@FindBy(xpath=".//*[@class='RveJvd snByac']")public WebElement next;
	@FindBy(xpath = ".//*[@name='password']") public WebElement password;
	@FindBy(xpath=".//*[@class='Vwe4Vb MbhUzd']")public WebElement SignIn;
	

}
