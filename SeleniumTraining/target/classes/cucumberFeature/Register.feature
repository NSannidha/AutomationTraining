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

Feature: Enter valid credentials to Register User

  Scenario: User Registration
    Given Navigate to Retail Application
		When I click on Account Icon 
		When Click on Register button
		Then Enter firstName
		Then Enter SecondName
		Then Enter Email
		Then Enter Telephone
		Then Enter Address1
		Then Enter Address2
		Then Enter City
		Then Enter PostCode
		Then Enter Country
		Then Enter State
		Then Enter Password
		Then Confirm Password
		Then Click Subscribe as No
		Then Select Agree Privacy Policy
		When I click on Continue button
		Then I am able to register successfully
		Then close browser
		

  
