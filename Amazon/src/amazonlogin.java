import java.awt.Robot;
import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class amazonlogin {

WebDriver driver;	
@Test	
public void mnm() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.amazon.in/");
	//*[@id="nav-link-yourAccount"]/span[2]
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   
    driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[2]")).click();
	//	xpath__//p[contains(text(),'this email address')]
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("ap_email")).sendKeys("rijusamueljohn@gmail.com");
	Thread.sleep(100);
	driver.findElement(By.id("ap_password")).sendKeys("blueberry");
	Thread.sleep(100);
	driver.findElement(By.id("signInSubmit")).click();
	
	WebElement yourOrder = driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[2]"));
	String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
	((JavascriptExecutor)driver).executeScript(mouseOverScript,yourOrder);
	
	Thread.sleep(5000);
	driver.findElement(By.id("nav-item-signout")).click();
	
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Assert.assertTrue(driver.findElement(By.id("ap_email")).isDisplayed());
	
	driver.close();
	
	
	
	//*[@id="nav-flyout-yourAccount"]/div[2]/a[4]/span
	
	
}	
}
