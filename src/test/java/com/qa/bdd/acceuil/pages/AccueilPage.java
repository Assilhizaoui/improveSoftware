package com.qa.bdd.acceuil.pages;




import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccueilPage {

	WebDriver driver;
	
	public AccueilPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//*************************************Locators ************************************************



	// partners Icon locators

	@FindBy(xpath = "//img[@alt='Adents Logo']")

	private WebElement adentIcon;

	@FindBy(xpath = "//img[@alt='Se Loger']")
	private WebElement selogerIcon;

	@FindBy(xpath = "//img[@alt='Solocal']")
	private WebElement solocalIcon;

	@FindBy(xpath = "//img[@alt='Carrefour']")
	private WebElement carrefourIcon;

	@FindBy(xpath = "//img[@alt='Engie']")
	private WebElement engieIcon;

	@FindBy(xpath = "//img[@alt='Orange']")
	private WebElement orangeIcon;

	// Logo Icon

	@FindBy(xpath = "//img[@alt='Improve Software']")
	private WebElement logoIcon;

	// Consulting locators

	@FindBy(xpath = "//i[@class='fa fa-qrcode']")
	private WebElement consultingIcon;

	@FindBy(xpath = "//h3[contains(text(),'Consulting')]")
	private WebElement consultingTitle;

	@FindBy(xpath = "//p[contains(text(),'Avec ses consultants hautement qualifiés')]")
	private WebElement consultingTexte;

//	Assistance au recrutement locator 

	@FindBy(xpath = "//i[@class='fa fa-magic']")
	private WebElement assitanceRecruIcon;

	@FindBy(xpath = "//h3[contains(text(),'Assistance au recrutement')]")
	private WebElement assitanceRecruTitle;

	@FindBy(xpath = "//p[contains(text(),\"Notre expertise nous permet d'accompagner nos clie\")]")
	private WebElement assitanceRecruTexte;

//	Centre d'excellence locator

	// *[@id="page"]/div/div/div[1]/div[3]/div/a/div/div[1]/i

	@FindBy(xpath = "//div[@class='eva-service-icon']//i[@class='fa fa-users']")
	private WebElement centreExcellenceIcon;

	@FindBy(xpath = "//h3[contains(text(),'Assistance au recrutement')]")
	private WebElement centreExcellenceTitle;

	@FindBy(xpath = "//p[contains(text(),\"Pour faire face à la compétition rude pour l'ensem\")]")
	private WebElement centreExcellenceTexte;

//	Contacter nous button locator 
	
	@FindBy(xpath = "//i[@class='fa fa-chevron-right']")
	private WebElement contacternous;
	
	
	
	
	
// #### methods #############

	// methods to click on partners Web Site

	public void clickOnAdents() {

		getAdentIcon().click();

	}

	public void clickOnSeloger() {

		getSelogerIcon().click();

	}

	public void clickOnSolocal() {

		getSolocalIcon().click();

	}

	public void clickOnCarrefour() {

		getCarrefourIcon().click();

	}

	public void clickOnEngie() {

		getEngieIcon().click();
	}

	public void clickOnOrange() {

		getOrangeIcon().click();
	}

	// method to click on Logo Icon

	public void clickOnLogoIcon() {

		getLogoIcon().click();

	}

//	Methods to check Consulting Services
	
	
	public void clickOnConsultingIcon() {
		
		getConsultingIcon().click();
	}
	
//	public void clickOnConsultingTitle() {
//		
//		 getConsultingTitle().click();
//		 
//	}
//	
//	public void clickOnConsultingText() {
//		
//		getConsultingTexte().click();
//	}
	
	
//	Methods to check Assistance au recrutement  Service
	
	public void click_on_assitance_au_recrutement() {
		
		getAssitanceRecruIcon().click();
	}

//	Methods to check Centre d'excellence   Service	

	public void click_on_centre_excellence() {
		
		getCentreExcellenceIcon().click();
		
	}

	
// Method to click on contacter nous page 
	
	
	public void click_on_contacter_nous() {
		
		getContacternous().click();
		
	}
	

	
// ########### Getters & Setters ####################

	public WebElement getContacternous() {
		return contacternous;
	}

	public void setContacternous(WebElement contacternous) {
		this.contacternous = contacternous;
	}

	public WebElement getAdentIcon() {
		return adentIcon;
	}

	public void setAdentIcon(WebElement adentIcon) {
		adentIcon = adentIcon;
	}

	public WebElement getSelogerIcon() {
		return selogerIcon;
	}

	public void setSelogerIcon(WebElement selogerIcon) {
		selogerIcon = selogerIcon;
	}

	public WebElement getSolocalIcon() {
		return solocalIcon;
	}

	public void setSolocalIcon(WebElement solocalIcon) {
		solocalIcon = solocalIcon;
	}

	public WebElement getCarrefourIcon() {
		return carrefourIcon;
	}

	public void setCarrefourIcon(WebElement carrefourIcon) {
		carrefourIcon = carrefourIcon;
	}

	public WebElement getEngieIcon() {
		return engieIcon;
	}

	public void setEngieIcon(WebElement engieIcon) {
		engieIcon = engieIcon;
	}

	public WebElement getOrangeIcon() {
		return orangeIcon;
	}

	public void setOrangeIcon(WebElement orangeIcon) {
		orangeIcon = orangeIcon;
	}

	public WebElement getLogoIcon() {
		return logoIcon;
	}

	public void setLogoIcon(WebElement logoIcon) {
		logoIcon = logoIcon;
	}

	public WebElement getConsultingIcon() {
		return consultingIcon;
	}

	public void setConsultingIcon(WebElement consultingIcon) {
		consultingIcon = consultingIcon;
	}

	public WebElement getConsultingTitle() {
		return consultingTitle;
	}

	public void setConsultingTitle(WebElement consultingTitle) {
		consultingTitle = consultingTitle;
	}

	public WebElement getConsultingTexte() {
		return consultingTexte;
	}

	public void setConsultingTexte(WebElement consultingTexte) {
		consultingTexte = consultingTexte;
	}

	public WebElement getAssitanceRecruIcon() {
		return assitanceRecruIcon;
	}

	public void setAssitanceRecruIcon(WebElement assitanceRecruIcon) {
		assitanceRecruIcon = assitanceRecruIcon;
	}

	public WebElement getAssitanceRecruTitle() {
		return assitanceRecruTitle;
	}

	public void setAssitanceRecruTitle(WebElement assitanceRecruTitle) {
		assitanceRecruTitle = assitanceRecruTitle;
	}

	public WebElement getAssitanceRecruTexte() {
		return assitanceRecruTexte;
	}

	public void setAssitanceRecruTexte(WebElement assitanceRecruTexte) {
		assitanceRecruTexte = assitanceRecruTexte;
	}

	public WebElement getCentreExcellenceIcon() {
		return centreExcellenceIcon;
	}

	public void setCentreExcellenceIcon(WebElement centreExcellenceIcon) {
		centreExcellenceIcon = centreExcellenceIcon;
	}

	public WebElement getCentreExcellenceTitle() {
		return centreExcellenceTitle;
	}

	public void setCentreExcellenceTitle(WebElement centreExcellenceTitle) {
		centreExcellenceTitle = centreExcellenceTitle;
	}

	public WebElement getCentreExcellenceTexte() {
		return centreExcellenceTexte;
	}

	public void setCentreExcellenceTexte(WebElement centreExcellenceTexte) {
		centreExcellenceTexte = centreExcellenceTexte;
	}



//********************************************** Window handles ************************************************
	
	
	
public void PartnersTitle (){
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> iterator = s.iterator();
		Set<String> expectedCollection = new HashSet<String>();
		expectedCollection.add("Solutions digitales pour les entreprises locales | solocal.com");
		expectedCollection.add("seloger.com");
		expectedCollection.add("Site institutionnel d'Orange - orange.com | Corporate");
		expectedCollection.add("Acteur mondial de l’énergie | ENGIE");
		expectedCollection.add("S’inscrire | LinkedIn");
		expectedCollection.add("");
		
        String parent=driver.getWindowHandle();
		while (iterator.hasNext()) {
			
			String child = iterator.next();
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				String title = driver.switchTo().window(child).getTitle();
				System.out.println(title);
				
//				Boolean exist = expectedCollection.contains(title);
				assertEquals(expectedCollection.contains(title), true);
//				exist.compareTo(true);
				driver.switchTo().window(parent);
//				System.out.println(exist);
			}
		}
	}	
	
	


	
}
