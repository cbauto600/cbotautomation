package com.cbautomate.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.cbautomate.utilities.BasePageUtils;

public class OverViewPage extends BasePageUtils {
	public OverViewPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}

	@FindBy(xpath = "//a/label[text()='My Bots']")
	public WebElement myBotslink;

	@FindBy(xpath = "//button[@data-test='bot-action-configure']/span")
	public WebElement configureBtn;

	@FindBy(xpath = "//input[@name='name']")
	public WebElement botNameBtn;

	@FindBy(xpath = "//input[@name='description']")
	public WebElement botDescBtn;

	@FindBy(xpath = "//div/div[2]/h4")
	public WebElement clickBot;

	@FindBy(linkText = "Computers")
	WebElement ComputerMenu;

	@FindBy(linkText = "Notebooks")
	WebElement NotbooksMenu;
	
	/**
	* This function implements configure bots using botname and botdesc.
	*
	* @author Aniruddha Majumdar
	* @since   09/01/2021
	*/

	public void configureBots(String botName, String botDesc) throws IOException, InterruptedException {
		clickButton(myBotslink);
		clickButton(configureBtn);
		Thread.sleep(5000);
		clearText(botNameBtn);
		setTextElementText(botNameBtn, botName);
		clearText(botDescBtn);
		setTextElementText(botDescBtn, botDesc);
		clickButton(myBotslink);
		clickButton(clickBot);
		Thread.sleep(5000);
		explicitWait();

	}

}
