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

public class instagramPage extends TestBase{
	
	@FindBy(xpath="//h2[text()='amazondotin']")
	public WebElement instagramPageTitleName;
	
	
	public instagramPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateInstagramPageTitle() {
		try {
			 WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("instagramPageTitleName")));
		} catch (Exception e){
	        e.printStackTrace();
	    }
				return instagramPageTitleName.isDisplayed();
	}
}
