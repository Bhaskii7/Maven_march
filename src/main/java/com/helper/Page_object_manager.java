package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Address_page;
import com.pom.Home_page;
import com.pom.Login_page;
import com.pom.Orderhistory_page;
import com.pom.Payment_page1;
import com.pom.Payment_page2;
import com.pom.Payment_page3;
import com.pom.Product_hp;
import com.pom.Shipping_page;
import com.pom.Summary_page;

public class Page_object_manager {
	
	public WebDriver driver;
	
	
	private Home_page hp;
	
	public Page_object_manager(WebDriver driver2) {
           this.driver= driver2;
	}

	public Home_page get_Instance_Hp() {
		
		if (hp==null) {
			 hp= new Home_page(driver);	
		}	
		return hp;
	}
	
	private Login_page lp;
	
	public Login_page get_Instance_login() {
		if (lp==null) {
			lp= new Login_page(driver);
			
		}
		return lp;

	}
	
	private Product_hp pp;
	
	public  Product_hp get_Instance_product() {
		if (pp==null) {
			pp= new Product_hp(driver);		
		}	
		return pp;
	}
	
	private Summary_page sp;
	
	public Summary_page get_Instance_summary() {	
		
		if (sp==null) {
			sp=new Summary_page(driver);	
		}
		return sp;

	}
	
	private Address_page ap;
	
	public Address_page get_Instance_address() {
		if (ap==null) {
			ap= new Address_page(driver);	
		}
		
		return ap;
	}
	private Shipping_page sp1;
	
	public Shipping_page get_Instance_shipping() {
		if (sp1==null) {
			sp1= new Shipping_page(driver);		
		}
		return sp1;
	}
	
	private Payment_page1 pp1;
	
	public Payment_page1 get_Instance_payment1 () {
		if (pp1==null) {
			pp1=new Payment_page1(driver);	
		}
		return pp1;
	}
	
	private Payment_page2 pp2;
	
	public Payment_page2 get_Instance_payment2() {
		if (pp2==null) {
			pp2=new Payment_page2(driver);
		}
		return pp2;
	}
	
	private Payment_page3 pp3;
	
	public Payment_page3 get_Instance_payment3() {
		if (pp3==null) {
			pp3=new Payment_page3(driver);
			
		}
		return pp3;
	}
	
	private Orderhistory_page oh;
	
	public Orderhistory_page get_Instance_orderhistory () {
		if (oh==null) {
			oh=new Orderhistory_page(driver);
			
		}
		return oh;
	}

}
