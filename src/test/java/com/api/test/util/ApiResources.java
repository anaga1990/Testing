package com.api.test.util;

public enum ApiResources {
	ADDPLACEAPI("/maps/api/place/add/json"),
	DELETEPLACEAPI("/maps/api/place/delete/json"),
	GETPLACEAPI("/maps/api/place/get/json"),
	UPDATEPLACEAPI("/maps/api/place/update/json");
	
	private String apiResource;
	
	ApiResources(String apiName) {
		this.apiResource = apiName;
	}
	
	public String getResource() {
		return apiResource;
	}
}
