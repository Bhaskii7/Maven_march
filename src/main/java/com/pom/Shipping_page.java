package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_page {
	
	public WebDriver driver;
	@FindBy(name="cgv")
	private WebElement agree_btn;
	@FindBy(name="processCarrier")
	private WebElement checkout_btn;
	
	public Shipping_page(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAgree_btn() {
		return agree_btn;
	}
	public WebElement getCheckout_btn() {
		return checkout_btn;
	}
	

}
