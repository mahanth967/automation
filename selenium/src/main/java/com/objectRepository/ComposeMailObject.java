package com.objectRepository;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ComposeMailObject  {

	
	@FindBy(xpath=".//*[@class='gb_x gb_Ea gb_f']")public WebElement myAccount;
	@FindBy(xpath="")public WebElement click;
	@FindBy(xpath="//*[@class='T-I J-J5-Ji T-I-KE L3']") public WebElement Compose;
	@FindBy(xpath="//*[@name='to' and contains(@id,':')]")public WebElement ToSent;
	@FindBy(xpath="//*[@name='subjectbox']")public WebElement subject;
	@FindBy(xpath="//*[@class='Am Al editable LW-avf']")public WebElement text;
	@FindBy(xpath = "//*[@class='dC']")public WebElement send;
	@FindBy(xpath="//*[@class='bAq']") public WebElement Message;
	@FindBy(xpath="//*[contains(text(),'Message sent.')]") public WebElement MessageConfirmation;
    @FindBy(xpath="//*[@id=':no']/td[2]") public WebElement close;
}
