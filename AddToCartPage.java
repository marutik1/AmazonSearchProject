package com.mp.prj.TestDemo.WebPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mp.prj.TestDemo.BaseTest;

public class AddToCartPage extends BaseTest
{
	
	 WebElement addtocart= driver.findElement(By.xpath("//input[@id='add-to-cart-button'"));
	 List<WebElement> listItems=driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']"));
	 WebElement itemPriceElement=driver.findElement(By.xpath("//div[@class='a-section a-spacing-none aok-align-center']//span[@class='a-offscreen']"));
	 WebElement qtySelectelement=driver.findElement(By.xpath("//select[@name='quantity']"));
	 
	 public void addToCartItem() 
	 {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement itemElement=listItems.get(1);
		 itemElement.click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 }
	 public float addingQuantites()
		{
		 	String itemPrice= itemPriceElement.getText();
		 	float actualprice= Float.parseFloat(itemPrice.substring(1,itemPrice.length()));
			Select selectQty= new Select(qtySelectelement);
			selectQty.selectByVisibleText("5");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			addtocart.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return actualprice;
			
			
		}
}
