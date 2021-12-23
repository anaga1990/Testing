package com.qa.scenarios;

import org.testng.annotations.Test;

import com.qa.page.object.modle.GreenKartHomePage;

public class GreenKartHomePageTest extends BaseTest{
	@Test
	public void cartTest() {
		logger.info("cartTest started");
		GreenKartHomePage greenKartHomePage = new GreenKartHomePage();
		greenKartHomePage.addedVegsToCart();
		logger.info("added vegs to cart");
		greenKartHomePage.checkTheItemsAndProcedeToCheckOut();
		logger.info("chicked items in card and procede");
		greenKartHomePage.getTotalPrice();
		logger.info("printed price");
		greenKartHomePage.completOrder();
		logger.info("completOrder success");
	}
}
