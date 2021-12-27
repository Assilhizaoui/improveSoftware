package com.qa.bdd.carriere.stepdsDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.bdd.carriere.pages.CarrierePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CarriereEnvoiCvStepDefinition {

	private WebDriver driver;
	private String baseUrl = "https://improve-software.com/";
	private CarrierePage carrierepage;


	@Given("Je suis dans la page Home")
	public void je_suis_dans_la_page_home() {
		System.out.println("Inside step : I am on carriere page");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		carrierepage = new CarrierePage(driver);

	}

	@When("J accede à la page carriere")
	public void j_accede_à_la_page_carriere() {
		carrierepage.getCarriere().click();
		assertTrue(driver.getTitle().contains("Carrières - Improve SoftwareImprove Software"));  
	}

	@And("je clique sur Envoyer votre CV")
	public void je_clique_sur_envoyer_votre_cv() {
		carrierepage.getEnvoyerCV().click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> I1 = windows.iterator();	
		String parent =I1.next();
		String child=I1.next();
		driver.switchTo().window(child);
		assertTrue(driver.getTitle().contains("Partager votre CV avec nous"));   
	}

	@And("je remplis les champs de forumulaire correctement")
	public void je_remplis_les_champs_de_forumulaire_correctement() {
		carrierepage.getNomCv().sendKeys("Abd");
		carrierepage.getPrenomCv().sendKeys("Hamadi");
		carrierepage.getEmailCv().sendKeys("a@improve.tn");
		carrierepage.getPosteCV().sendKeys("QA");
		carrierepage.getFichierCV().sendKeys("D:/Workspace_BDD/bdd/fichier_de _test.pdf");
		carrierepage.getSubmitCv().click();
	}



	@Then("Un message de succes d_envoi est affiché")
	public void un_message_de_succes_d_envoi_est_affiché() { 
		assertTrue(carrierepage.getMessageEnvoiCVOK().isDisplayed());      		
	}

	@When("^je remplis les champs (.*) et (.*)et (.*) et (.*)$")
	public void je_remplis_les_champs_nom_et_prenom_et_email_et_poste(String nom,String prenom,String email,String poste) {

		carrierepage.getNomCv().sendKeys(nom);
		carrierepage.getPrenomCv().sendKeys(prenom);
		carrierepage.getEmailCv().sendKeys(email);
		carrierepage.getPosteCV().sendKeys(poste);
		//carrierepage.getFichierCV().sendKeys(fichier);
		carrierepage.getSubmitCv().click();   

		
		
	}

	@Then("Un message est affiché")
	public void un_message_est_affiché() {
		int i =0;
		if(carrierepage.getChampObligatoire().size()>0)
		{
			System.out.println(carrierepage.getChampObligatoire().size());
			i++;
		}
		if(i==1)
		{
			assertTrue(carrierepage.getMessageEnvoiCvNOK().isDisplayed());
		}
		else if (i==0)
		{
			assertTrue(carrierepage.getMessageEnvoiCVOK().isDisplayed());
		}
		driver.quit();
	}

}
