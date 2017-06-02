package com.cashkaro.testScripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class testWeb {

	WebDriver driver;
	
@Test
public void openForgotPasswordFrame() throws Exception
{
	
	
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://test-app.t2scdn.com/sandbox/d282d0a522d0c8202778ddb288b61159/calc.php");
	
	
	
	
	
	String x = ((JavascriptExecutor)driver).executeScript("return document.documentElement.innerText;").toString();
	
	String xf = ((JavascriptExecutor)driver).executeScript("return document.readyState;").toString();
	
	System.out.println(x);
	System.out.println(xf);
	
	WebDriverWait df = new WebDriverWait(driver, 20);
	
	
	driver.findElement(By.name("fvalue")).sendKeys("1");
	WebElement fgh = driver.findElement(By.name("fvalue"));
	String bn = ((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML;",fgh).toString();
	System.out.println(bn);
	driver.findElement(By.name("lvalue")).sendKeys("2");
	driver.findElement(By.xpath("//button[contains(text(),'Calculate')]")).click();
	//(WebElement)driver).findElement(By.xpath("//button[contains(text(),'Calculate')]"));
	
	driver.findElement(By.name("lvalue")).sendKeys(Keys.chord(Keys.BACK_SPACE,Keys.ADD,Keys.ALT));
	//Select dropdown = new Select(driver.findElement(By.name("operator")));
//	dropdown.selectByVisibleText("-");
//	//html/body/div/div[2]/div/form/button
//	return driver;
	//xpath__//p[contains(text(),'An email has been sent with your new password')]
	
	Actions act = new Actions(driver);
	Actions action = new Actions(driver).doubleClick(driver.findElement(By.name("lvalue")));
	
	
	action.build().perform();
	

}
}