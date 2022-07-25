package com.cjc.fk.webapp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.fk.webapp.utility.Common;

public class SerachProduct {
	
	public SerachProduct(WebDriver driver)
	{
		Common.driver=driver;
	}
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement searchClick;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement Product;
	
	public void searchCheck(String product1) throws InterruptedException
	{
		searchClick.sendKeys(product1);
		searchClick.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Product.click();
		Thread.sleep(2000);
	
		Common.driver.navigate().back();
		searchClick.clear();
		Thread.sleep(2000);

	}
}
