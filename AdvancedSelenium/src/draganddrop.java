import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;






public class draganddrop {
	
	
@Test	
public void testDrag() throws InterruptedException
{
//	System.setProperty("webdriver.gecko.driver","D:\\SeleniumDrivers\\geckodriver.exe");
	//WebDriver driver2 = new FirefoxDriver();
	//System.setProperty("webdriver.gecko.driver","D:\\SeleniumDrivers\\geckodriver.exe");
	//WebDriver driver4 = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
	WebDriver driver4 = new ChromeDriver();
	driver4.get("http://www.facebook.com");
	
	driver4.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	
	
	driver4.get("http://only-testing-blog.blogspot.in");
	driver4.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS); //Waits for the driver to load fully (finish spinning)
	//else waits 500 seconds if driver loads it will immediately continue
	
 
	WebElement drag1 = driver4.findElement(By.xpath("//td[contains(text(),'Dog')]/following-sibling::td/input[@type='checkbox']"));
	
	driver4.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	
   System.out.println("text is "+ drag1.getTagName());
//	drag1.
	
//	WebDriverWait wait = new WebDriverWait(driver4,20);
	
	
//	WebElement drag = driver4.findElement(By.id("dragdiv"));
//	WebElement drop = driver4.findElement(By.id("dropdiv"));
	
//	wait.until(ExpectedConditions.textToBe(locator, value)  elementToBeClickable(By.id("dragdiv")));
    
	//Thread.sleep(10);
	//Actions actions = new Actions(driver4);
	
	//actions.moveToElement(drag);
   // Action dragAndDrop = actions.clickAndHold(drag).moveToElement(drop).release(drop).build();
  //  dragAndDrop.perform(); 

	//JavascriptExecutor jse = (JavascriptExecutor) driver4;
 //   jse.executeScript("window.scrollBy(0,250)", "");
	
    //Scroll to bottom og page
  //  JavascriptExecutor jse = (JavascriptExecutor) driver4;
 //   jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    
//	ActionChains action_chains = ActionChains(driver);
//	action_chains.drag_and_drop(source, target)
//	
	
}




}
