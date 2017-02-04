package com.cashkaro.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class testWeb {

	WebDriver driver;
	
@Test
public void openForgotPasswordFrame() throws Exception
{
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://test-app.t2scdn.com/sandbox/d282d0a522d0c8202778ddb288b61159/calc.php");
	driver.findElement(By.name("fvalue")).sendKeys("1");
	driver.findElement(By.name("lvalue")).sendKeys("2");
	driver.findElement(By.xpath("//button[contains(text(),'Calculate')]")).click();
	//Select dropdown = new Select(driver.findElement(By.name("operator")));
//	dropdown.selectByVisibleText("-");
//	//html/body/div/div[2]/div/form/button
//	return driver;
	//xpath__//p[contains(text(),'An email has been sent with your new password')]
	
}
}