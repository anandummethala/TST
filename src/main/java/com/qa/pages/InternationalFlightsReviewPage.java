package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class InternationalFlightsReviewPage extends TestBase{
	
	
	@FindBy(xpath = "//input[@id = 'inputEmailIdForLoggin']")
	WebElement emailaddfield;
	
	@FindBy(xpath = "//a[@class = 'btn btn-lg btn-block btn-primary-red']")
	WebElement ContinueasGuestbtn;
	
	
	
	
	
	public InternationalFlightsReviewPage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	

	public InternationalFlightsTravellersPage Review(String emailid) throws IOException {
		
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("scroll(0,100)");
		
		emailaddfield.sendKeys(emailid);
		
		ContinueasGuestbtn.click();
		
	return new InternationalFlightsTravellersPage();
		
	}
	
}



