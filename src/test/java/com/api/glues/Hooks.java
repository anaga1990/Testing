package com.api.glues;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace or @UpdatePlace")
	public void preConditionTestRun() {
		PlaceGlue glue = new PlaceGlue();
		if (PlaceGlue.place_id == null) {
			glue.add_place_request_template_with_all_required_data();
			glue.call_request_with_http_Method("AddPlaceAPI", "post");
			glue.get_data_from_Response_AddPlaceAPI("place_id");
		}
	}

}
