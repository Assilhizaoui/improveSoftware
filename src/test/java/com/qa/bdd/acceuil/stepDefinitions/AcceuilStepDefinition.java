package com.qa.bdd.acceuil.stepDefinitions;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.log.Log;

import com.qa.bdd.acceuil.pages.AccueilPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AcceuilStepDefinition {

	WebDriver driver;
	AccueilPage partners;
	Logger log;

@Before
public void Setup() {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	log = Logger.getLogger(Log.class.getName());
	log.setLevel(Level.INFO);
	
	driver.manage().window().maximize();
	partners = new AccueilPage(driver);

	}

	@Given("^I navigates to ImproveSoftware Site$")
	public void i_navigates_to_ImproveSoftware_Site() throws Throwable {
	driver.get("https://improve-software.com/");
	log.info("I'm in Improve Software");
	}

	@When("^I click on Adents icon$")
	public void i_click_on_Adents_icon() throws Throwable {
		partners.clickOnAdents();
		log.info("Adents Web site is opened Successfully");
	}

	@Then("i verify taht  Adents WebSite is opened with success")
	public void i_verify_taht_adents_web_site_is_opened_with_success() {
	   partners.PartnersTitle();
	}
	@When("I click on Seloger icon")
	public void i_click_on_seloger_icon() {
	   partners.clickOnSeloger();
	   log.info("Seloger Web site is opened Successfully");
	}

	@Then("i verify that Seloger WebSite is opened with success")
	public void i_verify_that_seloger_web_site_is_opened_with_success() {
		partners.PartnersTitle();
	}
	
	@When("I click on Solocal icon")
	public void i_click_on_solocal_icon() {
	  partners.clickOnSolocal();
	  log.info("Solocal Web site is opened Successfully");
	}

	@Then("i verify that Solocal WebSite is opened successfully")
	public void i_verify_that_solocal_web_site_is_opened_successfully() {
		partners.PartnersTitle();
	}

	@When("I click on Carrefour icon")
	public void i_click_on_carrefour_icon() {
	    partners.clickOnCarrefour();
	    log.info("Carrefour Web site is opened Successfully");
	}

	@Then("i verify that Carrefour WebSite is opened successfully")
	public void i_verify_that_carrefour_web_site_is_opened_successfully() {
		partners.PartnersTitle();
		
	}

	@When("I click on Engie icon")
	public void i_click_on_engie_icon() {
	partners.clickOnEngie();
	log.info("Engie Web site is opened Successfully");
	}

	@Then("i verify that Engie WebSite is opened successfully")
	public void i_verify_that_engie_web_site_is_opened_successfully() {
		partners.PartnersTitle();
	}

	@When("I click on Orange icon")
	public void i_click_on_orange_icon() {
	 partners.clickOnOrange();
	 log.info("Orange Web site is opened Successfully");
	}

	@Then("i verify that Orange WebSite is opened successfully")
	public void i_verify_that_orange_web_site_is_opened_successfully() {
		partners.PartnersTitle();
	}
	
	
	
	
	@After
	public void tear_down() {
		driver.quit();
	}
}
