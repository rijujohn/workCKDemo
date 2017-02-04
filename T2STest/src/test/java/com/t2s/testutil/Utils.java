package com.t2s.testutil;


import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import junit.framework.Assert;

























import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Utils {
	
	public static WebDriver driver;
	public static ExtentTest test;
	public static String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\com\\t2s\\screenshot\\";
	public static WebDriver selectBrowser(String browser)
	
	{
		if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\java\\com\\t2s\\browserDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			return driver;
		}
		if (browser.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\java\\com\\t2s\\browserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		if (browser.equals("ie"))
		{
			driver = new InternetExplorerDriver();
			return driver;
		}
		
		return null;
	}
	
	public void implicitWait(int timeInSec)
	{
		Reporter.log("waiting for page to load..");
		try{
		driver.manage().timeouts().implicitlyWait(timeInSec, TimeUnit.SECONDS);
		Reporter.log("Page is loaded");
		}
		catch (Throwable error)
		{
			System.out.println("Timeout for page load request");
		//	Assert.assertTrue(false,"Time out for page after" +timeInSec + " seconds");
			Assert.assertTrue(false);
		}
		
		
	}
	
	public void driverwait () throws InterruptedException{
		
		Thread.sleep(30000);
		
	}	
	
	public void elemWait(WebElement elem )
	{	
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(elem));

	}
 
	public String switchFrame (WebElement elem )
	{	
		try{
		driver.switchTo().frame(elem);
		
		Reporter.log("Control switched to frame --> '" + elem + "'");
		return "Pass";
		}
        catch (Throwable error)
        { 	
        	
        	Reporter.log("Control not switched to frame --> '" + elem + "'.Error -" + error.getMessage()); 
        	return "Fail";
         }

	}
	//switchFrame (getWebElement("cashkaro.signInframe"));

	public String switchToPopUpFrame ()
	{	
		try{
		for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}	
		
		Reporter.log("Control switched to popup");
		return "Pass";
		}
        catch (Throwable error)
        { 	
        	
        	Reporter.log("Control not switched to popup.Error -" + error.getMessage()); 
        	return "Fail";
         }

	}
	
	public String switchToPopUpBrowserIndex (int brwIndex)
	{	
		try{
			List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(browserTabs.get(brwIndex));
			String brwTitle = driver.getTitle();

		
		Reporter.log("Control switched to popup browser");
		return brwTitle;
		}
        catch (Throwable error)
        { 	
        	
        	Reporter.log("Control not switched to popup browser.Error -" + error.getMessage()); 
        	return "Fail";
         }

	}
	
	public String closeUpBrowserIndex (int brwIndex)
	{	
		try{
			List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(browserTabs.get(brwIndex)).close();
	
		Reporter.log("Browser close");
		return "Pass";
		}
        catch (Throwable error)
        { 	
        	
        	Reporter.log("Browser not closed.Error -" + error.getMessage()); 
        	return "Fail";
         }

	}
	
	
	public void switchDefault ()
	{
	driver.switchTo().defaultContent();
	}
	
	public void fnExtentCompareString (String stActual,String stExpected,ExtentTest test,String testStep,String passMessage,String failMessage)
	{   String filePathNew = fntakeScreenShot(filePath,driver);
		if(stActual.equals(stExpected))
		{   
			passMessage = passMessage +"Actual Value - "+ stActual + "Expected Value"+ stExpected ;
			test.log(LogStatus.PASS,testStep, passMessage + test.addScreenCapture(filePathNew));
		}
		else
		{
			failMessage = failMessage +"Actual Value - "+ stActual + "Expected Value"+ stExpected ;
			test.log(LogStatus.FAIL,testStep, failMessage + test.addScreenCapture(filePathNew));
		}	
		}
	
	public String fntakeScreenShot(String filePath,WebDriver driver) {
		 String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		  filePath = filePath + timeStamp +".jpg" ;
		 //filePath = "C:\\Users\\dell\\workspace\\Extent_Reports\\image\\test1.jpg";
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     //The below method will save the screen shot in d drive with test method name 
	        try {
				FileUtils.copyFile(scrFile, new File(filePath));
				System.out.println("***Placed screen shot in "+ filePath +" ***");
				return filePath;
				
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("***Error While placing screen shot "+ e.getMessage());
				return null;
			}
	        }
	
	
public void fnCheckAndLogExtentResult(String stepResult,String description, String passMessage,String failMessage){
String filePathNew = fntakeScreenShot(filePath,driver);
if (stepResult.equals("Pass"))
{
test.log(LogStatus.PASS,description, passMessage + test.addScreenCapture(filePathNew));
}
else
{
test.log(LogStatus.FAIL,description, failMessage + test.addScreenCapture(filePathNew));
}	

}


public String fnSaveScreenShotByPoint() throws IOException
{ String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
String snapshotName = "Cap" + timeStamp +".png" ;
WebElement ele = driver.findElement(By.id("security_image"));
File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
BufferedImage  fullImg = ImageIO.read(screenshot);
// Get the location of element on the page
Point point = ele.getLocation();
// Get width and height of the element
int eleWidth = ele.getSize().getWidth();
int eleHeight = ele.getSize().getHeight();
// Crop the entire page screenshot to get only element screenshot
BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
   eleWidth, eleHeight);
ImageIO.write(eleScreenshot, "png", screenshot);
// Copy the element screenshot to disk
File screenshotLocationA = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cashkaro\\screenshot\\runtimeCaptcha\\"+snapshotName);
FileUtils.copyFile(screenshot, screenshotLocationA);
//return screenshotLocationA;

String sumVal = fnCompareCaptcha(screenshotLocationA);
System.out.println("Value is" +sumVal );
return sumVal;
}
//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\java\\com\\cashkaro\\browserDriver\\chromedriver.exe");

public String fnCompareCaptcha(File newFileLocation1)
{
String retval = "False";
//File newFileLocation1 = new File("C:\\Users\\dell\\Desktop\\images\\Sam.png");
Iterator it = FileUtils.iterateFiles(new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cashkaro\\captchaValidationImage\\"), null, false);
while(it.hasNext())
{
	String TheFileName = ((File) it.next()).getName();
//    System.out.println(((File) it.next()).getName());
 //  File screenshotLocationC = new File("C:\\Users\\dell\\Desktop\\images\\capchaNew.png");
   File screenshotLocationB = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cashkaro\\captchaValidationImage\\"+TheFileName);   
   float gm = compareImage(newFileLocation1, screenshotLocationB);
   if (gm == 100)
   {
   	System.out.println("Found"+TheFileName);
   	String[] ghspl = TheFileName.split(Pattern.quote(".")); 
   	System.out.println("Found"+ghspl[0]);
   	retval =  ghspl[0];
   	return retval;
   	//break; 
   }

}
   return retval;
}








public float compareImage(File fileA, File fileB) {

    float percentage = 0;
    try {
        // take buffer data from both image files //
        BufferedImage biA = ImageIO.read(fileA);
        DataBuffer dbA = biA.getData().getDataBuffer();
        int sizeA = dbA.getSize();
        BufferedImage biB = ImageIO.read(fileB);
        DataBuffer dbB = biB.getData().getDataBuffer();
        int sizeB = dbB.getSize();
        int count = 0;
        // compare data-buffer objects //
        if (sizeA == sizeB) {

            for (int i = 0; i < sizeA; i++) {

                if (dbA.getElem(i) == dbB.getElem(i)) {
                    count = count + 1;
                }

            }
            percentage = (count * 100) / sizeA;
        } else {
            System.out.println("Both the images are not of same size");
        }

    } catch (Exception e) {
        System.out.println("Failed to compare image files ..."+e.getMessage());
    }
    return percentage;
}


















}