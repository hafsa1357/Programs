package com.Capturing_Url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_FacebookURL {

	public static void main(String[] args) {
		String url="https://www.facebook.com/";
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(url);
		
		String Actual_URL =driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("Hafsa@gmail.com");
		WebElement Password= driver.findElement(By.id("pass"));
		Password.sendKeys("Sharif");
		WebElement LogIn = driver.findElement(By.id("loginbutton"));
		LogIn.click();
		
		
	}

}
