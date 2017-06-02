import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;




public class testhtml {

	
	
@Test
public void  mnm() throws InterruptedException

{
    System.out.println("sdf");
	// TODO Auto-generated method stub
    
	WebDriver driver = new HtmlUnitDriver();
	driver.get("http://www.facebook.com");
	System.out.println("Page title is "+driver.getTitle());
	WebElement eml = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	eml.sendKeys("dsf");
	pass.sendKeys("sdgg");

	WebElement signin = driver.findElement(By.id("loginbutton"));
	signin.click();	
	WebElement reglink = driver.findElement(By.id("reg-link"));
	reglink.click();
	Thread.sleep(10);
	System.out.println("Page title is "+driver.getTitle());
	//WebElement errormessage = driver.findElement(By.xpath("//div[contains(text(),'The email address or')]"));
	
//	System.out.println("Error MessgePage is "+errormessage.getText());
	//driver.findElement(By.xpath("//button[contains(text(),'Calculate')]")).click();
	
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
	WebDriver driver2 = new ChromeDriver();
	driver2.get("http://www.facebook.com");
	
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
	
	System.out.println("Page title is "+driver2.getTitle());
	WebElement eml2 = driver2.findElement(By.id("email"));
	WebElement pass2 = driver2.findElement(By.id("pass"));
	eml2.sendKeys("dsf");
	pass2.sendKeys("sdgg");

	
	
	
	WebElement signin2 = driver2.findElement(By.id("loginbutton"));
	signin2.click();	
	
//	WebElement errormessage3 = driver2.findElement(By.xpath("//div[contains(text(),'The email address or')]"));
	Thread.sleep(10);
	
//	WebElement errormessage2 = driver2.findElement(By.xpath("//div[contains(text(),'The email address or')]"));
//	WebElement recoverButton = driver2.findElement(By.xpath("//a[contains(href,'recover')]")); 
	WebElement errormessage2 = driver2.findElement(By.cssSelector("div:contains('The email address or')"));
	WebElement recoverButton = driver2.findElement(By.cssSelector("a[href*='recover']"));
	//reg-link
//	WebElement signin3 = driver2.findElement(By.id("reg-link"));
	recoverButton.click();
	//recoverButton.click();
	System.out.println("Error MessgePage is "+errormessage2.getText());
	//driver.findElement(By.xpath("//button[contains(text(),'Calculate')]")).click();
	
	

}
}
