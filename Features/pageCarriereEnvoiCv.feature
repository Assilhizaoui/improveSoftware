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
Feature: Envoi de CV via la page Carriere
  Je veux envoyer mon Cv en remplissant les champs correctement

  @tag1
  Scenario: Succes de lenvoi de CV via la page Carriere
    Given Je suis dans la page Home
    When J accede à la page carriere
    And je clique sur Envoyer votre CV
    And je remplis les champs de forumulaire correctement
    Then Un message de succes d_envoi est affiché

  @tag2
  Scenario Outline: Echec de lenvoi de CV via la page Carriere
    Given Je suis dans la page Home
    When J accede à la page carriere
    And je clique sur Envoyer votre CV
    And je remplis les champs <nom> et <prenom> et <email> et <poste>
    Then Un message est affiché

    Examples: 
      | nom      | prenom | email        | poste |
      | Abdelhak |        | a@improve.tn | QA    |
      |          | Hamadi | a@improve.tn | QA    |
      | Abd      | Ham    | a@improve.tn | QA    |
      | Abd      | Ham    | aimprove.tn  | QA    |
