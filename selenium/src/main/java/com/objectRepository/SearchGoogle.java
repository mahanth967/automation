package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchGoogle {
	
	@FindBy(xpath=".//*[@class='gLFyf gsfi']")public WebElement searchGoogleTextBox;
	@FindBy(xpath=".//input[@name='btnK']")public WebElement searchGoogleButton;
	@FindBy(xpath=".//h3[@class='LC20lb']")public WebElement resultLink;
	@FindBy(xpath=".//li[@class='h-c-header__nav-li g-mail-nav-links'][2]/a") public WebElement signIn;
	

}

