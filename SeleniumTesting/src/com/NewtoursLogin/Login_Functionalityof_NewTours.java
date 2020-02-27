package com.NewtoursLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.modifier.SynchronizationState;

public class Login_Functionalityof_NewTours {

	public static void main(String[] args) throws InterruptedException {
		String url="http://www.newtours.demoaut.com/";
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(url);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("tutorial");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("tutorial");
		//Thread.sleep(10000);
		WebElement Signin = driver.findElement(By.name("login"));
		Signin.click();
		String Expected_Title = "Find";
		String Actual_Title= driver.getTitle();
		if(Actual_Title.equals(Actual_Title))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
				
		driver.quit();
		
	}

}
