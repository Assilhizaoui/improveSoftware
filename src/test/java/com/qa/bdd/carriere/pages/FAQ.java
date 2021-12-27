package com.qa.bdd.carriere.pages;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FAQ {
	WebDriver driver;
	Logger log;
	public FAQ(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
			log = Logger.getLogger(Log.class.getName());
	        log.setLevel(Level.INFO);
			}
	

/* *************************************************************** Locators ******************************************************************* */ 

	
	@FindBy(xpath="//*[@id='nav-menu-item-3012']/a")   // Page carriere 
	 private WebElement carriere;
	
	@FindBy(xpath="//a[contains(text(),'FAQ')]") // FAQ sous la page  carrière 
	 private WebElement faq;
	
	@FindBy(xpath="//a[@class='trp-floater-ls-disabled-language trp-ls-disabled-language']")
	private WebElement language;
	
	@FindBy(xpath="//a[@title='English']")
	private WebElement english;
	
	@FindBy(xpath="//a[@title='French']")
	private WebElement french;
	
	@FindBy(xpath="//*[normalize-space()='Questions?']")   // Questions sous FAQ 
	 private WebElement pageQuestions;
	
	@FindBy(xpath="//label[@for='psfield_3437_1']")
	private WebElement labelName;

	@FindBy(xpath="//label[@for='psfield_3437_2']")
	private WebElement labelEmail;
	
	@FindBy(xpath="//label[@for='psfield_3437_3']")
	private WebElement labelAutreQuestion;

/* *************************************************************** Getters and setters  ******************************************************************* */ 

	
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

	public WebElement getLanguage() {
		return language;
	}

	public void setLanguage(WebElement language) {
		this.language = language;
	}

	public WebElement getEnglish() {
		return english;
	}

	public void setEnglish(WebElement english) {
		this.english = english;
	}

	public WebElement getFrench() {
		return french;
	}

	public void setFrench(WebElement french) {
		this.french = french;
	}

	public WebElement getPageQuestions() {
		return pageQuestions;
	}

	public void setPageQuestions(WebElement pageQuestions) {
		this.pageQuestions = pageQuestions;
	}

	public WebElement getLabelName() {
		return labelName;
	}

	public void setLabelName(WebElement labelName) {
		this.labelName = labelName;
	}

	public WebElement getLabelEmail() {
		return labelEmail;
	}

	public void setLabelEmail(WebElement labelEmail) {
		this.labelEmail = labelEmail;
	}

	public WebElement getLabelAutreQuestion() {
		return labelAutreQuestion;
	}

	public void setLabelAutreQuestion(WebElement labelAutreQuestion) {
		this.labelAutreQuestion = labelAutreQuestion;
	}
	
	

	
}
