package com.facebook.Testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import org.testng.annotations.Test;

import com.facebook.Pages.LoginPageNew;

import Helper_Utility.BrowserFactory;

public class VerifyValidLogin extends BrowserFactory {
	
@Test
	public void checkValidUser()
	
	{
	//This will launch browser and specific url	
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.facebook.com/");
		
		// Created PageObject using Page Factory
		LoginPageNew login_page =PageFactory.initElements(driver, LoginPageNew.class);  //---> It will return page object of the particular page we are calling through page factory
		
		//We need to call all the methods now
		
		login_page.login_facebook(uname, pwd);
		
		
	}
	

	

}
