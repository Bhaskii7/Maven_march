package com.Base_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	public static WebDriver driver;
	public static String value;
	
	public static WebDriver browser_configuration(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
			 driver =new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			
			 driver=new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void clickonelement(WebElement element) {
		
		element.click();
	}
	
	public static void inputvalueelement(WebElement element, String data) {
		
		element.sendKeys(data);

	}
	
	public static void close() {
	
		driver.close();

	}
	public static void geturl(String url) {
		driver.get(url);	
	}
	
	public static void implicitwait( int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}
	
	public static void explicitWait(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));		
	}
	
	public static void sleep1( int seconds) throws Throwable {
		Thread.sleep(seconds);
	}
    public static void takesscreenshot(String path) throws Exception {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File(path);
		FileUtils.copyFile(Source, destination);
	}
    
    public static void actionsclass(String actionname,WebElement element) {
    	
    	try {
    		Actions act =new Actions (driver);
    		if (actionname.equalsIgnoreCase("moveto")) {
    			act.moveToElement(element).build().perform();
    		}
    		else if (actionname.equalsIgnoreCase("click")) {
    			act.click(element).build().perform();	
			}
    		else if (actionname.equalsIgnoreCase("rightclick")) {
    			act.contextClick(element).build().perform();			
			}
    		else if (actionname.equalsIgnoreCase("doubleclick")) {
    			act.doubleClick(element).build().perform();		
			}
    		else if (actionname.equalsIgnoreCase("movetoelement")) {
    			act.moveToElement(element).build().perform();			
			}
    		else if (actionname.equalsIgnoreCase("draganddrop")) {
    			act.dragAndDrop(element, element).build().perform();		
			}
    		else if (actionname.equalsIgnoreCase("clickandhold")) {
    			act.clickAndHold(element).build().perform();			
    		}
    		
        	}catch (Exception e) {
			e.printStackTrace();
			}   	  	
    }

	public static void dropdownselect(WebElement element, String type, String value) {
		
		try {
			
			Select s=new Select(element);
			if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);		
			}
			else if (type.equalsIgnoreCase("byvisibletext")) {
		    s.selectByVisibleText(value);		
			}
			else if (type.equalsIgnoreCase("byindex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			}}	
			
			catch (Exception e) {
				e.printStackTrace();
			}		
		}
		public static void frameoperations(String frameType,String id,String index,WebElement element) {
			try {
				if (frameType.equalsIgnoreCase("framebyid")) {
					driver.switchTo().frame(id);		
				}
				else if (frameType.equalsIgnoreCase("framebyindex")) {
					driver.switchTo().frame(index);		
				}
				else if (frameType.equalsIgnoreCase("framebyelement")) {
					driver.switchTo().frame(element);	
				}}
				
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		
		public static void navigateto(String url) {
			
			driver.navigate().to(url);

		}
		
		
		public static String particular_Data(String path, int row_index, int cell_index) throws IOException {
			
			File f= new File(path);
			
			FileInputStream fis= new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis); //upcasting
			Sheet sheetAt = w.getSheetAt(0);
			Row row= sheetAt.getRow(row_index);
			Cell cell = row.getCell(cell_index);
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
	    		 
	    		  value = cell.getStringCellValue();
			}
	    	    	 
	    	 else if (cellType.equals(CellType.NUMERIC)) {
	    		 
	    		 double NumericCellValue = cell.getNumericCellValue();
	    		 
	    		 int value =(int) NumericCellValue;
				
			}
			return value;
			

		}
		
		}
		
	
    

    
		
			
    		
    		
    	
		

	

