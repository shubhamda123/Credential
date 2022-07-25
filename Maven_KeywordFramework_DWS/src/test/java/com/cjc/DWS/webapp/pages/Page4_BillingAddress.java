package com.cjc.DWS.webapp.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.cjc.DWS.webapp.utility.Common;

public class Page4_BillingAddress {
	
	 public Page4_BillingAddress(WebDriver driver)
		{
			Common.driver=driver;
		}
		 
		 @FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]")
		 WebElement country;
		 
		 @FindBy(xpath = "//*[@id=\"BillingNewAddress_City\"]")
		 WebElement city;
		 
		 @FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
		 WebElement add;
		 
		 @FindBy(xpath = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
		 WebElement zip;
		 
		 @FindBy(xpath = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
		 WebElement phno;
		 
		 @FindBy(xpath = "//*[@id=\"BillingNewAddress_FaxNumber\"]")
		 WebElement fax;
		
		@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/input")
		WebElement contin;
	
		public void billingCheck() throws IOException
		{
			FileInputStream fis=Common.proload();
			Common.pro.load(fis);
			
			Select s=new Select(country);
			s.selectByVisibleText(Common.pro.getProperty("Country"));
			city.sendKeys(Common.pro.getProperty("City"));
			add.sendKeys(Common.pro.getProperty("Address"));
			zip.sendKeys(Common.pro.getProperty("Zip/Postal"));
			phno.sendKeys(Common.pro.getProperty("Phone"));
			fax.sendKeys(Common.pro.getProperty("Fax"));
			contin.click();
		}
}
