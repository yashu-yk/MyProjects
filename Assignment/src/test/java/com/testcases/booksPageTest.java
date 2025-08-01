package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.booksPage;
import com.pages.homepage;
import com.utils.CustomListener;

@Listeners(CustomListener.class)
public class booksPageTest extends TestBase{
	 homepage HomePage;
	 booksPage BooksPage;
	
	 public booksPageTest() {
			super();
		}
	    @Parameters({"browser"})
		@BeforeMethod
		public void setUp(String browser) {
		 try {
			initialization(browser);
			HomePage=new homepage();
			BooksPage=HomePage.clickOnBooksLink();
		}catch(Exception e) {
			e.printStackTrace();
		}
			}
	@Test
	public void validatebooksLinkTest() {
		try {
		Assert.assertTrue(BooksPage.validatebooksLink());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
}
