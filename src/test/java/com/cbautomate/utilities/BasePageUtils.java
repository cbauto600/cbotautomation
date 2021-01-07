package com.cbautomate.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePageUtils {

	protected WebDriver drvier ; 
	public JavascriptExecutor jse ; 
	public Select select ; 
	public Actions action ; 

	// create constructor 
	public BasePageUtils(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	protected static void clickButton(WebElement button) 
	{
		button.click();
	}
	
	protected static void setTextElementText(WebElement textElement , String value) 
	{
		textElement.sendKeys(value);
	}
	
	public void scrollToBottom() 
	
	{
		jse.executeScript("scrollBy(0,2500)"); 
	}
	
	public void clearText(WebElement element) 
	{
		element.clear();
	}
	
	public void explicitWait() throws IOException, InterruptedException 
	{
		 FileReader reader=new FileReader("userdata.properties");  
    	    Properties p=new Properties();  
		    p.load(reader);
		    int waitFor=Integer.parseInt(p.getProperty("waitTime")); 
		    Thread.sleep(waitFor);
		    System.out.println(p.getProperty("waitTime"));
	}
}
