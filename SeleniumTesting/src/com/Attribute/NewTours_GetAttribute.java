package com.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_GetAttribute {

	public static void main(String[] args) {
		String url="http://newtours.demoaut.com";
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(url);
		
		WebElement Register= driver.findElement(By.linkText("REGISTER"));
		Register.click();
		String Register_text = Register.getText();
		System.out.println(Register.getText());
		
		String Expected_link =  Register.getAttribute("href");
		String Actual_Link = driver.getCurrentUrl();
		if(Actual_Link.equals(Expected_link))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
}
