import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class googlelogger {
WebDriver driver;
	
@Test	
public void login() throws Exception 
{
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://accounts.google.com/");
	driver.findElement(By.id("Email")).sendKeys("");
	Thread.sleep(500);
	driver.findElement(By.id("next")).click();
	Thread.sleep(500);
	driver.findElement(By.id("Passwd")).sendKeys("");
	Thread.sleep(500);
	driver.findElement(By.id("signIn")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//a[@href='https://mail.google.com']")).click();
	
	
}
}