package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;
	
	
	
	@FindBy(name="email")
	private WebElement user_name;
	
public Login_page(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="passwd")
	private WebElement password;
	
	@FindBy(name="SubmitLogin")
	private WebElement sign_in;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getUser_name() {
		return user_name;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getSign_in() {
		return sign_in;
	}

	


	
	
	
	

}
