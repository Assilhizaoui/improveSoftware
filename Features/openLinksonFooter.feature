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
Feature: OpenLinks
  I want open different links and check if the title of each link is correct

  @tag1
  Scenario Outline: OpenLinks
    Given I am on Home page
    When I click on  <link>
    Then The title  <title> is displayed

    Examples: 
      | link                                 | title                          |
      | //li[@id='nav-menu-item-3720']//span | Centre d’Excellence en Testing |
      | //li[@id='nav-menu-item-3723']//span | Assistance au recrutement      |
      | //li[@id='nav-menu-item-3724']//span | Consulting                     |
      | //li[@id='nav-menu-item-3719']//span | Carrières                      |
      | //li[@id='nav-menu-item-3721']//span | Contact                        |
