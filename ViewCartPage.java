package com.mp.prj.TestDemo.WebPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mp.prj.TestDemo.BaseTest;

public class ViewCartPage extends BaseTest
{
	 WebElement actualPriceAfterQuantity=driver.findElement(By.xpath("//div[@id='sw-subtotal']/span[2]"));
	 WebElement proceedToBuy=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
	 
	public void actualPriceComparision(float actualPrice)
	{
		float priceAfterQuantity= Float.parseFloat(actualPriceAfterQuantity.getText().substring(1,actualPriceAfterQuantity.getText().length()));
		Assert.assertTrue(actualPrice<priceAfterQuantity);
		proceedToBuy.click();
	}
	 

}
