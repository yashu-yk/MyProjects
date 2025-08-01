package com.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utils.CustomListener;
import com.utils.ReadingExcel;
import com.base.TestBase;
import com.pages.dataProviderPage;

@Listeners(CustomListener.class)
public class dataProviderPageTest extends TestBase{

	String sheetName="Brands List";
	dataProviderPage DataProviderPage;
	
	
	public dataProviderPageTest() {
		super();
	}
	

	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) {
	 
		initialization(browser);
		DataProviderPage=new dataProviderPage(getDriver());
	}
	
	@Test(dataProvider="getTestData")
	public void data(String brands) {
		try {
		DataProviderPage.searchBar.sendKeys(brands);
		DataProviderPage.clickButton.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@DataProvider()
	public Object[][] getTestData() throws EncryptedDocumentException, IOException {
		Object[][] data = ReadingExcel.getTestData(sheetName);
			return data;
		
	}
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
}
