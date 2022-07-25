package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart {
	
public WebDriver driver;
	
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
	WebElement click_item;
	
	@FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
	WebElement addcart;
	
	@FindBy(xpath = "//*[@id=\"cartur\"]")
	WebElement cart;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
	WebElement placeorder;
	
	@FindBy(xpath = "//*[@id=\"name\"]")
	WebElement name;
	
	@FindBy(xpath = "//*[@id=\"country\"]")
	WebElement country;
	
	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement city;
	
	@FindBy(xpath = "//*[@id=\"card\"]")
	WebElement creditCard;
	
	@FindBy(xpath = "//*[@id=\"month\"]")
	WebElement month;
	
	@FindBy(xpath = "//*[@id=\"year\"]")
	WebElement year;
	
	@FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	WebElement purchase;
	
	
	public void selectItem()
	{
		click_item.click();
	}
	
	public void addtocart()
	{
		addcart.click();
	}
	
	public void cart() 
	{
		cart.click();
	}
	
	public void placeOrder() 
	{
		placeorder.click();
	}
	
	public void name(String nm) 
	{
		name.sendKeys(nm);
	}
	
	public void country(String  count)
	{
		country.sendKeys(count);
	}
	
	public void city(String ct)
	{
		city.sendKeys(ct);
	}
	
	public void creditcard(String card)
	{
		creditCard.sendKeys(card);
	}
	
	public void month(String mo)
	{
		month.sendKeys(mo);
	}
	
	public void year(String yr)
	{
		year.sendKeys(yr);
	}
	
	public void purchase()
	{
		purchase.click();
	}
	

}
