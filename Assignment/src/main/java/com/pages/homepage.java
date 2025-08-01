package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.base.TestBase;

public class homepage extends TestBase {
	
	@FindBy(xpath="//*[@id='nav-logo-sprites']")
	WebElement title;
	
	@FindBy(xpath="//div[text()='Let Us Help You']")
	WebElement letUsHelpYou;
	
	@FindBy(xpath="//div[text()='Get to Know Us']")
	WebElement getToKnowUs;
	
	@FindBy(xpath="//div[text()='Make Money with Us']")
	WebElement makeMoneyWithUs;
	
	@FindBy(xpath="//div[text()='Connect with Us']")
	WebElement connectWithUs;
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_5']")
	WebElement bookslink;
	
	@FindBy(linkText="Facebook")
	WebElement facebooklink;
	
	@FindBy(xpath="//a[text()='Instagram']")
	WebElement instagramLink;
	
	@FindBy(xpath="//a[text()='Twitter']")
	WebElement twitterLink;
	
	
	public homepage() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	public instagramPage clickOnInstagramLink() {	
		instagramLink.click();
		return new instagramPage();
	}
	
	public facebookPage clickOnFacebookLink() {
		facebooklink.click();
		return new facebookPage();
	}
	
	public booksPage clickOnBooksLink() {
		
		try {
			 WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("bookslink")));
		} catch (Exception e){
	        e.printStackTrace();
	    }
		bookslink.click();
		return new booksPage();
	}
	
	 public boolean verifyTitle() {	 
         return title.isDisplayed();   
    }
	 
	public boolean verifyConnectWithUs() {
		return connectWithUs.isDisplayed();
	}
	
	public boolean verifyMakeMoneyWithUs() {
		return makeMoneyWithUs.isDisplayed();
	}
	
	public boolean verifyGetToKnowUs() {
		return getToKnowUs.isDisplayed();
	}
	public boolean verifyLetUsHelpYou() {
		return letUsHelpYou.isDisplayed();
	}
	
}
