package com.qa.bdd.acceuil.stepDefinitions;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.log.Log;

import acceuil.pages.AccueilPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccueilServicesStepDef {

	WebDriver driver;

	AccueilPage Accpage;

	Logger log;

	
	@Before
	public void Setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		log = Logger.getLogger(Log.class.getName());
		log.setLevel(Level.INFO);
		
		driver.manage().window().maximize();
		Accpage = new AccueilPage(driver);

		}
//	@Given("I navigates to Improve Software Site")
//	public void i_navigates_to_improve_software_site() {
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		log = Logger.getLogger(Log.class.getName());
//		driver.get("https://improve-software.com/");
//		log.setLevel(Level.INFO);
//		driver.manage().window().maximize();
//		Accpage = new AccueilPage(driver);
//		
//	}

	
//
//	@Given("I navigate to Improve Software Site")
//	public void i_navigate_to_improve_software_site() {
//	    
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("I click on the  consultingIcon in step")
	public void i_click_on_the_consulting_icon_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on the  assitanceRecruIcon in step")
	public void i_click_on_the_assitance_recru_icon_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on the  centreExcellenceIcon in step")
	public void i_click_on_the_centre_excellence_icon_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I check that we are redirect to Consulting - Improve SoftwareImprove Software - Pour une meilleure expérience digitale in step")
	public void i_check_that_we_are_redirect_to_consulting_improve_software_improve_software_pour_une_meilleure_expérience_digitale_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I check that we are redirect to Assistance au recrutement - Improve SoftwareImprove Software - Pour une meilleure expérience digitale in step")
	public void i_check_that_we_are_redirect_to_assistance_au_recrutement_improve_software_improve_software_pour_une_meilleure_expérience_digitale_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I check that we are redirect to Centre d’Excellence en Testing - Improve SoftwareImprove Software - Pour une meilleure expérience digitale in step")
	public void i_check_that_we_are_redirect_to_centre_d_excellence_en_testing_improve_software_improve_software_pour_une_meilleure_expérience_digitale_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@After
	public void tear_down() {
		driver.quit();
	}
}
