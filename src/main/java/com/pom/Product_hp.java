package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_hp {
	public WebDriver driver;
	
	@FindBy(xpath="(//a[normalize-space()='Faded Short Sleeve T-shirts'])[1]")
	private WebElement product;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement quantity;
	@FindBy(id="color_14")
	private WebElement colour;
	@FindBy(name="Submit")
	private WebElement addtocart;
	@FindBy(xpath="//a[normalize-space()='Proceed to checkout']")
	private WebElement checkout;
	@FindBy(xpath="//a[normalize-space()='Proceed to checkout']")
	private WebElement wait;
	
	
	public WebElement getWait() {
		return wait;
	}
	public Product_hp(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
		
		
		
	}
	public WebElement getProduct() {
		return product;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getColour() {
		return colour;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	
	
	
	

}
