package selenium;



import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Base;
import com.base.LoginAndlogOut;
import com.objectRepository.ComposeMailObject;
import com.utilities.ExcelRead;

public class ComposeMail extends LoginAndlogOut{
	
	 

	@Test(priority = 3)
	public void compose() throws Exception
	{
		logger=reports.createTest("Compose mail");
		for(int i=1;i<=3;i++) 
		{
		  ComposeMailObject sign1=PageFactory.initElements(driver,ComposeMailObject.class);
		  sign1.Compose.click();
		  Base.waitForElement(sign1.ToSent);
		  String toSent=ExcelRead.getCellData("Compose", 1, i);		 
		  sign1.ToSent.sendKeys(toSent);
		  String subject=ExcelRead.getCellData("Compose", 3	,1);
		  sign1.subject.sendKeys(subject);
		  String body=ExcelRead.getCellData("Compose", 6, 1);
		  sign1.text.sendKeys(body);
		  sign1.send.click(); 
		  String message="Sending...";
		  Base.waitForElement(sign1.Message); 
		  String expected=sign1.Message.getText();
		  Assert.assertEquals(message, expected);	
		  
		}
		 
	
	}
	
	
	  @Test(priority=4)
	  public void draft() throws Exception
	  { 
	  ComposeMailObject sign2=PageFactory.initElements(driver,ComposeMailObject.class);
	  sign2.Compose.click(); 
	  Base.waitForElement(sign2.ToSent); 
	  String toSent=ExcelRead.getCellData("Compose", 1, 1); 
	  sign2.ToSent.sendKeys(toSent);
	  String subject=ExcelRead.getCellData("Compose", 3 ,1);
	  sign2.subject.sendKeys(subject); 
	  String body=ExcelRead.getCellData("Compose", 6, 1); sign2.text.sendKeys(body);
	  sign2.close.click();
	  
	  
	  }
	 
}
