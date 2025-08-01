package com.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.homepage;
import com.pages.instagramPage;
import com.utils.CustomListener;

@Listeners(CustomListener.class)
public class instagramPageTest extends TestBase {

	instagramPage InstagramPage;
	homepage HomePage;
	
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) {
		initialization(browser);
		HomePage=new homepage();
		try {
		InstagramPage=HomePage.clickOnInstagramLink();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void validateInstagramPageTitleTest() throws InterruptedException {
		try {
		Assert.assertTrue(InstagramPage.validateInstagramPageTitle());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
}
