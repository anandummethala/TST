package com.qa.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.qa.Utils.TestUtils;
import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.InternationalFlightsPage;
import com.qa.pages.InternationalFlightsReviewPage;
import com.qa.pages.InternationalFlightsTravellersPage;

public class InternationalFlightsTest extends TestBase{

	HomePage homepage;
	InternationalFlightsPage intlflightspage;
	InternationalFlightsReviewPage intlflightsreviewpage;
	InternationalFlightsTravellersPage intlflightstravellerspage;
	
	String sheetName = "Flights";
	
	public InternationalFlightsTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setup() throws IOException {
		
		initialization();
		
		homepage = new HomePage();
		
	}
	
	
	@Test(priority = 1)
	public void Test1() throws IOException {
		
		homepage.logovalidation();
		
		intlflightspage = homepage.navigate();
	}
	
	@Test(priority = 2, dataProvider = "TestData")
	public void Test2(String data1) throws IOException {
		
		intlflightspage = homepage.navigate();
		
		intlflightsreviewpage = intlflightspage.Search();
		
		intlflightstravellerspage = intlflightsreviewpage.Review(data1);
		
	}
	
	@Test(priority = 3, dataProvider = "TestData")
	public void Test3(String data1, String data2, String data3, String data4) throws IOException {
		
		intlflightspage = homepage.navigate();
		
		intlflightsreviewpage = intlflightspage.Search();
		
		intlflightstravellerspage = intlflightsreviewpage.Review(data1);
		
		intlflightstravellerspage.Details(data2, data3, data4);
	}
	
	
	@DataProvider
	
	public Object[][] TestData() throws IOException{
		
		
		Object data[][] = TestUtils.getTestData(sheetName);

		return data;
	}
	
	@AfterMethod
	
	public void close() {
		
		driver.close();
	}
}
