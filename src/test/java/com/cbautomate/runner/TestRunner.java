package com.cbautomate.runner;

import com.cbautomate.utilities.WebdriverUtils;

import cucumber.api.CucumberOptions;



@CucumberOptions(features = "src\\test\\java\\features"
				,glue = {"steps"}
				,plugin = {"pretty","html:target/cucumber-html-report"} )
public class TestRunner extends WebdriverUtils{

}
