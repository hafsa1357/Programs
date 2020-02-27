package com.DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDown {
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
      @Test
      public void Register()
      {
    	 WebElement Register = driver.findElement(By.linkText("REGISTER"));
    	 Register.click();
    	  WebElement countrydropdown = driver.findElement(By.name("country"));
      	  List<WebElement>countries = countrydropdown.findElements(By.tagName("option"));
      	  int countriescount = countries.size();
      	 for(int i =0;i<=countriescount;i++)
      	 {
      		 String CountriesName = countries.get(i).getText();
      		System.out.println( CountriesName);
      	 }
      	  
    	 
    			 
      }

      @AfterTest
		public void tearDown()
		{
			driver.quit();
		}
	

}
