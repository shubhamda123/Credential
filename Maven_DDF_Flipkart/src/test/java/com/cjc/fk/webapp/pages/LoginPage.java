package com.cjc.fk.webapp.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.fk.webapp.test.FlipkartTest;
import com.cjc.fk.webapp.utility.Common;

public class LoginPage {
	
	static Logger log=Logger.getLogger(FlipkartTest.class.getName());
	public LoginPage(WebDriver driver)
	{
		Common.driver=driver;
	}
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement user;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement pass;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement login;
	
	public void login() throws IOException
	{
		String un= Common.excel_Username();
		 String ps=Common.excel_Password();
		 log.info("username="+un);
		 log.info("Password="+ps);
		 
		 user.sendKeys(un);
		 pass.sendKeys(ps);
		 login.click();
		 
		 
	}
	
	
	
	
	
	
	
	

}
