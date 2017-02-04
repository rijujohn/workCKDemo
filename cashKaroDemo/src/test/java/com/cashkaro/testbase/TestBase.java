package com.cashkaro.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.cashkaro.excelReader.Xls_Reader;
import com.cashkaro.testutil.Utils;

public class TestBase extends Utils {
	
	public static Properties Repository = new Properties();
	public File f;
	public FileInputStream FI;
	public Xls_Reader Data;
	public String BrowserRunType = Repository.getProperty("browser");

   // WebDriver driver;

	
	public void init() throws IOException 
	{
		loadPropertiesFile();
		driver = selectBrowser(Repository.getProperty("browser"));
		//implicitWait(30);
		driver.get(Repository.getProperty("url"));
      //  Repository.getProperty("url");
		
	}
	
	
	
	
public void loadPropertiesFile() throws IOException
{
	f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cashkaro\\config\\config.properties");
    FI = new FileInputStream(f);
    Repository.load(FI);
    
	f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cashkaro\\pagelocators\\homePage.properties");
    FI = new FileInputStream(f);
    Repository.load(FI);
    
    f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cashkaro\\pagelocators\\signInPage.properties");
    FI = new FileInputStream(f);
    Repository.load(FI);
    
    f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cashkaro\\pagelocators\\forPwdFrame.properties");
    FI = new FileInputStream(f);
    Repository.load(FI);
    
    f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cashkaro\\pagelocators\\userHomePage.properties");
    FI = new FileInputStream(f);
    Repository.load(FI);
    
    f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cashkaro\\pagelocators\\joinNowPage.properties");
    FI = new FileInputStream(f);
    Repository.load(FI);


}

public WebElement getLocator(String locator) throws Exception 

{
	String locatorType = locator.split("__")[0];
	String locatorValue = locator.split("__")[1];
	
	if (locatorType.toLowerCase().equals("id"))
		return driver.findElement(By.id(locatorValue));

	else if (locatorType.toLowerCase().equals("name"))
		return driver.findElement(By.name(locatorValue));
	
	else if (locatorType.toLowerCase().equals("linktext"))
		return driver.findElement(By.linkText(locatorValue));
	
	else if (locatorType.toLowerCase().equals("xpath"))
		return driver.findElement(By.xpath(locatorValue));

	else if (locatorType.toLowerCase().equals("css"))
		return driver.findElement(By.cssSelector(locatorValue));
	
	else if (locatorType.toLowerCase().equals("classname"))
		return driver.findElement(By.className(locatorValue));
	
	else
		throw new Exception("Unknown Locator Type" + locatorType );
	
}


public  WebElement getWebElement(String locator) 
{   
	try{
	WebElement locatorProp = getLocator (Repository.getProperty(locator));
	System.out.println ("Webelement --> '" + locator + "' was found in the page.");
	Reporter.log("Webelement --> '" + locator + "' was found in the page.");
	return locatorProp ;
	}
	catch (Throwable error)
	{   
		System.out.println ("Webelement --> '" + locator + "' was not found in the page.Error --> '"+error.getMessage());
		Reporter.log("Webelement --> '" + locator + "' was not found in the page.Error --> '"+error.getMessage());
		return null ;	
		
	}
}

public String clickWebElement (String locator)
{	
	try{
	getWebElement(locator).click();
	//System.out.println("Clicked on Webelement --> '" + locator + "'" );
	Reporter.log("Clicked on Webelement --> '" + locator + "'");
	return "Pass";
	}
    catch (Throwable error)
    { 	
    	//System.out.println("Unable to click on Webelement--> '" + locator + "'.Error - " + error.getMessage());
    	Reporter.log("Unable to click on Webelement--> '" + locator + "'.Error -" + error.getMessage()); 
    	return "Fail";
     }

}

public String setText (String locator,String textToEnter)
{	
	try{
	//getWebElement(locator).clear();
	getWebElement(locator).sendKeys(textToEnter);
	Reporter.log("Text --> '"+textToEnter+"' entered in text field --> '" + locator + "'");
	return "Pass";
	}
    catch (Throwable error)
    { 	
    	Reporter.log("Text --> '"+textToEnter+"' not entered in text field --> '" + locator + "'.Error -" + error.getMessage()); 
    return "Fail"; 
    }
	
}

public String setTextAction(String locator,String textToEnter)
{try{
		Actions actions = new Actions(driver);
		actions.moveToElement(getWebElement(locator));
		//actions.click();
		actions.click();
		actions.sendKeys(textToEnter);
		actions.build().perform();
        Reporter.log("Text --> '"+textToEnter+"' entered in text field --> '" + locator + "'");
        return "Pass";
}
catch(Throwable error)
{
Reporter.log("Text --> '"+textToEnter+"' entered in text field --> '" + locator + "'");
return "Fail";
}
}


public String clearText (String locator)
{	
	try{
	getWebElement(locator).clear();
	Reporter.log("Text cleared from text field --> '" + locator + "'");
	return "Pass";
	}
    catch (Throwable error)
    { 	
    	Reporter.log("Text not cleared from text field --> '" + locator + "'.Error -" + error.getMessage()); 
    	return "Fail"; 
     }
	
}


public String getText(String locator) throws Exception
{   
	WebElement ele = getWebElement(locator);
	String eleText = ele.getText();
	Reporter.log("Text --> '" + eleText + "' was retreived for field --> '"+ locator +"'");
	return eleText;
}
//.getAttribute("value");

public String getValue (String locator)
{	
	try{
	String retVal = getWebElement(locator).getAttribute("value");
	Reporter.log("Text returned from web element --> '" + locator + "'.Value --> '" + retVal +"'");
	return retVal;
	}
    catch (Throwable error)
    { 	
    	Reporter.log("Text not returned from web element --> '" + locator + "'.Error -" + error.getMessage()); 
    	return "Fail"; 
     }
	
}



public String closeBrowser()
{   
	try{
	driver.quit();
	Reporter.log("Close browser error");
	return "Pass";
	}
	catch(Throwable error)
	{
	Reporter.log("Unable to close browser error" + error.getMessage() );
	return "Fail";	
	}
}

public Object[][] getData (String ExcelSheetName,String testCase)
{
	Data = new Xls_Reader(System.getProperty("user.dir") + "//src//test//java//com//cashkaro//testData//"+ExcelSheetName);
    int rowNum = Data.getRowCount(testCase);
    int colNum = Data.getColumnCount(testCase);
	Object sampleData[][] = new Object[rowNum - 1][colNum];
	for(int i = 2;i<=rowNum;i++){
		for(int j = 0;i<=colNum;j++){
			sampleData[i-2][j] = Data.getCellData(testCase,j,i);
		}
	}
	return sampleData;
}


//C:\\Users\\dell\\workspace\\com.maventest.test1\\testData\\InputData.xlsx



public ArrayList<String> verifyChildItems(String locator) throws InterruptedException
{
	Thread.sleep(2000);
//Find the parent element (like frame for ul etc)	
WebElement ele = getWebElement(locator);
//-->WebElement el = driver.findElement(By.xpath("//ul[@class='fl top_offer']"));
//WebElement el2 = el.findElement(By.xpath("//p[contains(text(),'Flipkart Fashion Sale')]"));
//System.out.println(el2.getText());
//Loop through the child elements
List<WebElement> childs = ele.findElements(By.xpath(".//*"));
ArrayList<String> pageTexts = new ArrayList<String>();
for (WebElement e  : childs)
{
  String st = e.getText();
  //String tagName = e.getTagName();
	if (st.isEmpty())
	{
  //  System.out.println(e.getAttribute("alt"));
  //  System.out.println(e.getAttribute("href"));
	pageTexts.add(e.getTagName());
    pageTexts.add(e.getAttribute("alt"));
    pageTexts.add(e.getAttribute("href"));
	}
	else
	{	
		pageTexts.add(e.getTagName());
		pageTexts.add(e.getText());
	}

	
} 
return pageTexts;
}










}



















