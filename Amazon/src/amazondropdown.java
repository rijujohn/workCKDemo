import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
	    
		@Test()
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
	    	 i++;
	    	 if(i == 2)
	    	 {break;}
	    }
		}
	    
	    
		@Test()
		public void CheckSearchSuggestions() throws InterruptedException{  
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hardr");
	    Thread.sleep(500);
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
	    
	    
	    
	   
	    
	  //  System.out.println(sear.size());
}
	}
