package com.cashkaro.pageLibrary.homePage;

import org.openqa.selenium.By;

import com.cashkaro.testbase.TestBase;
import com.relevantcodes.extentreports.ExtentTest;

public class forgotPasswordFrame extends TestBase{

	public void enterEmailclickSubmit (String emailData,String expMessage) throws Exception {

		String stepResult = setText ("cashkaro.forPwdFrame.eMailIDText",emailData);
		fnCheckAndLogExtentResult(stepResult,"Enter email in text field.Enter value - " + emailData,"Email entered","Unable to enter Email");
		elemWait(getWebElement("cashkaro.forPwdFrame.submitRequestButton"));
		stepResult = clickWebElement ("cashkaro.forPwdFrame.submitRequestButton");
		fnCheckAndLogExtentResult(stepResult,"Click button - Submit Request","Button clicked","Unable to click button");
		
		//cashkaro.forPwdFrame.validloginMessage1
		//String Val2 = driver.findElement(By.xpath("//p[contains(text(),'this email address')]")).getText();
		//An email has been sent with your new password. Please check your email now.
		if(emailData.contains("NOT@"))
		{
			//Thread.sleep(700);
			elemWait(getWebElement("cashkaro.forPwdFrame.validloginMessage1"));
			String textValue = getText("cashkaro.forPwdFrame.validloginMessage1");
			fnExtentCompareString (textValue,expMessage,test,"Validate message for valid but not registered email - "+emailData,"Message appears correctly","Message not correct");
			System.out.println("message - " + textValue );
		}
		else if (emailData.contains("@"))
		{
			//Thread.sleep(700);
			elemWait(getWebElement("cashkaro.forPwdFrame.validloginMessage2"));
			String textValue = getText("cashkaro.forPwdFrame.validloginMessage2");
			fnExtentCompareString (textValue,expMessage,test,"Validate message for valid registered email - "+emailData,"Message appears correctly","Message not correct");
			//System.out.println("message - " + textValue );
		}
	
		else
		{	
		String textValue = getText("cashkaro.forPwdFrame.loginMessage");
		fnExtentCompareString (textValue,expMessage,test,"Validate message for invalid entry - "+emailData,"Message appears correctly","Message not correct");
		System.out.println("message - " + textValue );
		}
		
		
		
		clearText("cashkaro.forPwdFrame.eMailIDText");

	}
	
	///html/body/section/div[2]/p/text()
	
	public void closeFrame() throws InterruptedException
	{
		switchDefault();
		String stepResult = clickWebElement ("cashkaro.forPwdFrame.close");
		Thread.sleep(700);
		fnCheckAndLogExtentResult(stepResult,"Close Forgot Password frame","Frame closed","Unable to close frame");
	}
	
		
}
