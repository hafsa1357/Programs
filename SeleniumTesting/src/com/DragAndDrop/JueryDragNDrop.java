package com.DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JueryDragNDrop {
	WebDriver driver= null;
	String url="https://jqueryui.com/droppable/";
      
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
      public void DragNDrop()
      {
    	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
    	  WebElement draggAble = driver.findElement(By.id("draggable"));
    	  WebElement droppAble = driver.findElement(By.id("droppable"));
    	  Actions act = new Actions(driver);
    	  act.dragAndDrop(draggAble, droppAble).perform();
    			  
      }
      
      
      
      
      
      

}
