Feature: MAPS Api Functional E2E Test

  Scenario: Verify AddPlace Api Request and Response 
    Given add place request Template with all Required Data
    When call Api Request with Http Post Request
    Then verify Api Request Success with Http Status code 200
    And verify Api Response Body "status" as "OK"
   