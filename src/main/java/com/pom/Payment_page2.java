package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page2 {
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement confirmorder_btn;

	public Payment_page2(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
		
	}



	public WebElement getConfirmorder_btn() {
		return confirmorder_btn;
	}
	
	

}
