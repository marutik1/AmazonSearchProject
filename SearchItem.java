package com.mp.prj.TestDemo;

import org.testng.annotations.Test;

import com.mp.prj.TestDemo.WebPages.AddToCartPage;
import com.mp.prj.TestDemo.WebPages.HomePage;
import com.mp.prj.TestDemo.WebPages.SearchResultPage;
import com.mp.prj.TestDemo.WebPages.ViewCartPage;

public class SearchItem extends BaseTest
{
	String itemName="Tshirts";
    @Test
	public void itemSearch()
	{
    	HomePage homePage =new HomePage();
    	homePage.itemSearch(itemName);
    	
    	SearchResultPage searchResultPage= new SearchResultPage();
    	searchResultPage.validateItemList(itemName);
    	
    	AddToCartPage addToCartPage =new AddToCartPage();
    	addToCartPage.addToCartItem();
    	float actualPrice = addToCartPage.addingQuantites();
    	
    	ViewCartPage viewCartPage=new ViewCartPage();
    	viewCartPage.actualPriceComparision(actualPrice);
	}
	
}
