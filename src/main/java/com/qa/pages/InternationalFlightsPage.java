package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class InternationalFlightsPage extends TestBase{
	
	

	@FindBy(xpath = "//*[@class = 'input_fromto checkSpecialCharacters ui-autocomplete-input']")
	WebElement frmtofields;
	
	@FindBy(xpath = "//*[@aria-label = 'Top Cities : Singapore, Singapore ']")
	WebElement frmfield;
	
	@FindBy(xpath = "//*[@aria-label = 'Top Cities : London, UK - All Airports ']")
	WebElement tofield;
	
	
	@FindBy(xpath = "//*[@id = 'hp-widget__depart']")
	WebElement departfield;
	
	@FindBy(xpath = "//*[@id = 'searchBtn']")
    WebElement searchbtn;	
	
	
	@FindBy(xpath = "//a[@class = 'btn fli_primary_btn']")
	WebElement BookNowbtn;
	
	
	
	
	
	public InternationalFlightsPage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	

	public InternationalFlightsReviewPage Search() throws IOException {
		
		
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(frmtofields).build().perform();
		frmfield.click();
		
		
		
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(frmtofields).build().perform();
		tofield.click();
		
		Select select3 = new Select(departfield);
		select3.selectByVisibleText("19");
		
		searchbtn.click();
		BookNowbtn.click();
		
		return new InternationalFlightsReviewPage();
		
		
		
	}
	
}



