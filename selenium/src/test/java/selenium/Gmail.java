package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
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
	public void login()
	{
		GmailLoginObject sign=PageFactory.initElements(driver, GmailLoginObject.class);
		rightWindow();
	
		//javaScript("document.getElementById('identifierId').value='pmahanth967';");
		sign.username.sendKeys("pmahanth967");
		  sign.next.click(); 
		  sign.password.sendKeys("tatadocomo"); 
		  sign.SignIn.click();
		 
	}
	
	}

