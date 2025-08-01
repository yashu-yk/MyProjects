package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.facebookPage;
import com.pages.homepage;
import com.utils.CustomListener;

@Listeners(CustomListener.class)
public class facebookPageTest extends TestBase{
	 homepage HomePage;
	 facebookPage FaceBookPage;
	 
	public facebookPageTest() {
			super();
	}
		
		
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) {
		try {
			initialization(browser);
			HomePage=new homepage();
			FaceBookPage=HomePage.clickOnFacebookLink();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
		
		@Test
		public void validateFacebookPageTitleTest() {

			Assert.assertTrue(FaceBookPage.validateFacebookPageTitle());
		}
		
		@AfterMethod
		public void tearDown() {
			getDriver().quit();
		}
}
