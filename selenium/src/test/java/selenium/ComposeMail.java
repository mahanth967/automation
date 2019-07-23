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
		  ComposeMailObject sign1=PageFactory.initElements(driver,ComposeMailObject.class);
		  
		  sign1.Compose.click();
		  Base.waitForElement(sign1.ToSent);
		  int ColNum=2;
		  String toSent=ExcelRead.getCellData("Compose", 1, ColNum);
		  
		 
		  System.out.println("No of Counts:"+ColNum);
		  sign1.ToSent.sendKeys(toSent);
		  String subject=ExcelRead.getCellData("Compose", 3	,1);
		  sign1.subject.sendKeys(subject);
		  String body=ExcelRead.getCellData("Compose", 6, 1);
		  sign1.text.sendKeys(body);
		  sign1.send.click(); 
		  String message="Sending...";
		  Base.waitForElement(sign1.Message); String expected=sign1.Message.getText();
		  Assert.assertEquals(message, expected);	
		 
	
	}
	
	 @DataProvider(name = "getData")
	   public Object[][] getData() throws Exception 
	   { 
	   String SheetName="Compose"; 
	   int row=ExcelRead.getRows(SheetName);
	   int col=ExcelRead.getColumns(SheetName);
	   System.out.println(row);
	   System.out.println(col);
	  Object[][] data=new Object[row][col]; 
	  for(int rownum=0;rownum<row;rownum++) 
	  { 
	  for (int colNum=0;colNum<col;colNum++) 
	  {
	  data[rownum][colNum]=ExcelRead.getCellData(SheetName,rownum,colNum);
	   } 
	   } 
	   return data;
	  }

}
