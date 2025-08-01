package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class dataProviderPage extends TestBase{

	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	public WebElement searchBar;
	
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	public WebElement clickButton;
	
	WebDriver driver;
	public dataProviderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
