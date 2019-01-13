package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class InternationalFlightsTravellersPage extends TestBase{
	
	@FindBy(xpath = "//input[@class = 'form-control input-grp-custom  ng-pristine ng-valid']")
	WebElement givennamefield;

	@FindBy(xpath = "//input[@class = 'form-control input-grp-custom hidden-xs  ng-pristine ng-valid']")
	WebElement surnamefield;
	
	@FindBy(xpath = "//a[@class = 'segmented_btn list_view_btn first pull-left col-lg-6 col-md-6 col-sm-6 col-xs-6 ng-pristine ng-valid active']")
	WebElement genderbtn;
	
	@FindBy(xpath = "//*[@class = 'form-control  ng-pristine ng-valid']")
	WebElement mobilenumberfield;
	
	public InternationalFlightsTravellersPage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	

	public void Details(String givenname, String surname, String mobilenum) {
		
		givennamefield.sendKeys(givenname);
		surnamefield.sendKeys(surname);
		genderbtn.click();
		mobilenumberfield.sendKeys(mobilenum);
		
	}
	
}



