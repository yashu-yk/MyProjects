package com.utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	private static Workbook book;
//	private static String sheet_Path = "C:\\Users\\Yashu Kumar\\eclipse-workspace\\Assignment\\src\\main\\java\\com\\testdata\\BrandList.xlsx";
	private static String sheet_Path=System.getProperty("user.dir")+"\\src\\main\\java\\com\\testdata\\BrandList.xlsx";
	public static Object[][] getTestData(String sheetName) 
	{
		Object data[][] = null;
		try {
			FileInputStream fs = new FileInputStream(sheet_Path);
			 book = WorkbookFactory.create(fs);
			Sheet sh1 = book.getSheet(sheetName);
			data = new Object[sh1.getLastRowNum()][sh1.getRow(0).getLastCellNum()];
			System.out.println(sh1.getLastRowNum());
			System.out.println(sh1.getRow(0).getLastCellNum());
			for(int i=0;i<sh1.getLastRowNum();i++)
			{
				for(int j=0;j<sh1.getRow(0).getLastCellNum();j++)
				{
					data[i][j] = sh1.getRow(i+1).getCell(j).toString();
					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}


}
