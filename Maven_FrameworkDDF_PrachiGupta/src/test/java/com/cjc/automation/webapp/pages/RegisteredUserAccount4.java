package com.cjc.automation.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisteredUserAccount4 {

		public WebDriver driver;
		public RegisteredUserAccount4(WebDriver driver)
		{
			this.driver=driver;
		}

		@FindBy(xpath = "//a[@title='View my customer account']") 
		WebElement userName;
		
		@FindBy(css = "a[class='logout']")
		WebElement signOut;
//---------------------------------------------------------
		public String getUserName()
		{
			String text = userName.getText();
			return text;
		}
		
		public void clickOnSignOut()
		{
			signOut.click();
		}
	}


