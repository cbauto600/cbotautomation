package com.cbautomate.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.cbautomate.utilities.BasePageUtils;

public class SnatchLandingPage extends BasePageUtils {
	public SnatchLandingPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}

	@FindBy(xpath = "//input[@type='email']")
	public WebElement emailID;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement passwordBtn;

	@FindBy(xpath = "//button[@data-test='sign_in_btn']/span")
	public WebElement signInBtn;

	@FindBy(id = "customerCurrency")
	WebElement currencydrl;

	@FindBy(linkText = "Computers")
	WebElement ComputerMenu;

	@FindBy(linkText = "Notebooks")
	WebElement NotbooksMenu;
	
	/**
	* This function implements openRegistrationPageAndLogin.
	*
	* @author Aniruddha Majumdar
	* @since   09/01/2021
	*/

	public void openRegistrationPageAndLogin(String email, String password) throws IOException, InterruptedException {
		clickButton(emailID);
		setTextElementText(emailID, email);
		clickButton(passwordBtn);
		setTextElementText(passwordBtn, password);
		clickButton(signInBtn);
		Thread.sleep(5000);
		

	}

}
