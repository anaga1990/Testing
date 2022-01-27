package com.api.glues;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import com.api.test.data.ApiTestDataManager;
import com.api.test.util.ApiResources;
import com.api.test.util.PropertiesManager;
import com.api.test.util.TestUtil;
import com.api.util.RandamData;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PlaceGlue extends TestUtil {

	ApiTestDataManager apiTestData = new ApiTestDataManager();
	RequestSpecification requestDataPreparation;
	Response response;
	static String place_id;
	static String address;

	@Given("add place request Template with all Required Data")
	public void add_place_request_template_with_all_required_data() {
		requestDataPreparation = given().spec(requestSpecification()).body(apiTestData.addPlaceRequestData());
	}

	@Given("delete place request Template with all Required Data")
	public void delete_place_request_template_with_all_required_data() {
		requestDataPreparation = given().spec(requestSpecification()).body(apiTestData.deletePlaceRequestData(place_id));
	}

	@Given("update place request Template with all Required Data")
	public void update_place_request_template_with_all_required_data() {
		String updateAddress=RandamData.genString()+", India";
		address=updateAddress;
		requestDataPreparation = given().spec(requestSpecification()).body(apiTestData.updatePlaceRequestData(place_id, updateAddress));
	}

	@Given("get place request Template with all Required Data")
	public void get_place_request_template_with_all_required_data() {
		requestDataPreparation = given().spec(requestSpecification())
				.queryParams("key", PropertiesManager.globalPropRead("password")).queryParams("place_id", place_id);
	}

	@When("call Api Request with Http Post Request")
	public void call_api_request_with_http_post_request() {
		response = requestDataPreparation.when().post("/maps/api/place/add/json").then().spec(responseSpecification())
				.extract().response();
	}

	@When("call {string} Request with Http {string} Method")
	public void call_request_with_http_Method(String apiResourceName, String httpMethod) {
		String currentApi = apiResourceName.toUpperCase();
		ApiResources apiToCall = ApiResources.valueOf(currentApi);
		String getApiResouceName = apiToCall.getResource();
		response = httpRequestMethod(requestDataPreparation, httpMethod, getApiResouceName);
	}

	@Then("verify Api Request Success with Http Status code {int}")
	public void verify_api_request_success_with_http_status_code(Integer statusCode) {
		assertEquals(statusCode, Integer.valueOf(response.getStatusCode()));
	}

	@And("verify Api Response Body {string} as {string}")
	public void verify_api_response_body_as(String keyValue, String expetedValue) {
		String actualValue = getJsonPath(response, keyValue);
		assertEquals(expetedValue, actualValue);
	}

	@And("get {string} from Response AddPlaceAPI")
	public void get_data_from_Response_AddPlaceAPI(String keyValue) {
		String extrcatedData = getJsonPath(response, keyValue);
		System.out.println("brofre setting place_id as ::"+place_id);
		place_id = extrcatedData;
		System.out.println("After setting place_id as ::"+place_id);
	}

	@Given("add place request Template with {string} {string} {string}")
	public void add_place_request_template_with(String name, String mobileNumber, String address) {
		requestDataPreparation = given().spec(requestSpecification())
				.body(apiTestData.addPlaceRequestData(name, mobileNumber, address));
	}

	@And("verify Api Response Body {string}")
	public void verify_api_response_body_as(String keyValue) {
		String actualValue = getJsonPath(response, keyValue);
		String expectedAddress = address;
		assertEquals(expectedAddress, actualValue);
	}

}
