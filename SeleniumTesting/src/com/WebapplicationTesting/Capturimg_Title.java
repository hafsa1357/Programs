package com.WebapplicationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturimg_Title {

	public static void main(String[] args) {
		String url="https://www.bing.com/";
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(url);
		
		String Exepcted_BingHomepage_Title = "Bing";
		String Actual_BingHomePage_Title = driver.getTitle();
		if(Actual_BingHomePage_Title.equals(Exepcted_BingHomepage_Title))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
					driver.quit();
		}

}
