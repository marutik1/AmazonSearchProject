package com.mp.prj.TestDemo.WebPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.mp.prj.TestDemo.BaseTest;

import junit.framework.Assert;

public class SearchResultPage extends BaseTest
{
    List<WebElement> listItems=driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']"));

	public void validateItemList(String itemName)
	{
    	try
    	{
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		for (int i=0; i<10; i++) 
    		{
			String sortedItemName= listItems.get(i).getText();
			Assert.assertTrue(sortedItemName.toLowerCase().contains(itemName.toLowerCase()));
			System.out.println("The ItemName is Present");
			}
    	}
    	catch (Exception e) 
    	{
    		System.out.println("The ItemName is not Present");	
		}
    	
	}

	
}
