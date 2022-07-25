package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage {
	
public WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath = "//*[@id=\"signin2\"]")
	WebElement signup;
	
	@FindBy(xpath = "//*[@id=\"sign-username\"]")
	WebElement un;
	
	@FindBy(xpath = "//*[@id=\"sign-password\"]")
	WebElement ps;
	
	@FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	WebElement c_signup;
	
	@FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[1]/button/span")
	WebElement close_sign;

	public void signup()
	{
		signup.click();
	}
	
	public void uname(String username)
	{
		un.sendKeys(username);
	}
	
	public void pass(String password)
	{
		ps.sendKeys(password);
	}
	
	public void register()
	{
		c_signup.click();
	}
	
	public void closeSignup()
	{
		close_sign.click();
	}
	
//-login------------------------------------------------------
	
	@FindBy(xpath = "//*[@id=\"login2\"]")
	WebElement login;
	
	@FindBy(xpath = "//*[@id=\"loginusername\"]")
	WebElement user;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form/div[2]/input")
	WebElement pass;
	
	@FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	WebElement c_login;
	
	public void login()
	{
		login.click();
	}
	
	public void username(String username)
	{
		user.sendKeys(username);
	}
	
	public void password(String password)
	{
		pass.sendKeys(password);
	}
	
	public void loginclick()
	{
		c_login.click();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
