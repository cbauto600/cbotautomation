package com.cbautomate.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cbautomate.pages.ChatBotAssertionPage;
import com.cbautomate.pages.OverViewPage;
import com.cbautomate.pages.SnatchLandingPage;
import com.cbautomate.utilities.WebdriverUtils;


/**
* This class describes chat bot creation test.
*
* @author Aniruddha Majumdar
* @since   09/01/2021
*/

public class ChatBotCreationTest extends WebdriverUtils
{

	/*
	 * 1- User Login
	 * 2- Search for Bot and Configure
	 * 3- Add and Assert Bot functionalities. 
	 
	 */

	SnatchLandingPage homeObject ; 
	OverViewPage overViewPageObject;
	ChatBotAssertionPage chatBotAssertionPageObject;

	// 1- User Login 
	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() throws IOException, InterruptedException 
	{
		homeObject = new SnatchLandingPage(driver); 
		homeObject.openRegistrationPageAndLogin("cbauto983@gmail.com", "cbAuto123");
		
	}

	// 2- Search For Bot and configure
	@Test(priority=2)
	public void userCanConfigureChatBot() 
	{
		try {
			overViewPageObject = new OverViewPage(driver); 
			overViewPageObject.configureBots("My Test HealthCare Bot", "Welcome to Test bot!");
			
		} catch (Exception e) {
			System.out.println("Error occurred  " + e.getMessage());
		}
	}

	// 3- Add and Assert Bot functionalities. 
	@Test(priority=3)
	public void chatBotFunctionAndAssertionMethod() throws IOException, InterruptedException 
	{
		chatBotAssertionPageObject=new ChatBotAssertionPage(driver);
		chatBotAssertionPageObject.chatBotsOpsAndAssertion();
	//	Assert.assertTrue(reviewObject.reviewNotification.getText()
	//			.contains("Product review is successfully added."));
	}

	
}
