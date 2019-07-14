package com.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.base.Base;

public class ExcelRead extends Base{
	public static FileInputStream fis;
	public static  XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row=null;
	public static XSSFCell cell=null;
	
	
	public ExcelRead()
	{
		File file=new File(gmail);
		try {
		 fis=new FileInputStream(file);
		} catch (Exception e) {
			System.out.println("Getting File input stream error");
		}
		try {
			workbook=new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Check the code of workbook and sheets");
		}
		
	}
		public int getRows(String sheetname)
		{
			int index=workbook.getSheetIndex(sheetname);
			if(index <=-1)
			{
				return 0;
			}
			else
			{
				sheet = workbook.getSheetAt(index);
				int number=sheet.getLastRowNum();
				return number;
			}
		}
		
		public int getColumns(String sheetname)
		{
			int index=workbook.getSheetIndex(sheetname);
			if(index<=-1)
			{
				return 0;
			}
			else
			{
				sheet=workbook.getSheetAt(index);
				row=sheet.getRow(0);
				if(row==null)
					return -1;
				
				return row.getLastCellNum();
			}
		}
		
		 public static String getCellData(String sheetName,int RowNum, int ColNum) throws Exception{
			 
		       try{
		    	   DataFormatter formatter = new DataFormatter();
					 sheet=workbook.getSheet(sheetName);
		           String CellData=formatter.formatCellValue(sheet.getRow(RowNum).getCell(ColNum));
		 
		    
		 
		           return CellData;
		 
		           }catch (Exception e){
		 
		         return"";
		 
		           }
		 
		     }
		
	}
	


