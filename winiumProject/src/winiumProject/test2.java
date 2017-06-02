package winiumProject;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class test2 {
	 @Test
	 public void test() throws IOException{
	  DesktopOptions options= new DesktopOptions();
	  options.setApplicationPath("C:\\WINDOWS\\system32\\notepad.exe");
	  try{
	   WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"),options);
	   driver.findElementByClassName("Edit").sendKeys("This is sample test");
	//   driver.close();
	  }
	  catch(Exception e){
	   System.out.println(e.getMessage());
	  }
	 }
}
