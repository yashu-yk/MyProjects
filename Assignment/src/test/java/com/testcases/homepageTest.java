package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.base.TestBase;
import com.pages.homepage;
import com.relevantcodes.extentreports.ExtentReports;
import com.utils.CustomListener;

@Listeners(CustomListener.class)

	public class homepageTest extends TestBase {
	homepage HomePage;
	
	public homepageTest() {
		super();
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) {
		initialization(browser);
		HomePage=new homepage();
		}
	
	@Test(priority=1)
	public void verifyTitleTest() {
		try {
			Assert.assertTrue(HomePage.verifyTitle());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void takeScreenshoTest2() {
		try {
			Assert.assertEquals(false, true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void verifyConnectWithUsTest() {
		try {
			Assert.assertTrue(HomePage.verifyConnectWithUs());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void verifyMakeMoneyWithUsTest() {
		try {
			Assert.assertTrue(HomePage.verifyMakeMoneyWithUs());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void verfiyLetUsHelpYouTest() {
		try {
			Assert.assertTrue(HomePage.verifyLetUsHelpYou());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void verifyGetToKnowUs() {
		try {
			Assert.assertTrue(HomePage.verifyGetToKnowUs());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
}
