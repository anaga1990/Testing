
Feature: Account Page Validation

Background:
		Given user has alreday logged in to application
		|username|password|
    |Admin|admin123|

  Scenario: Verify HomePage Menu Details
    Given User is on HomePage
    When user validate the Homepage Title as "OrangeHRM"
    Then user verify the my account menu
    |Admin|
    |PIM|
    |Time|
    |Recruitment|
 		|My Info|
    And check my account menu Sections count should be 11
    And User logout from HomePage 

  Scenario: Verify User details in Admin menu
    Given User is on HomePage
    When click on Admin Menu and click on user management and click on user
    And serach with username "Admin"
    Then verify username Details as "Admin"
    And User logout from HomePage

