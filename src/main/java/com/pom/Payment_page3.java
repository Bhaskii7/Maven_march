package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page3 {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='button-exclusive btn btn-default']")
	private WebElement backtoorder_btn;

	public Payment_page3(WebDriver driver2) {
		
		driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getBacktoorder_btn() {
		return backtoorder_btn;
	}

}
