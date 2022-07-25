package com.cjc.DWS.webapp.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.DWS.webapp.utility.Common;

public class Page2_Login {

	public Page2_Login(WebDriver driver)
	{
		Common.driver=driver;
	}
	
	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement em;
	
	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement ps;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement login;
	
	public void loginCheck() throws IOException
	{
		FileInputStream fis=Common.proload();
		Common.pro.load(fis);
		em.sendKeys(Common.pro.getProperty("Email"));
		ps.sendKeys(Common.pro.getProperty("Password"));
		login.click();
	}
	
	
}
