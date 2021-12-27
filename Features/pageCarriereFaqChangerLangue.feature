@tag
Feature: Change language from french to english
  I want to change the language from french to english

  @tag1
  Scenario: Change language from french to english
    Given I am on FAQ/questions page
    When I change language to english
    Then all the fields are translated to english
