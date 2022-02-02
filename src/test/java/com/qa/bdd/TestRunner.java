package com.qa.bdd;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"com/qa/bdd/carriere/stepdsDefinitions"},plugin={"pretty","html:target/HtmlReports/report" ,"json:target/HtmlReports/cucumber.json"})

public class TestRunner {
	
}
