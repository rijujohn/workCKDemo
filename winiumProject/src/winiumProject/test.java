package winiumProject;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.Test;

public class test {
	
	
	static WiniumDriver driver = null;
	static WiniumDriverService service = null;
	static DesktopOptions options = null;
	
	@Test
	public void startThing() throws IOException
	{
		
		options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		//File driverPath = new File("D:\\SeleniumDrivers\\Winium\\Winium.Desktop.Driver.exe");
	//	service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
	//	service.start();
		
		try{
			   driver=new WiniumDriver(new URL("http://localhost:9999"),options);
			//   driver.findElementByClassName("Edit").sendKeys("This is sample test");
			//   driver.close();
			  }
			  catch(Exception e){
			   System.out.println(e.getMessage());
			  }
		
		
		
		
		
	//	driver = new WiniumDriver(service,options);
		
		///driver = webdriver.Remote(command_executor='http://localhost:9999', desired_capabilities={"app": r"C:/windows/system32/calc.exe"})
		
		WebElement calcFrame = driver.findElement(By.className("CalcFrame"));
		WebElement menu = driver.findElement(By.id("MenuBar"));
		WebElement viewMenu = driver.findElement(By.name("View"));
		
		viewMenu.click();
		viewMenu.findElement(By.name("Scientific")).clear();
		
		calcFrame.findElement(By.id("132")).click();
		calcFrame.findElement(By.id("93")).click();
		calcFrame.findElement(By.id("134")).click();
		
		
	}
	
	
	

}
