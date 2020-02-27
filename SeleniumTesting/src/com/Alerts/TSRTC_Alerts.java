package com.Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSRTC_Alerts {
	WebDriver driver= null;
	String url="https://www.tsrtconline.in/oprs-web/";
      
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
      public void HandlingALerts()
      {
    	  WebElement CheckAvailability = driver.findElement(By.id("searchBtn"));
    	  CheckAvailability.click();
    	  Alert alerts = driver.switchTo().alert();
    	  String Alertsmsg = alerts.getText();
    	  //alerts.accept();
    	  //alerts.dismiss();
          alerts.sendKeys("Hafsa");
         
          
                }
     
      
      
      
      
      
      
      
      
}
