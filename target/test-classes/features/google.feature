
@google
Feature: Search Item

Background:

	Given User is on google HomePage

  @google
  Scenario: Search for item and verify results text
    Given I want to search for "iphone"
    And results text is displayed with "About"
   

  @google
  Scenario Outline: Title of your scenario outline
       Given I want to search for "<item>"
   		 And results item consist of" <item type>"

    Examples: 
      | item  | item type | 
      | iphone | iphone| 
      |macbookpro | macbook| 
      | samsung | Samsung| 
