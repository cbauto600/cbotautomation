package com.cbautomate.stepdefns;

import java.io.IOException;

import com.cbautomate.pages.SnatchLandingPage;
import com.cbautomate.utilities.WebdriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class UserRegisteration extends WebdriverUtils{

	SnatchLandingPage homeObject;
	//UserRegistrationPage registerObject;

	@Given("^The user in the home page and enters \"([^\"]*)\" , \"([^\"]*)\"$")
	public void the_user_in_the_home_page(String email, String password) throws IOException, InterruptedException {
		homeObject = new SnatchLandingPage(driver);
		homeObject.openRegistrationPageAndLogin(email , password);
	}

	
	@When("^User entered \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_entered(String firstname, String lastname, String email, String password) {
		//registerObject = new UserRegistrationPage(driver);
		//registerObject.userRegistration(firstname, lastname, email, password);
	}
	
/* 
	@Then("^The registeration page displayed successfully$")
	public void the_registeration_page_displayed_successfully() {
		registerObject.userLogout();
	}
	*/
}
