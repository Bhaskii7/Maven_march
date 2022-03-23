package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_page {
	public WebDriver driver;
	
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement checkout_btn;


	public Address_page(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
		
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getCheckout_btn() {
		return checkout_btn;
	}
	

}
