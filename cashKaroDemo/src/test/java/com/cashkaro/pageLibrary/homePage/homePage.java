package com.cashkaro.pageLibrary.homePage;

import java.util.ArrayList;

import com.cashkaro.testbase.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class homePage extends TestBase {
	
	
	public void clickSignINButton () throws InterruptedException {

	elemWait(getWebElement("cashkaro.homePage.signInLink"));
	String stepResult = clickWebElement ("cashkaro.homePage.signInLink");
	fnCheckAndLogExtentResult(stepResult,"Open home page and click the SignIN link","Opened home page,clicked SignIN link","Unable to click SignIN link");
	//getWebElement("cashkaro.homePage.signInButton").click();
	//driverwait();
	Thread.sleep(5000);//cashkaro.signInPage.forgotPwdink
	stepResult = switchFrame (getWebElement("cashkaro.signInframe"));
	elemWait(getWebElement("cashkaro.signInPage.forgotPwdink"));
	fnCheckAndLogExtentResult(stepResult,"Switch control to the SignIN frame","Control switched to the SignIN frame","Control not switched to the SignIN frame");
		
	}
	
	
	public void clickJoinFreeButton () throws InterruptedException {
		
		elemWait(getWebElement("cashkaro.homePage.joinFreeButton"));
		String stepResult = clickWebElement ("cashkaro.homePage.joinFreeButton");
		fnCheckAndLogExtentResult(stepResult,"Click Join Free Button","Clicked on button","Unable to click on button");
	}
	
	public void validateTheFrameItems() throws InterruptedException
	{
		ArrayList<String> frameChildren = verifyChildItems("cashkaro.homePage.offerSection");
		ArrayList<String> frameChildren2 = verifyChildItems("cashkaro.homePage.siteHeading");
		ArrayList<String> frameChildren3 = verifyChildItems("cashkaro.homePage.howToEarnCashBack");
		
		System.out.println(frameChildren);
		System.out.println(frameChildren2);
		System.out.println(frameChildren3);
	}
	
}
