package com.qa.bdd.contact.stepdsDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.bdd.contact.pages.ContactPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ContactStepDefinition   {


	private WebDriver driver;
	private String baseUrl = "https://improve-software.com/";
	private ContactPage contactpage;
	
	@Given("I am on contact page")
	public void i_am_on_contact_page() {
		
		System.out.println("Inside step : I am on contact page");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		contactpage = new ContactPage(driver);
		contactpage.getContact().click();
	}

	@When("I fill in all the fields")
	public void i_fill_in_all_the_fields() {
		System.out.println("Inside step : I fill in all the fields");
		contactpage.getTxt_nom().sendKeys("improve");
		contactpage.getTxt_prenom().sendKeys("software");
		contactpage.getTxt_emailContact().sendKeys("aaa@imp.com");
		contactpage.getTxt_societe().sendKeys("improve");
		contactpage.getTxt_telephoneContact().sendKeys("52525252");
		contactpage.getTxt_messageContact().sendKeys("c'est un test");
	}

	@And("I click on submit button")
	public void i_click_on_submit_button() {
		System.out.println("Inside step : I click on submit button");
		contactpage.getBtn_envoyer().click();
	}
	@Then("sending success message is displayed")
	public void my_message_is_sent() {
	    assertEquals("Merci pour votre message. Il a été envoyé.", contactpage.getTxt_msgOK().getText());
	    driver.close();
		
	}

	@When("I dont fill in all the fields")
	public void i_dont_fill_in_all_the_fields() {
		contactpage.getTxt_nom().sendKeys("improve");
		contactpage.getTxt_prenom().sendKeys("software");
		contactpage.getTxt_emailContact().sendKeys("aaa@imp.com");
	}
	
	@Then("sending failure message is displayed")
	public void sending_failure_message_is_displayed() {
	    assertEquals("Un ou plusieurs champs contiennent une erreur. Veuillez vérifier et essayer à nouveau.", contactpage.getTxt_msgNOK().getText());
	    driver.close();
	}
}
