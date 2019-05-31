package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginObject {
	@FindBy(xpath = ".//*[@class='rFrNMe KSczvd uyaebd vHVGub zKHdkd sdJrJc Tyc9J']") public WebElement username;
	@FindBy(xpath="..//*[@class='ZFr60d CeoRYc']")public WebElement next;
	@FindBy(xpath = ".//*[@name='password']") public WebElement password;
	@FindBy(xpath=".//*[@class='ZFr60d CeoRYc']")public WebElement SignIn;
	

}
