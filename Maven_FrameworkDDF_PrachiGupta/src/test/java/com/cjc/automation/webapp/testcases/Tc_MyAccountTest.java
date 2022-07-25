package com.cjc.automation.webapp.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cjc.automation.webapp.pages.AccountCreationDetails3;
import com.cjc.automation.webapp.pages.HomePage1;
import com.cjc.automation.webapp.pages.Myaccount2;
import com.cjc.automation.webapp.pages.RegisteredUserAccount4;

public class Tc_MyAccountTest extends BaseClass {

	@Test
	public void verifyRegistrationandLogin() throws InterruptedException
	{
		log.info("***************TestCase Verify Registration and Login starts*****************"); 
		driver.get(url);
		HomePage1 home=PageFactory.initElements(driver, HomePage1.class);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		home.clickSignin();
		
		Myaccount2 myac=PageFactory.initElements(driver, Myaccount2.class);
		myac.enterEmailId("shubham15555666@gmail.com");
		myac.createAccButton();
		
		
		AccountCreationDetails3 ac=PageFactory.initElements(driver, AccountCreationDetails3.class);
		ac.selectTitleMr();
		ac.enterCustomerFirstName("Shubham");
		ac.enterCustomerLastName("Dandekar");
		ac.enterPassword("shubham@123");
		ac.enterAddressFirstName("Shubham");
		ac.enterAddressLastName("Dandekar");
		ac.enterAddress("Nandanwan");
		ac.enterCity("Nagpur");
		ac.selectState("Alabama");
		ac.enterPostcode("00000");
		ac.selectCountry("United States");
		ac.enterMobilePhone("7845124578");
		ac.enterAlias("Home");

		log.info("entered user details on account creation page.");

		ac.clickOnRegister();
		log.info("clicked on Register button");

		RegisteredUserAccount4 regUser =PageFactory.initElements(driver, RegisteredUserAccount4.class);
		String userName = regUser.getUserName();

		Assert.assertEquals("Shubham Dandekar", userName);

		log.info("***************TestCase Verify Registration and Login ends*****************"); 
		
	}
	
	@Test
	public void VerifyLogin() throws InterruptedException 
	{
		log.info("***************TestCase Verify Login starts*****************"); 
		RegisteredUserAccount4 regUser =PageFactory.initElements(driver, RegisteredUserAccount4.class);
		Thread.sleep(2000);
		regUser.clickOnSignOut();
		log.info("Clicked on sign out link");
		
		Myaccount2 myac=PageFactory.initElements(driver, Myaccount2.class);

		myac.enterEmailAddress("shubham15555666@gmail.com");
		log.info("Entered email address");

		myac.enterPassword("shubham@123");
		log.info("Entered password");

		myac.login();
		log.info("Clicked on sign in link..");

//----------RegisteredUserAccount4-------------------------------------------		
		String userName = regUser.getUserName();

		if(userName.equals("Shubham Dandekar"))
		{
			log.info("VerifyLogin - Passed");
			Thread.sleep(3000);
			regUser.clickOnSignOut();
			Assert.assertTrue(true);
		}
		else
		{
			log.info("VerifyLogin - Failed");
			//captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);
		}

		log.info("***************TestCase Verify Login ends*****************"); 
	
	}

}
