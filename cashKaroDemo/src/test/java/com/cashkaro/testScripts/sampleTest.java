package com.cashkaro.testScripts;


import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class sampleTest {

@Test	
public void test1()
{
	
	Stack 
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
	int x = driver.findElement(By.id("male")).getLocation().getX();
	
	int y = driver.findElement(By.id("male")).getLocation().getY();
	
	System.out.println("ff ar" + x +"dsf"+ y );
	
	ArrayList fg = new ArrayList();
	List<WebElement> df = driver.findElements(By.id("male"));
	
	for (WebElement sd: df)
	{
		int gh = sd.getLocation().getX();
		int gh2 = sd.getLocation().getX();
		if (gh == 0 || gh2==0)
		{
			
		}
		else
		{
			sd.click();
		}
	}		
	
	
}
}