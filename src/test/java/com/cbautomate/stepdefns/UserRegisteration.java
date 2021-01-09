package com.cbautomate.stepdefns;

import java.io.IOException;

import com.cbautomate.pages.ChatBotAssertionPage;
import com.cbautomate.pages.OverViewPage;
import com.cbautomate.pages.SnatchLandingPage;
import com.cbautomate.utilities.WebdriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegisteration extends WebdriverUtils {

	SnatchLandingPage homeObject;
	OverViewPage overViewPageObject;
	ChatBotAssertionPage chatBotAssertionPageObject;

	@Given("^The user in the home page and enters \"([^\"]*)\" , \"([^\"]*)\"$")
	public void the_user_in_the_home_page(String email, String password) throws IOException, InterruptedException {
		homeObject = new SnatchLandingPage(driver);
		homeObject.openRegistrationPageAndLogin(email, password);
	}

	@When("^User clicks on configure button and change the name of the bot name and desc as \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_entered(String botName, String botDesc) throws IOException, InterruptedException {
		overViewPageObject = new OverViewPage(driver);
		overViewPageObject.configureBots(botName, botDesc);
	}

	@Then("^The user clicks on bot operations and verifies$")
	public void the_registeration_page_displayed_successfully() throws IOException, InterruptedException {
		chatBotAssertionPageObject =new ChatBotAssertionPage(driver);
		chatBotAssertionPageObject.chatBotsOpsAndAssertion();
	}

}
