package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//*[@class = 'mmt_header_logo']")
	WebElement logo;
	
	@FindBy(xpath = "//a[@id = 'ch_funnel_more']")
	WebElement morebtn;
	
	@FindBy(xpath = "//a[@id = 'ch_intFlights']")
	WebElement Intlflights;
	
	
	public HomePage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean logovalidation() {
		
		return logo.isDisplayed();
	}
	
	public InternationalFlightsPage navigate() throws IOException {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(morebtn).build().perform();
		Intlflights.click();
		
		return new InternationalFlightsPage();
	}
	
	
}
