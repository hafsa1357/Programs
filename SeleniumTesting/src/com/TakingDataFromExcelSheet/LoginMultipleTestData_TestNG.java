package com.TakingDataFromExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileCacheImageInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginMultipleTestData_TestNG {
	WebDriver driver= null;
	String url="http://www.newtours.demoaut.com/";
      
      @BeforeTest
      public void setUp()
      {
      System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(url);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
      }
      
      @Test(priority=1)
      public void Login() throws IOException 
      {
    	FileInputStream file = new FileInputStream("C:\\Users\\home\\Desktop\\eclipse\\SeleniumTesting\\SeleniumTesting\\src\\com\\ExcelOperatinsMultiple\\NewtoursMultipleData.xlsx");
    	XSSFWorkbook Workbook = new XSSFWorkbook(file);
    	XSSFSheet Sheet = Workbook.getSheet("Sheet1");
    	int rowcount = Sheet.getLastRowNum();
    	for(int i=1;i<=rowcount;i++)
    	{
    		Row row = Sheet.getRow(i);
    	
    		WebElement username = driver.findElement(By.name("userName"));
    		username.clear();
             username.sendKeys(row.getCell(0).getStringCellValue());
     		WebElement password = driver.findElement(By.name("password"));
            password.clear();
            password.sendKeys(row.getCell(1).getStringCellValue());
            WebElement Signin = driver.findElement(By.name("login"));
    		Signin.click();
    		String Expected_Title = "Find";
    		String Actual_Title= driver.getTitle();
    		if(Actual_Title.equals(Actual_Title))
    		{
    			System.out.println("Pass");
    			row.createCell(2).setCellValue("PASS");
    		}
    		else
    		{
    			System.out.println("Fail");
    			row.createCell(1).setCellValue("FAIL");
    		}
    		
    				
    		
    		driver.navigate().back();
    		FileOutputStream file1 = new FileOutputStream("C:\\Users\\home\\Desktop\\eclipse\\SeleniumTesting\\SeleniumTesting\\src\\com\\ExcelOperatinsMultiple\\NewtoursMultipleData.xlsx");
    	     Workbook.write(file1);
    		
    	}
    				
    			   			
      }    			
}