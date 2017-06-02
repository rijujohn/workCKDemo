package javaarray;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testbed {
	
WebDriver driver;	
	
@Test
public void sampletest() throws InterruptedException
{//D://SeleniumDrivers//chromedriver.exe
	//System.setProperty("webdriver.chrome.driver",+"\\src\\test\\java\\com\\cashkaro\\browserDriver\\chromedriver.exe");
	
	System.setProperty("webdriver.chrome.driver", "D://SeleniumDrivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://cashkaro.iamsavings.co.uk/");
	Thread.sleep(2000);
	//WebElement el = driver.findElement(By.xpath("//ul/li[1]"));
	
//	WebElement el = driver.findElement(By.xpath("//ul[@class='fl pos']"));
	//WebElement el = driver.findElement(By.xpath("//img[@src='/images/no-image.jpg']"));
//	WebElement el = driver.findElement(By.xpath("//div/ul/li/ul//li[@src='/images/no-image.jpg']"));
//	el.click();
	
	WebElement el = driver.findElement(By.xpath("//ul[@class='fl top_offer']"));
	
	WebElement el2 = el.findElement(By.xpath("//p[contains(text(),'Flipkart Fashion Sale')]"));
	
	System.out.println(el2.getText());
	
	List<WebElement> childs = el.findElements(By.xpath(".//*"));
	ArrayList<String> hjn = new ArrayList<String>();
    for (WebElement e  : childs)
    {
      String st = e.getText();
    	
    	if (st.isEmpty())
    	{
        System.out.println(e.getAttribute("alt"));
        System.out.println(e.getAttribute("href"));
        hjn.add(e.getAttribute("alt"));
        hjn.add(e.getAttribute("href"));
    	}
    	else
    	{	
        hjn.add(e.getText());
    	}
     
    	
    	
    	
    	
      //  e.findElements(By.xpath("//p[@class='fl top_offer']");
        
        
    }
    
    System.out.println(hjn.toString());

	if (hjn.contains("End Of Reason Sale: 50% - 80% Off + 10% Citibank Cash + Upto 7% Cashback"))
	{
		System.out.println("yes");
		
	}
    
    //you can replace the above code with MyCurrentWebElement.findElements(By.xpath(".//*"));
//    /List<WebElement> childs = el.findElements(By.xpath("./child::*"));
//	WebElement el = driver.findElement(By.className("fl pos"));
	//Assert.assertEquals(el.getText(),"sdf");
	///html/body/div[1]/section[1]/section[2]/div/div/div/ul/li[1]/ul/li[2]
		//	 xpath__//p[contains(text(),'An email has been sent with your new password')]
		////	 xpath__//div[contains(text(),'Incorrect')]
		//	 xpath__//div[contains(text(),'Please re-enter your password')]
		//	xpath__//a[contains(text(),'Create New Account')]
		//	  xpath__//a[contains(text(),'Forgotten account')]
}
}
