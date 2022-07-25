package com.cjc.automation.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 {
	
	public WebDriver driver;
	
	 public HomePage1(WebDriver driver) 
	 {
		this.driver=driver;
	 }
	
	 @FindBy(linkText = "Sign in")
	 WebElement signin;
	 
	 public void clickSignin()
	 {
		 signin.click();
	 }
	 

}
