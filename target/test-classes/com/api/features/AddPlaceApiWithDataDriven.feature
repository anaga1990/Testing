Feature: Data driven approach from Feature

Scenario Outline: Verify AddPlace Api Request and Response with Data Driven
	Given add place request Template with "<name>" "<mobileNumber>" "<address>"
    When call Api Request with Http Post Request
    Then verify Api Request Success with Http Status code 200
    And verify Api Response Body "status" as "OK"
    Examples:
    |name|mobileNumber|address|
    |nagarjuna|9662545795|8-17, main road, kkp road|
    
Scenario Outline: Verify AddPlace Api Request test with Data Driven 
	Given add place request Template with "<name>" "<mobileNumber>" "<address>" 
	When call "AddPlaceAPI" Request with Http "Post" Method 
	Then verify Api Request Success with Http Status code 200 
	And verify Api Response Body "status" as "OK"
	And get "place_id" from Response AddPlaceAPI
	Examples: 
		|name|mobileNumber|address|
		|nagarjuna	|9662545795|8-17, main road, kkp road|
		|swathi		|9669995795|9-17, main road, hytu road|
		|narendhra	|9660045795|45-17, main road, trdfghh road|