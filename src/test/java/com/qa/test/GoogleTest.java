package com.qa.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@BeforeMethod
	void setUp() {
	//	WebDriverManager.chromedriver().setup();
	//	driver = new ChromeDriver();
		
	
		
	   WebDriverManager.firefoxdriver().setup();
	   driver = new FirefoxDriver();
	   driver.get("https://www.google.com/");
		
	//WebDriverManager.edgedriver().setup();
	//driver = new EdgeDriver();

	}
	@Test
	void testTitle() {
		
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Google", title);
	}
	
	@Test
	void testLogo() {
	WebElement logo=	driver.findElement(By.id("hplogo"));
	boolean flag =logo.isDisplayed();
	Assert.assertTrue(flag);

		
	}
	
	
	

	
	@AfterMethod
	void close() {
		driver.close();
		
	}
}
