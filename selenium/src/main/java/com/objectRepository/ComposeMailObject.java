package com.objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ComposeMailObject  {

	public WebDriver driver;
	
	public  ComposeMailObject(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath=".//*[@class='gb_x gb_Ea gb_f']")public WebElement myAccount;
	@FindBy(xpath="")public WebElement click;
	@FindBy(xpath="//*[@class='T-I J-J5-Ji T-I-KE L3']") public WebElement Compose;
	@FindBy(xpath="//*[@name='to' and contains(@id,':r')]")public WebElement ToSent;
	@FindBy(xpath="//*[@name='subjectbox']")public WebElement subject;
	@FindBy(xpath="//*[@id=':rz']")public WebElement text;
	@FindBy(xpath = "//*[@class='dC']")public WebElement send;
	@FindBy(xpath="//*[@class='bAq']") public WebElement Message;
	@FindBy(xpath="//*[contains(text(),'Message sent.')]") public WebElement MessageConfirmation;

}