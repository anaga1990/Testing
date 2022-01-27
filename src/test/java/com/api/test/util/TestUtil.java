package com.api.test.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TestUtil {
	public static RequestSpecification requestSpecification;

	public TestUtil() {

	}

	/**
	 * requestSpecification() used common actions in all API testing, like data
	 * format as JSON, baseURL and Authentication key. request and response
	 * information stored in location file with api.log in project location
	 * 
	 */
	public RequestSpecification requestSpecification() {
		PrintStream stream;
		if (requestSpecification == null) {
			try {
				stream = new PrintStream(new FileOutputStream("api.log"));
				requestSpecification = new RequestSpecBuilder().setBaseUri(PropertiesManager.globalPropRead("baseurl"))
						.addQueryParam(PropertiesManager.globalPropRead("username"),
								PropertiesManager.globalPropRead("password"))
						.addFilter(RequestLoggingFilter.logRequestTo(stream))
						.addFilter(ResponseLoggingFilter.logResponseTo(stream)).setContentType(ContentType.JSON)
						.build();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return requestSpecification;
	}

	public ResponseSpecification responseSpecification() {
		ResponseSpecification responseSpecification = new ResponseSpecBuilder().expectContentType(ContentType.JSON)
				.build();
		return responseSpecification;
	}

	public Response httpRequestMethod(RequestSpecification requestDataPreparation, String httpMethodName,
			String apiResouceName) {
		Response response = null;
		if (httpMethodName.equalsIgnoreCase("post")) {
			response = requestDataPreparation.when().post(apiResouceName).then().spec(responseSpecification()).extract()
					.response();
		} else if (httpMethodName.equalsIgnoreCase("put")) {
			response = requestDataPreparation.when().put(apiResouceName).then().spec(responseSpecification()).extract()
					.response();
		} else if (httpMethodName.equalsIgnoreCase("delete")) {
			response = requestDataPreparation.when().delete(apiResouceName).then().spec(responseSpecification())
					.extract().response();
		} else if (httpMethodName.equalsIgnoreCase("get")) {
			response = requestDataPreparation.when().get(apiResouceName).then().spec(responseSpecification()).extract()
					.response();
		}
		return response;
	}

	public String getJsonPath(Response response, String key) {
		String responseAsString = response.asString();
		JsonPath jsonPath = new JsonPath(responseAsString);
		String value = jsonPath.get(key).toString();
		return value;
	}
}
