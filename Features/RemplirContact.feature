#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Tester la fonctionnalité contact


  @tag1
  Scenario: Cas nominal_Champs correct
    Given I am on contact page
    When I fill in all the fields
    And I click on submit button
    Then sending success message is displayed
    
    @tag2
    Scenario: Cas champs contact non remplis 
    Given I am on contact page
    When I dont fill in all the fields
    And I click on submit button
    Then sending failure message is displayed 
