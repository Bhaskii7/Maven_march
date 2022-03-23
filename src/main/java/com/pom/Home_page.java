package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	
	private WebElement Signin_btn;

	public Home_page(WebDriver driver2) {
		
		 this.driver=driver2;	
		 
		 PageFactory.initElements(driver, this);
	}

	public WebElement getSignin_btn() {
		return Signin_btn;
	}
	

}
