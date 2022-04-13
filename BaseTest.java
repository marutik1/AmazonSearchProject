package com.mp.prj.TestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BaseTest 
{
	protected WebDriver driver;
	
	@BeforeSuite
	public void openingBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "src//driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
