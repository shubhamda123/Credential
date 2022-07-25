package com.cjc.automation.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccount2 {

	public WebDriver driver;
	public Myaccount2(WebDriver driver) 
	{
		this.driver=driver;
    }
	
	 @FindBy(name = "email_create")
	 WebElement emailId;
	 
	 @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
	 WebElement button;
	 
	//Already registered users
		@FindBy(id = "email") 
		WebElement registeredUsersEmail;
		
		@FindBy(id = "passwd") 
		WebElement registeredUsersPwd;
		
		@FindBy(id = "SubmitLogin")
		WebElement submitLogin;
		
	 
	 public void enterEmailId(String email)
	 {
		 emailId.sendKeys(email);
	 }
 
	 public void createAccButton()
	 {
		button.click();
	 }
	
//-----------------already registered
		public void enterEmailAddress(String email) 
		{
			registeredUsersEmail.sendKeys(email);
		}

		public void enterPassword(String pass) 
		{
			registeredUsersPwd.sendKeys(pass);
		}

		public void login()
		{
			submitLogin.click();
		}

	
	
	
	
	
	
	

}