package com.qa.bdd.carriere.pages;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarrierePage {

	WebDriver driver;
	Logger log;
	
	public CarrierePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		 log = Logger.getLogger(Log.class.getName());
	     log.setLevel(Level.INFO);
		}
	
	/* *********************************************************************************** Locators ******************************************************************* */
	@FindBy(xpath="//*[@id='nav-menu-item-3012']/a")   // Page carriere 
	 private WebElement carriere;
	
	@FindBy(xpath="//a[contains(text(),'FAQ')]") // FAQ sous la page  carrière 
	 private WebElement faq;
	
	@FindBy(xpath="//a[contains(text(),'Pourquoi nous rejoindre ?')]") // nous rejoindre sous la page carrière 
	 private WebElement pageNousRejoindre;
		
	@FindBy(xpath="//a[normalize-space()='Envoyer votre CV maintenant !']")
	private WebElement envoyerCV;

	@FindBy(xpath="//span[@role='alert']")
	private List<WebElement> champObligatoire;
	
	@FindBy(xpath="(//input[@name='your-name'])[1]")
	private WebElement nomCv;
	
	@FindBy(xpath="(//input[@name='your-name'])[2]")
	private WebElement prenomCv;
	
	@FindBy(xpath="//input[@name='your-email']")
	private WebElement emailCv;
	
	@FindBy(xpath="//textarea[@name='your-message']")
	private WebElement posteCV;
	
	@FindBy(xpath="//input[@value='Envoyer']")
	private WebElement submitCv;
	
	@FindBy(xpath="//form//div[text()='Merci pour votre message. Il a été envoyé.']")
	private WebElement messageEnvoiCVOK;
	
	@FindBy(xpath="//form//div[text()='Un ou plusieurs champs contiennent une erreur. Veuillez vérifier et essayer à nouveau.']")
	private WebElement messageEnvoiCvNOK;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement fichierCV;

	/* **********************************************************************  Getters and setters ********************************************************************************************  */
	public WebElement getCarriere() {
		return carriere;
	}

	public void setCarriere(WebElement carriere) {
		this.carriere = carriere;
	}

	public WebElement getFaq() {
		return faq;
	}

	public void setFaq(WebElement faq) {
		this.faq = faq;
	}

	public WebElement getPageNousRejoindre() {
		return pageNousRejoindre;
	}

	public void setPageNousRejoindre(WebElement pageNousRejoindre) {
		this.pageNousRejoindre = pageNousRejoindre;
	}

	public WebElement getEnvoyerCV() {
		return envoyerCV;
	}

	public void setEnvoyerCV(WebElement envoyerCV) {
		this.envoyerCV = envoyerCV;
	}

	public List<WebElement> getChampObligatoire() {
		return champObligatoire;
	}

	public void setChampObligatoire(List<WebElement> champObligatoire) {
		this.champObligatoire = champObligatoire;
	}

	public WebElement getNomCv() {
		return nomCv;
	}

	public void setNomCv(WebElement nomCv) {
		this.nomCv = nomCv;
	}

	public WebElement getPrenomCv() {
		return prenomCv;
	}

	public void setPrenomCv(WebElement prenomCv) {
		this.prenomCv = prenomCv;
	}

	public WebElement getEmailCv() {
		return emailCv;
	}

	public void setEmailCv(WebElement emailCv) {
		this.emailCv = emailCv;
	}

	public WebElement getPosteCV() {
		return posteCV;
	}

	public void setPosteCV(WebElement posteCV) {
		this.posteCV = posteCV;
	}

	public WebElement getSubmitCv() {
		return submitCv;
	}

	public void setSubmitCv(WebElement submitCv) {
		this.submitCv = submitCv;
	}

	public WebElement getMessageEnvoiCVOK() {
		return messageEnvoiCVOK;
	}

	public void setMessageEnvoiCVOK(WebElement messageEnvoiCVOK) {
		this.messageEnvoiCVOK = messageEnvoiCVOK;
	}

	public WebElement getMessageEnvoiCvNOK() {
		return messageEnvoiCvNOK;
	}

	public void setMessageEnvoiCvNOK(WebElement messageEnvoiCvNOK) {
		this.messageEnvoiCvNOK = messageEnvoiCvNOK;
	}
	
	public WebElement getFichierCV() {
		return fichierCV;
	}

	public void setFichierCV(WebElement fichierCV) {
		this.fichierCV = fichierCV;
	}
}
