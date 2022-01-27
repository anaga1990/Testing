Feature: Place API testing with Properties File 

@AddPlace
Scenario: Verify AddPlace Api Test 
	Given add place request Template with all Required Data 
	When call "AddPlaceAPI" Request with Http "Post" Method 
	Then verify Api Request Success with Http Status code 200 
	And verify Api Response Body "status" as "OK"
	And get "place_id" from Response AddPlaceAPI

@UpdatePlace
Scenario: Verify UpdatePlace Api Test 
	Given update place request Template with all Required Data 
	When call "UpdatePlaceAPI" Request with Http "put" Method 
	Then verify Api Request Success with Http Status code 200 
	And verify Api Response Body "msg" as "Address successfully updated"

@GetPlace
Scenario: Verify GetPlace Api Test 
	Given get place request Template with all Required Data 
	When call "getPlaceAPI" Request with Http "get" Method 
	Then verify Api Request Success with Http Status code 200 
	And verify Api Response Body "address"

@DeletePlace
Scenario: Verify DeletePlace Api Test 
	Given delete place request Template with all Required Data 
	When call "DeletePlaceAPI" Request with Http "Delete" Method 
	Then verify Api Request Success with Http Status code 200 
	And verify Api Response Body "status" as "OK"	