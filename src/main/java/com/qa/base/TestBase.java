package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	
	public static WebDriver driver;
	
	public static Properties prop;
	
	
	
	public TestBase() throws IOException {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\MakeMyTrip\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(ip);
	}
	
	
	public void initialization() {
		
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(browsername.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
	}
}
