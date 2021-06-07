package com.facebook.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	
	WebDriver driver;
	
	public LoginPageNew(WebDriver ldriver)  //Whatever driver comes in pagefactory we will initialize in local driver
	
	{
		this.driver=ldriver;
	}
	
	
	
	@FindBy(xpath="//input[@id='email']") WebElement username;  //find by is another way to find web element which only works with Page Factory
	@CacheLookup  //It will keep the element in the cache memory so as to keep the test speed high but only if the location of webelement does not change
	@FindBy(how = How.XPATH, using = "//input[@id='pass']") WebElement password;  // Standard way of using find by is by using it with How (How is a class and using is a string variable

	
	@FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement submit_button;


	@FindBy(how = How.LINK_TEXT, using = "Forgotten Password?" ) WebElement forget_password_link;

	
	public void login_facebook(String uid, String pass)
	
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
		
	}
	
	
	
	

}
