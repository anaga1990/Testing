package com.api.test.data;

import java.util.LinkedList;
import java.util.List;

import com.api.addplace.pojo.AddMapsPojo;
import com.api.addplace.pojo.DeleteMapPojo;
import com.api.addplace.pojo.Location;
import com.api.addplace.pojo.UpdateMapsPojo;
import com.api.test.util.PropertiesManager;
import com.api.test.util.TestUtil;
import com.api.util.RandamData;

public class ApiTestDataManager {
	TestUtil testUtil = new TestUtil();
	
	public AddMapsPojo addPlaceRequestData() {
		Location local = new Location();
		local.setLng(22.45335);
		local.setLat(-38.386783);

		List<String> types = new LinkedList<>();
		types.add("Feature Play Ground");
		types.add("ground");

		AddMapsPojo addMapsRequestData = new AddMapsPojo();
		addMapsRequestData.setLocation(local);
		addMapsRequestData.setAccuracy(10);
		addMapsRequestData.setName(RandamData.genString() + " House");
		addMapsRequestData.setPhone_number("(+91) " + RandamData.genMobNo());
		addMapsRequestData.setAddress("1st cross, sri krishna road, " + RandamData.genString() + " street");
		addMapsRequestData.setTypes(types);
		addMapsRequestData.setWebsite("https://demo.qa.com");
		addMapsRequestData.setLanguage("Englesh-IN");
		return addMapsRequestData;
	}

	public AddMapsPojo addPlaceRequestData(String name, String mobileNumber, String address) {
		Location local = new Location();
		local.setLng(22.45335);
		local.setLat(-38.386783);

		List<String> types = new LinkedList<>();
		types.add("Feature Play Ground");
		types.add("ground");

		AddMapsPojo addMapsRequestData = new AddMapsPojo();
		addMapsRequestData.setLocation(local);
		addMapsRequestData.setAccuracy(10);
		addMapsRequestData.setName(name + " House");
		addMapsRequestData.setPhone_number("(+91) " + mobileNumber);
		addMapsRequestData.setAddress(address);
		addMapsRequestData.setTypes(types);
		addMapsRequestData.setWebsite("https://demo.qa.com");
		addMapsRequestData.setLanguage("Englesh-IN");
		return addMapsRequestData;
	}

	public UpdateMapsPojo updatePlaceRequestData() {
		String address1=RandamData.genString();
		String address2=String.valueOf(RandamData.genNumber());
		UpdateMapsPojo upojo = new UpdateMapsPojo();
		upojo.setPlace_id(PropertiesManager.readProp("place_id"));
		upojo.setAddress("143 "+address1+","+address2+" road");
		String updatedAddressValue = "143 "+address1+","+address2+" road";
		PropertiesManager.writeProp("updatedAddress", updatedAddressValue);
		upojo.setKey(PropertiesManager.globalPropRead("password"));
		return upojo;
	}
	
	public UpdateMapsPojo updatePlaceRequestData(String place_id, String address) {
		UpdateMapsPojo upojo = new UpdateMapsPojo();
		upojo.setPlace_id(place_id);
		upojo.setAddress(address);
		upojo.setKey(PropertiesManager.globalPropRead("password"));
		return upojo;
	}

	public DeleteMapPojo deletePlaceRequestData() {
		DeleteMapPojo deleteMapPojo = new DeleteMapPojo();
		deleteMapPojo.setPlace_id(PropertiesManager.readProp("place_id"));
		return deleteMapPojo;
	}
	
	public DeleteMapPojo deletePlaceRequestData(String place_id) {
		DeleteMapPojo deleteMapPojo = new DeleteMapPojo();
		deleteMapPojo.setPlace_id(place_id);
		return deleteMapPojo;
	}
	
}
