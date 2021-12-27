package com.qa.bdd.contact.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ContactPage {
	WebDriver driver;
	
	public ContactPage(WebDriver driver) {                    //Constructor   WebDriver driver
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	final  String CONTACT = "//li[@id='nav-menu-item-3013']";
	final  String NOM = "//label[normalize-space()='Votre nom (*)']";
	final  String PRENOM = "//label[normalize-space()='Votre prénom (*)']";
	final  String EMAILCONTACT = "//input[@name='your-email']";
	final  String SOCIETE = "//input[@name='VotreSocit']";
	final  String TELEPHONECONTACT = "//input[@name='Votre-tel']";
	final  String MESSAGECONTACT = "//input[@name='Votremessage']";
	final  String BUTTONENVOYER = "//input[@value='Envoyer']";
	final  String MESSAGEOK = "//div[normalize-space()='Merci pour votre message. Il a été envoyé.']";
	final  String MESSAGENOK = "//div[normalize-space()='Un ou plusieurs champs contiennent une erreur. Veuillez vérifier et essayer à nouveau.']";


	/* ****************************************************************Locators ******************************************************************* */	
	

	@FindBy(how = How.XPATH, using = CONTACT) 
	private  WebElement contact;  // Page contact	

	@FindBy(how = How.XPATH, using = NOM) 
	private  WebElement txt_nom;  

	@FindBy(how = How.XPATH, using = PRENOM) 
	private  WebElement txt_prenom;  

	@FindBy(how = How.XPATH, using = EMAILCONTACT) 
	private  WebElement txt_emailContact;  

	@FindBy(how = How.XPATH, using = SOCIETE) 
	private  WebElement txt_societe;  

	@FindBy(how = How.XPATH, using = TELEPHONECONTACT) 
	private  WebElement txt_telephoneContact;  

	@FindBy(how = How.XPATH, using = MESSAGECONTACT) 
	private  WebElement txt_messageContact;  

	@FindBy(how = How.XPATH, using = BUTTONENVOYER) 
	private  WebElement btn_envoyer;
	
	@FindBy(how = How.XPATH, using = MESSAGEOK) 
	private  WebElement txt_msgOK;
	
	@FindBy(how = How.XPATH, using = MESSAGENOK) 
	private  WebElement txt_msgNOK;

	/* *********************************************************** Getters and Setters *************************************** */	
	public  WebElement getContact() {
		return contact;
		}

	public void setContact(WebElement contact) {
		this.contact = contact;
	}

	public WebElement getTxt_nom() {
		return txt_nom;
	}

	public void setTxt_nom(WebElement txt_nom) {
		this.txt_nom = txt_nom;
	}

	public WebElement getTxt_prenom() {
		return txt_prenom;
	}

	public void setTxt_prenom(WebElement txt_prenom) {
		this.txt_prenom = txt_prenom;
	}

	public WebElement getTxt_emailContact() {
		return txt_emailContact;
	}

	public void setTxt_emailContact(WebElement txt_emailContact) {
		this.txt_emailContact = txt_emailContact;
	}

	public WebElement getTxt_societe() {
		return txt_societe;
	}

	public void setTxt_societe(WebElement txt_societe) {
		this.txt_societe = txt_societe;
	}

	public WebElement getTxt_telephoneContact() {
		return txt_telephoneContact;
	}

	public void setTxt_telephoneContact(WebElement txt_telephoneContact) {
		this.txt_telephoneContact = txt_telephoneContact;
	}

	public WebElement getTxt_messageContact() {
		return txt_messageContact;
	}

	public void setTxt_messageContact(WebElement txt_messageContact) {
		this.txt_messageContact = txt_messageContact;
	}

	public WebElement getBtn_envoyer() {
		return btn_envoyer;
	}

	public void setBtn_envoyer(WebElement btn_envoyer) {
		this.btn_envoyer = btn_envoyer;
	}

	public WebElement getTxt_msgOK() {
		return txt_msgOK;
	}

	public void setTxt_msgOK(WebElement txt_msgOK) {
		this.txt_msgOK = txt_msgOK;
	}

	public WebElement getTxt_msgNOK() {
		return txt_msgNOK;
	}

	public void setTxt_msgNOK(WebElement txt_msgNOK) {
		this.txt_msgNOK = txt_msgNOK;
	}
}






