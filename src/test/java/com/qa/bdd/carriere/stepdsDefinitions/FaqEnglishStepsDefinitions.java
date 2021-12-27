package com.qa.bdd.carriere.stepdsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.bdd.carriere.pages.FAQ;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaqEnglishStepsDefinitions {

	private WebDriver driver;
	private String baseUrl = "https://improve-software.com/";
	private FAQ faq;
	Actions actionProvider;


	@Given("I am on FAQ\\/questions page")
	public void i_am_on_faq_questions_page() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		faq = new FAQ(driver);
		actionProvider = new Actions(driver);
		actionProvider.clickAndHold(faq.getCarriere()).build().perform();
		String parent=driver.getWindowHandle();
		faq.getFaq().click();
		faq.getPageQuestions().click();   // Navigation à la page  suggestion
		Set<String>s=driver.getWindowHandles();    // 
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				String actualString = driver.switchTo().window(child_window).getTitle();
				assertTrue(actualString.contains("Questions"));
			}				
		}
	}

	@When("I change language to english")
	public void i_change_language_to_english() {
		actionProvider.clickAndHold(faq.getLanguage()).build().perform(); 
		faq.getEnglish().click();
	}

	@Then("all the fields are translated to english")
	public void all_the_fields_are_translated_to_english() {
		assertEquals("Nom*", faq.getLabelName().getText());
		assertEquals("Autre Question*", faq.getLabelAutreQuestion().getText());
		actionProvider.clickAndHold(faq.getLanguage()).build().perform();
		faq.getFrench().click();
		driver.close();
	}
}
