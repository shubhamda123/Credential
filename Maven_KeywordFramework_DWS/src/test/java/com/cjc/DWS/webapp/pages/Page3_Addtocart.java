package com.cjc.DWS.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.cjc.DWS.webapp.utility.Common;

public class Page3_Addtocart {
	
	public Page3_Addtocart(WebDriver driver)
	{
		Common.driver=driver;
	}
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
	WebElement book;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	WebElement addCompBook;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")
	WebElement jewelry;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
	WebElement diamondHeart;
	
	@FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
	WebElement shoppingCart;
	
	@FindBy(xpath = "//*[@id=\"CountryId\"]")
	WebElement country;
	
	@FindBy(xpath = "//*[@id=\"termsofservice\"]")
	WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement checkout;
	
	public void addtocartCheck() throws InterruptedException
	{
		book.click();
		addCompBook.click();
		Thread.sleep(2000);
		jewelry.click();
		diamondHeart.click();
		Thread.sleep(5000);
		shoppingCart.click();
		Select s=new Select(country);
		s.selectByVisibleText("India");
		checkbox.click();
		checkout.click();
	}
}
