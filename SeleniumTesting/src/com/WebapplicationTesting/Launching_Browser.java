package com.WebapplicationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Browser {

	public static void main(String[] args) {
		String url = "https://www.bing.com/";
		WebDriver driver =null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Desktop\\eclipse\\SeleniumTesting\\SeleniumTesting\\driverFiles\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
				
		
		
		
		
		
		
	}

}
