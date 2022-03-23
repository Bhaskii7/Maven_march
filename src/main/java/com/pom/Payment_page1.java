package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page1 {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement paybywire;

	public Payment_page1(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
		
 	}

	public WebElement getPaybywire() {
		return paybywire;
	}
	
	

}
