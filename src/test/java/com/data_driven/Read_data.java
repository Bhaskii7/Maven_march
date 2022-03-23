package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data {
	
     public static void particular_cell_data() throws IOException {
    	 
    	 File f= new File("C:\\Users\\karan\\eclipse-workspace\\Maven_march\\Sample.xlsx"); //converting xlsx to file format
    	 
    	 FileInputStream fis= new FileInputStream(f); //Reading the data from file
    	 
    	 Workbook wb= new XSSFWorkbook(fis); // connecting with workbook with upcasting
    	 
    	 Sheet s = wb.getSheetAt(0); //accessing the sheet
    	 
    	 Row r = s.getRow(2); //retrieving the row
    	 
    	 Cell c = r.getCell(1); //retrieve the cell
    	 
    	 CellType type = c.getCellType(); //checking the cell type
    	 
    	 if (type.equals(CellType.STRING)) {
    		 
    		 String CellValue = c.getStringCellValue();
    		 System.out.println(CellValue);		
		}
    	    	 
    	 else if (type.equals(CellType.NUMERIC)) {
    		 
    		 double CellValue = c.getNumericCellValue();
    		 
    		 int value =(int) CellValue;
    		 System.out.println(value);		  		
		}
    	 wb.close();
    	 
		}
    	 public static void all_data() throws IOException {
    		 
    		 File f= new File("C:\\Users\\karan\\eclipse-workspace\\Maven_march\\Sample.xlsx");
    		 
    		 FileInputStream fis= new FileInputStream(f);
    		 
    		 Workbook wb=new XSSFWorkbook(fis);
    		 
    		 Sheet s = wb.getSheetAt(0);
    		 
    		 for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
    			 
    			 Row r = s.getRow(i); // i Represents row index
    			 
    			 for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
    				 
    				 Cell c = r.getCell(j); //j represents column index
    				 CellType type = c.getCellType();
    				 
    				 if (type.equals(CellType.STRING)) {
						
    					 String Value = c.getStringCellValue();
    					 System.out.println(Value);
    				 }
    				 
    				 else if (type.equals(CellType.NUMERIC)) {
    					 
    					 double numericValue = c.getNumericCellValue();
    					 int v=(int) numericValue; //narrowing type casting
    					 String value = Integer.toString(v);
    					 System.out.println(value);	
					}
    				 wb.close();		
				}	
			}	 
		}	
    	 
    	 public static void Particular_row_data() throws IOException {
    		 
    		 File f=new File("C:\\Users\\karan\\eclipse-workspace\\Maven_march\\Sample.xlsx");
    		 
    		 FileInputStream fis=new FileInputStream(f);
    		 Workbook wb= new XSSFWorkbook(fis);
    		 Sheet s = wb.getSheetAt(0);
     
    	      Row r = s.getRow(1); // i Represents row index
    			 
    			 for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
    				 
    				 Cell c = r.getCell(j); //j represents column index
    				 CellType type = c.getCellType();
    				 
    				 if (type.equals(CellType.STRING)) {
						
    					 String Value = c.getStringCellValue();
    					 System.out.println(Value);
    				 }
    				 
    				 else if (type.equals(CellType.NUMERIC)) {
    					 
    					 double numericValue = c.getNumericCellValue();
    					 int v=(int) numericValue; //narrowing type casting
    					 String value = Integer.toString(v);
    					 System.out.println(value);	
    				 }
    				 wb.close();
    			 }
    	 }
    	 
    	 
    	 public static void Particular_column_Data() throws Throwable {
    		 
    		 File f=new File("C:\\Users\\karan\\eclipse-workspace\\Maven_march\\Sample.xlsx");
    		 FileInputStream fis= new FileInputStream(f);
    		 Workbook wb=new XSSFWorkbook(fis);
    		 
    		 Sheet s = wb.getSheetAt(0);
    		 
             for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
    			 
    			 Row r = s.getRow(i); // i Represents row index
    			 
    				 Cell c = r.getCell(1); //j represents column index
    				 CellType type = c.getCellType();
    				 
    				 if (type.equals(CellType.STRING)) {
						
    					 String Value = c.getStringCellValue();
    					 System.out.println(Value);
    				 }
    				 
    				 else if (type.equals(CellType.NUMERIC)) {
    					 
    					 double numericValue = c.getNumericCellValue();
    					 int v=(int) numericValue; 
    					 String value = Integer.toString(v);
    					 System.out.println(value);
		            }
    	               wb.close();
             }
    	 }	 
    	 public static void main(String[] args) throws Throwable {
    		 particular_cell_data();
    		 all_data();
    		 Particular_row_data();
    		 Particular_column_Data();		
		}
		}

    	 
    			 
    			 
    	 

		
    	 
		
    	 
		

	

