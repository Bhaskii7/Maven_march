package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderhistory_page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signout_btn;
	
	

	public Orderhistory_page(WebDriver driver2) {
		
		driver=driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getSignout_btn() {
		return signout_btn;
	}
	

}
