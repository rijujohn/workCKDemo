import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;











import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.DependencyMap;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class amazondropdown {
	
	WebDriver driver;
	
@BeforeTest
	public void Initiate() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	
@Test(priority=0)	
	public void Login() throws InterruptedException
		{	
		//System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
		driver.get("http://www.amazon.in/");
		//*[@id="nav-link-yourAccount"]/span[2]
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	    
@Test(dependsOnMethods={"Login"})
	public void CheckAllCategories() throws InterruptedException{  
	    
	    Select fgh = new Select(driver.findElement(By.id("searchDropdownBox")));
	    fgh.selectByVisibleText("Amazon Fashion");
	    List<WebElement> opt = fgh.getOptions();
	
	    LinkedList<String> valToCompDrop = new LinkedList<String>();
	    valToCompDrop.add("All Categories");
	    valToCompDrop.add("Amazon Fashion");
	    int i = 0;
	    for (WebElement fg : opt)
	    {
	    //	System.out.println("The values are "+ fg.getText());
	   // 	LinkedList<String> inTest = new LinkedList();
	    	String DropReurn = fg.getText();
	    	String actualDrop = fg.getText().trim();
	    	String actualSave = valToCompDrop.poll();
	    	 Assert.assertEquals(actualDrop, actualSave);
	    	 Thread.sleep(17000);
	    	 i++;
	    	 if(i == 2)
	    	 {break;}
	    }
	    System.out.println("Done - CheckAllCategories");
		}
	    
	    
@Test(dependsOnMethods={"Login"})
	public void CheckSearchSuggestions() throws InterruptedException{  
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hardr");
	    Thread.sleep(1000);
	    //List<WebElement> sear = driver.findElements(By.xpath("//div[@id='issDiv1')]"));
	    //List<WebElement> sear = driver.findElements(By.xpath("//div[contains(@id,'issDiv1')]"));
	    
	    WebElement sugg = driver.findElement(By.id("suggestions"));
	    List<WebElement> sear =  sugg.findElements(By.xpath("//div[contains(@id,'issDiv')]"));
	    LinkedList<String> valToComp = new LinkedList<String>();
	    valToComp.add("hard drive in Electronics");
	    valToComp.add("hard drive in Computers & Accessories");
	    
	    
	    
	   // List<WebElement> sear = driver.findElements(By.xpath("//div[contains(@id,'issDiv1')]"));
	    System.out.println(sear.size());
	    for (WebElement fgm : sear)
	    {
	    	System.out.println("Thename is " + fgm.getText().trim() +" and the - "+ fgm.getAttribute("id"));
	    	String sdf = fgm.getText().trim();
	    	String sdfn = valToComp.poll();
	    	
	    	System.out.println("Retreived value" + sdf +" value for checking "+ sdfn);
	    	// Assert.assertTrue(sdfn.compareTo(anotherString));
	    	 Assert.assertEquals(sdf, sdfn);
    
	    }
	    
	    System.out.println("Done - CheckSearchSuggestions");
	    
	  //*[@id="nav_prefetch_yourorders"]/span   
	    
	  //  System.out.println(sear.size());
	    
	    
	   
	    
		}
	

@Test(dependsOnMethods={"Login"})
	public void CheckYourOrders()
		{
		WebElement yourOrder = driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[2]"));
		String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		((JavascriptExecutor)driver).executeScript(mouseOverScript,yourOrder);
		
		WebElement youOrder = driver.findElement(By.id("nav-flyout-yourAccount"));
	    
		LinkedList<String> expectedItm = new LinkedList<String>();
		expectedItm.add("Your Account");
		expectedItm.add("Your Orders");
		expectedItm.add("Your Wish List");
		
		List<WebElement> mvn = youOrder.findElements(By.className("nav-text"));
        int counter = 1;
		System.out.println(mvn.size());
		for(WebElement ghjk : mvn)
		{
	
			
			boolean bn = ghjk.isDisplayed();

			System.out.println(ghjk.getText());
			System.out.println(bn);
			String exp1 = expectedItm.poll();
			String retstuff = ghjk.getText();
			int ui = exp1.compareTo(retstuff);
			Assert.assertEquals(0,ui);
			if (counter == 3){break;}
			
			counter ++;
		}	
		
		WebElement fghd = driver.findElement(By.id("twotabsearchtextbox"));
		fghd.click();
		
		
		}


@Test(dependsOnMethods={"Login"})
	public void VerifyCartContent()
		{
			WebElement cartElem = driver.findElement(By.id("nav-cart"));
			String orderCount = cartElem.findElement(By.id("nav-cart-count")).getText();
			int bn = Integer.parseInt(orderCount);
			Assert.assertEquals(0, bn);
		}

@Test(dependsOnMethods={"Login"})
	public void CheckYourLists()
		{
		WebElement yourWLList = driver.findElement(By.xpath("//*[@id='nav-link-wishlist']"));
		String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		((JavascriptExecutor)driver).executeScript(mouseOverScript,yourWLList);
		
		//WebElement yourWLList = driver.findElement(By.id("nav-link-wishlist"));
		////*[@id="nav-link-wishlist"]
		LinkedList<String> expectedItm = new LinkedList<String>();
		expectedItm.add("Create a Wish List");
		expectedItm.add("Find a Wish List");
		expectedItm.add("Wish from any");
		
		List<WebElement> mvn = yourWLList.findElements(By.className("nav-text"));
		int counter = 1;
		System.out.println(mvn.size());
		for(WebElement ghjk : mvn)
		{
		
			
			boolean bn = ghjk.isDisplayed();
		
			System.out.println(ghjk.getText());
			System.out.println(bn);
			String exp1 = expectedItm.poll();
			String retstuff = ghjk.getText();
			int ui = exp1.compareTo(retstuff);
			Assert.assertEquals(0,ui);
			if (counter == 3){break;}
			
			counter ++;
		}	
		
		WebElement fghd = driver.findElement(By.id("twotabsearchtextbox"));
		String mouseOverScript2 = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		((JavascriptExecutor)driver).executeScript(mouseOverScript2,fghd);
		
		}


@Test(dependsOnMethods={"CheckYourOrders"})
	public void verifyTryPrime()
		{
			
			WebElement prime = driver.findElement(By.id("nav-flyout-prime"));
			String pobef = prime.getAttribute("style");
			WebElement yourPrime = driver.findElement(By.xpath("//*[@id='nav-link-prime']"));
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			((JavascriptExecutor)driver).executeScript(mouseOverScript,yourPrime);
			
			WebElement prime2 = driver.findElement(By.id("nav-flyout-prime"));
			WebDriverWait waiter = new WebDriverWait(driver, 20);
			WebElement prime23 = waiter.until(ExpectedConditions.elementToBeClickable(prime2));
			String po = prime23.getAttribute("style");
			System.out.println("The style is"+ po);
			Assert.assertTrue(po.contains("block"));
		}


@Test(dependsOnMethods={"Login"})
public void verifyImageSliding()
{
	WebElement slider = driver.findElement(By.xpath("//div[@class='a-carousel-col a-carousel-left']"));
	slider.click();
	slider.click();
	//Webe
	List<WebElement> imapgo =  driver.findElements(By.cssSelector("div[id^='gw-ftGr-desktop-hero-']"));
	
	for (WebElement ghjk : imapgo)
	{
		if(ghjk.isEnabled())
			{ String dfg = ghjk.findElement(By.tagName("img")).getAttribute("height").toString();
			System.out.println(dfg);
			}
	}
	
	
	
}



}
