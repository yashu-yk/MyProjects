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

public class booksPage extends TestBase {
	
	@FindBy(xpath="//a[@class='nav-a nav-b']")
	WebElement books;
	
	
	public booksPage() {
	
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validatebooksLink() {
		try {
			 WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("books")));
		} catch (Exception e){
	        e.printStackTrace();
	    }
		return books.isDisplayed();
	}
}
