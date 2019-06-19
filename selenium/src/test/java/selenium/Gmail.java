package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.Base;
import com.base.LoginAndlogOut;
import com.objectRepository.GmailLoginObject;
import com.objectRepository.SearchGoogle;

public class Gmail extends LoginAndlogOut{
	
	
	@Test(priority = 1)
    public void gmailSearch()
	{
	SearchGoogle search=PageFactory.initElements(driver, SearchGoogle.class);
	search.searchGoogleTextBox.sendKeys("gmail");
	search.searchGoogleButton.click();
	search.resultLink.click();
	search.signIn.click();

	
	
	}
	
	@Test(priority = 2)
	public void login() throws InterruptedException
	{
		GmailLoginObject sign=PageFactory.initElements(driver, GmailLoginObject.class);
		swtichTab();
	    Thread.sleep(5000);
	
		sign.username.sendKeys("pmahanth967");
		  sign.next.click(); 
		  sign.password.sendKeys("tatadocomo"); 
		  WebDriverWait wait=new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='passwordNext']"))).click();
		  
		 
	}
	
	}


