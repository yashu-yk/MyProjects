package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class facebookPage extends TestBase {

	@FindBy(xpath="//h1[text()='Amazon India']")
	WebElement facebookPageTitleName;
	
	
	public facebookPage() {
	
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateFacebookPageTitle() {
		
	return facebookPageTitleName.isDisplayed();
	}
}
