package com.cjc.automation.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationDetails3 {

	public WebDriver driver;
	public AccountCreationDetails3(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(id = "id_gender2") //Title-Mrs
	WebElement titleMrs;

	@FindBy(id = "id_gender1") //Title-Mrs
	WebElement titleMr;
	
	@FindBy(id="customer_firstname")
	WebElement custfirstName;

	@FindBy(id="customer_lastname")
	WebElement custlastName;

	@FindBy(id="passwd")
	WebElement pass;

	@FindBy(id="firstname")
	WebElement addFirstname;

	@FindBy(id="lastname")
	WebElement addLastname;

	//address1
	@FindBy(id="address1")
	WebElement address1;

	@FindBy(id="city")
	WebElement city;

	//id_state
	@FindBy(id="id_state")
	WebElement state;

	@FindBy(id="postcode")
	WebElement postcode;

	@FindBy(id="id_country")
	WebElement country;

	//phone_mobile
	@FindBy(id="phone_mobile")
	WebElement phone_mobile;

	//alias
	@FindBy(id="alias")
	WebElement alias;


	@FindBy(id="submitAccount")
	WebElement register;
	//identify actions to be performed on web elements

	public void selectTitleMrs()
	{
		titleMrs.click();
	}

	public void selectTitleMr()
	{
		titleMr.click();
	}
	public void enterCustomerFirstName(String firstname)
	{
		custfirstName.sendKeys(firstname);
	}

	public void enterCustomerLastName(String lastname)
	{
		custlastName.sendKeys(lastname);
	}

	public void enterPassword(String password)
	{
		pass.sendKeys(password);
	}

	public void enterAddressFirstName(String adFirstname)
	{
		addFirstname.clear();

		addFirstname.sendKeys(adFirstname);
	}

	public void enterAddressLastName(String adLastname)
	{
		addLastname.clear();
		addLastname.sendKeys(adLastname);
	}

	public void enterAddress(String address)
	{
		address1.sendKeys(address);
	}

	public void enterCity(String cityname)
	{
		city.sendKeys(cityname);
	}

	public void selectState(String statename)
	{
		Select obj = new Select(state);
		obj.selectByVisibleText(statename);
	}

	public void enterPostcode(String pin)
	{
		postcode.sendKeys(pin);
	}

	public void selectCountry(String countryname)
	{
		Select obj = new Select(country);
		obj.selectByVisibleText(countryname);
	}

	public void enterMobilePhone(String mbno)
	{
		phone_mobile.sendKeys(mbno);
	}

	public void enterAlias(String ali)
	{
		alias.clear();
		alias.sendKeys(ali);
	}

	public void clickOnRegister()
	{
		register.click();
	}

}
