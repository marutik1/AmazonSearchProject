package com.mp.prj.TestDemo.WebPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.mp.prj.TestDemo.BaseTest;

public class HomePage extends BaseTest
{
	WebElement searchTextbox=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

	public void itemSearch(String itemName)
	{
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Hi " +itemName+" searching here");
		searchTextbox.sendKeys(itemName);
		searchTextbox.sendKeys(Keys.ENTER);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   // 	driver.findElement(By.className("_bXVsd_image_1pfbQ")).click();
    	
	}

}
