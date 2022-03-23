package com.Test_runner;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.Base_class.Base_Class;
import com.helper.Page_object_manager;

public class Automationpractice_Runnerclass extends Base_Class {
	public static WebDriver driver= browser_configuration("chrome");
	public static Page_object_manager pom =new Page_object_manager(driver);
    public static Logger log= Logger.getLogger(Automationpractice_Runnerclass.class);
	public static void main(String[] args) throws Throwable {
		
         PropertyConfigurator.configure("log4j.properties"); 		
		 geturl("http://automationpractice.com/index.php");
		 log.info("Url launched successfully");
		 implicitwait(10, TimeUnit.SECONDS);
		 clickonelement(pom.get_Instance_Hp().getSignin_btn());
		 inputvalueelement(pom.get_Instance_login().getUser_name(),particular_Data("C:\\Users\\karan\\eclipse-workspace\\Maven_march\\Automationpractice test case.xlsx", 3,5));
		 inputvalueelement(pom.get_Instance_login().getPassword(),particular_Data("C:\\Users\\karan\\eclipse-workspace\\Maven_march\\Automationpractice test case.xlsx", 8, 5));
	     clickonelement(pom.get_Instance_login().getSign_in());
	     log.info("Credentials entered in the field");
	     navigateto("http://automationpractice.com/index.php");
	     clickonelement(pom.get_Instance_product().getProduct());
  		 clickonelement(pom.get_Instance_product().getQuantity());
  		 clickonelement(pom.get_Instance_product().getColour());
  		 log.info("product added to the cart");
	     clickonelement(pom.get_Instance_product().getAddtocart());     
		 explicitWait(30,pom.get_Instance_product().getWait()); 
	     clickonelement(pom.get_Instance_product().getCheckout());
         clickonelement(pom.get_Instance_summary().getCheckout_btn());
	     clickonelement(pom.get_Instance_address().getCheckout_btn());
	     clickonelement(pom.get_Instance_shipping().getAgree_btn());
	     clickonelement(pom.get_Instance_shipping().getCheckout_btn());
	     log.info("product checkout succesfully");
	     clickonelement(pom.get_Instance_payment1().getPaybywire());
	     clickonelement(pom.get_Instance_payment2().getConfirmorder_btn()); 
	     log.info("product payment mode confirmed");
	     takesscreenshot("C:\\Users\\karan\\eclipse-workspace\\Maven_march\\Screenshot\\confirm.png");
	     clickonelement(pom.get_Instance_payment3().getBacktoorder_btn());    
	     takesscreenshot("C:\\Users\\karan\\eclipse-workspace\\Maven_march\\Screenshot\\confirm1.png");
	     log.info("product succesfully ordered");
         clickonelement(pom.get_Instance_orderhistory().getSignout_btn());
	     close();
	     
 
}}
