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
Feature: Change the password in chnage password page

  Scenario: Change Password
    Given Navigate to the application
		When I click on account icon
		When I enter login id
		When I enter login password
		When I click on login button
		When I click on change your password link
		When I enter new password in Password textbox
		When I enter same credentials in Confirm Password textbox
		When I click on continue
		Then My password is updated successfully
		Then I close my browser