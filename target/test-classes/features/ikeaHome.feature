Feature: HomePage Functionalities

#step kick off before anything else before test
#Background:
#Given User is on HomePage


@SmokeTest
Scenario: Navigate to Shop Page and search an Item
	Given User is on HomePage
	When User navigates to shopPage
	And searchs for an item
	Then results count should be displayed with number
	
	
	@SmokeTest
	Scenario: Navigate shoppint yellow button and search for an item
	Given User is on HomePage
	When User navigates to serchPage using yellow button
	And searchs for an item
	Then results count should be displayed with number
	And user enter username "admin123" and password "adminadmin"
  Then I have added wait 3000
  
 
  @SmokeTest
  Scenario Outline: Navigate shopping yellow button and search for an item 123123
  
 
  
  And user enter username "<username>" and password "<password>"
  
  @att
  Examples:
  |username|password|
  |abc1|admin1|
  |abc2|admin2|
  |abc3|admin3|
  |abc4|admin4|
  
  @verizon
  Examples:
  |username|password|
  |verizon|admin321|