package com.cjc.DWS.webapp.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.DWS.webapp.utility.Common;

public class Page1_Register {
	
	static Logger log=Logger.getLogger(Page1_Register.class.getName());
	public Page1_Register(WebDriver driver)
	{
		Common.driver=driver;
	}
	
	@FindBy(xpath = "//*[@id=\"gender-male\"]")
	WebElement gender;
	
	@FindBy(xpath = "//*[@id=\"FirstName\"]")
	WebElement fn;
	
	@FindBy(xpath = "//*[@id=\"LastName\"]")
	WebElement ln;
	
	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement em;
	
	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement pass;
	
	@FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
	WebElement cpass;
	
	@FindBy(xpath = "//*[@id=\"register-button\"]")
	WebElement register;
	
	public void registerCheck() throws IOException
	{
		 String firstname= Common.excel_Firstname();
		 String lastname=Common.excel_Lastname();
		 String email=Common.excel_email();
		 String password=Common.excel_password();
		 String confpass=Common.excel_Confpassword();
		 
		 log.info(firstname);
		 log.info(lastname);
		 log.info(email);
		 log.info(password);
		 log.info(confpass);
		 
		 gender.click();
		 fn.sendKeys(firstname);
		 ln.sendKeys(lastname);
		 em.sendKeys(email);
		 pass.sendKeys(password);
		 cpass.sendKeys(confpass);
		 register.click();
	}
	

}
