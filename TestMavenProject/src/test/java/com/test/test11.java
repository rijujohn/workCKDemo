package com.test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class test11 {

	WebDriver driver;
	
@Test
public void openForgotPasswordFrame() throws Exception
{
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://test-app.t2scdn.com/sandbox/d282d0a522d0c8202778ddb288b61159/calc.php");
	driver.findElement(By.name("fvalue")).sendKeys("10");
	System.out.println(driver.findElement(By.name("fvalue")).getAttribute("value"));
	driver.findElement(By.name("lvalue")).sendKeys("21");
	System.out.println(driver.findElement(By.name("lvalue")).getAttribute("value"));
	driver.findElement(By.xpath("//button[contains(text(),'Calculate')]")).click();
	System.out.println(driver.findElement(By.name("result")).getAttribute("value"));
	driver.close();
    Assert.assertEquals("31", "1");
	
}
}
