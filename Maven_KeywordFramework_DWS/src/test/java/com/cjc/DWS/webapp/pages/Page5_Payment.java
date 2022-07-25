package com.cjc.DWS.webapp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.DWS.webapp.utility.Common;

public class Page5_Payment {

	static Logger log=Logger.getLogger(Page5_Payment.class.getName());
	public Page5_Payment(WebDriver driver)
	{
		Common.driver=driver;
	}
	
	 @FindBy(xpath = "//*[@id=\"PickUpInStore\"]")
	 WebElement checkbox;
	 
	 @FindBy(xpath = "//*[@id=\"shipping-buttons-container\"]/input")
	 WebElement continu1;
	 
	 @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
	 WebElement continu2;
	 
	 @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
	 WebElement continu3;
	 
	 @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	 WebElement continu4;
	 
	 @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")
	 WebElement orderno;
	 
	 @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[2]/a")
	 WebElement orderDetails;

	 @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[1]/a[2]")
	 WebElement invoice;
	
	 @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	 WebElement logout;
	
	 public void paymentcheck() throws InterruptedException
	 {
		 Thread.sleep(5000);
		  checkbox.click();
		 continu1.click();
		 Thread.sleep(1000);
		 continu2.click();
		 Thread.sleep(1000);
		 continu3.click();
		 Thread.sleep(1000);
		 continu4.click();
		 Thread.sleep(2000);
		 String ordern=orderno.getText();
		 log.info("order number= "+ordern);
		 orderDetails.click();
		 Thread.sleep(1000);
		 invoice.click();
		 Thread.sleep(3000);
		 logout.click();		
	 }
}
