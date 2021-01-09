package com.cbautomate.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.cbautomate.utilities.BasePageUtils;
import com.cbautomate.utilities.Constants;
 
public class ChatBotAssertionPage extends BasePageUtils {
	public ChatBotAssertionPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}

	@FindBy(xpath = "//div[@id='sntch_button']")
	public WebElement clickBotInterface;

	@FindBy(xpath = "//div[@class='mat-form-field-infix']/textarea")
	public WebElement botMessageArea;
	
	@FindBy(xpath = "(//div[@class='ps-content']/div/div/div[2]/div/div/p)")
	public WebElement botMessageAreaText;

	@FindBy(xpath = "//span[text()='Reception schedule']/../../button")
	public WebElement receptionSchedule;

	@FindBy(xpath = "(//div[@class='ps-content']/div/div/div[2]/div/div/p)[3]")
	public WebElement checkRecemptionSchedule;

	@FindBy(xpath = "//button/span[text()='See our contacts']")
	public WebElement contactsMenu;
	
	@FindBy(xpath = "//button/span[text()='Back to menu']")
	WebElement quotesMenu;
	
	@FindBy(xpath = "//div[@id='sntch_close']")
	WebElement closeWindow;
	
	@FindBy(xpath = "//label[text()='Logout']")
	WebElement logout;

	/**
	* This function implements compares an text displayed in UI  
	* to the standard output.
	*
	* @author Aniruddha Majumdar
	* @since   09/01/2021
	*/
	public void chatBotsOpsAndAssertion() throws IOException, InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(true,botMessageArea.isDisplayed());
		clickButton(clickBotInterface);
		driver.switchTo().frame("sntch_iframe");
		assertContains(Constants.TEXTVERIFICATIONONE,botMessageAreaText.getText());
		clickButton(receptionSchedule);
		Thread.sleep(5000);
		clickButton(contactsMenu);
		Thread.sleep(5000);
		clickButton(quotesMenu);
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		clickButton(closeWindow);
		clickButton(logout);

	}

}
