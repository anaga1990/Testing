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

Feature: LoginPage Automation

  Scenario: Login Application with existing user
    Given user should be login page
    When user provide Email address "Admin" and Password "admin123"
    And user click on Sigin
    Then user validate the loginPage Title as "OrangeHRM"
    And logout User

    
  Scenario: Login Application with unknow user
    Given user should be login page
    When user provide Email address "Admin12" and Password "Test#2889"
    And user click on Sigin
    Then user validate the loginPage Title as "OrangeHRM"
    But user verify error "Invalid credentials"
    
    
    
    
    
    