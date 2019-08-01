package selenium;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base;
import com.base.LoginAndlogOut;

import com.objectRepository.GmailLoginObject;
import com.objectRepository.SearchGoogle;
import com.utilities.ExcelRead;

public class Gmail extends LoginAndlogOut {

	@Test(priority = 1)
	public void gmailSearch() throws Exception {
		logger=reports.createTest("gmail search");
		SearchGoogle search = PageFactory.initElements(driver, SearchGoogle.class);
		
		String googlesearch=ExcelRead.getCellData("Gmail",1, 1);
		search.searchGoogleTextBox.sendKeys(googlesearch);
		  search.searchGoogleButton.click(); 
		  search.resultLink.click();
		  search.signIn.click();
		  
		 
	}

	@Test(priority = 2)
	public void login() throws Exception {
		logger=reports.createTest("Draft Message");
		GmailLoginObject sign = PageFactory.initElements(driver, GmailLoginObject.class);
		System.out.println("login");
		Base.swtichTab();
		Base.waitForElement(sign.username);
		String username=ExcelRead.getCellData("Gmail", 4, 1);
		sign.username.sendKeys(username);
		sign.next.click();
		String password=ExcelRead.getCellData("Gmail", 5,1);
		sign.password.sendKeys(password);
		Base.waitForElement(sign.passwordNext);
		

	}	
	
	
	
	
	
	 
	}

