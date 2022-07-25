package com.cjc.step;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cjc.pages.AddToCart;
import com.cjc.pages.SignupPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	public static WebDriver driver;
	public static SignupPage sp;
	public static AddToCart ad;
	static Logger log=Logger.getLogger(StepDef.class.getName());
	
	@Given("User navigate to DB sign in site")
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");	
		driver.manage().window().maximize();
	}

	@When("User have to click on sign up button")
	public void signupclick()
	{
		 sp=PageFactory.initElements(driver, SignupPage.class);
		 sp.signup();
	  log.info("click on sign up");
	}

	@And("User have to enter valid username {string}")
	public void valid_username(String un) throws InterruptedException
	{
		Thread.sleep(2000);
		sp.uname(un);
		 log.info("username entered");
	}

	@And("User have to enter valid password {string}")
	public void valid_password(String ps) 
	{
		sp.pass(ps);
		 log.info("password entered");
	}

	@And("User have to click on sign up button for registered")
	public void for_registered() 
	{
		sp.register();
		 log.info("register success");
	}

	@And("User have to accept popup1")
	public void accept_popup1() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		 log.info("alert accepted");
	}

	@Then("sign in successfully")
	public void sign_in_successfully()
	{
		 log.info("registered successfully");
	}
	@Then("close sign up")
	public void closeSignup()
	{
		sp.closeSignup();
	}
	
//-login--------------------------------------------------------------------------------
	
	@Given("User have to click on login button")
	public void loginButton() throws InterruptedException
	{
		Thread.sleep(2000);
		sp.login();
		 log.info("login button clicked");
	}
	
	@And("User have to enter valid user {string}")
	public void valid_user(String user) throws InterruptedException 
	{
		Thread.sleep(2000);
	  sp.username(user);
	}

	@And("User have to enter valid pass {string}")
	public void valid_pass(String pass) 
	{
	   sp.password(pass);
	}

	@And("User have to click on login")
	public void click_on_login() 
	{
	    sp.loginclick();
	}

	@Then("login successfully")
	public void login_successfully() 
	{
	  System.out.println("successfully login");
	}
//addtocart------------------------------------------------------------------------------------
	
	@Given("User have to click on item")
	public void click_on_item() throws InterruptedException 
	{
		 Thread.sleep(3000);
	    ad=PageFactory.initElements(driver, AddToCart.class);
	    ad.selectItem();
	}

	@When("User have to click on addtocart")
	public void click_on_addtocart() throws InterruptedException 
	{
		Thread.sleep(2000);
	   ad.addtocart();
	}

	@And("User have to click on accept alert")
	public void accept_alert() throws InterruptedException 
	{
		Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	}

	@And("User have to click on cart")
	public void click_on_cart() throws InterruptedException
	{
		Thread.sleep(2000);
		ad.cart();
	}

	@And("User have to click on placeorder")
	public void placeorder() throws InterruptedException
	{
		Thread.sleep(2000);
	   ad.placeOrder();
	}

	@And("User have to enter Name {string}")
	public void enter_name(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
	    ad.name(nm);
	}

	@And("User have to enter Country {string}")
	public void enter_country(String string) 
	{
	  ad.country(string);
	}

	@And("User have to enter City {string}")
	public void enter_city(String string) 
	{
		ad.city(string);
	}

	@And("User have to enter Credit card {string}")
	public void credit_card(String string) 
	{
	  ad.creditcard(string);
	}

	@And("User have to enter Month {string}")
	public void enter_month(String string)
	{
	   ad.month(string);
	}

	@And("User have to enter Year {string}")
	public void enter_year(String string) 
	{
		ad.year(string);
	}

	@Then("User have to click on purchase")
	public void purchase()
	{
		ad.purchase();
	}

	
	
	
	
	
}
