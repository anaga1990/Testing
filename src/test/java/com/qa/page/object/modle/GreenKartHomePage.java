package com.qa.page.object.modle;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.scenarios.BaseTest;

public class GreenKartHomePage extends BaseTest {
	@FindBy(xpath = "//h4[starts-with(text(),'Brocolli')]//following-sibling::div[1]/a[@class='increment']")
	WebElement vegBrocolli;

	@FindBy(xpath = "//h4[starts-with(text(),'Cauliflower')]//following-sibling::div[1]/a[@class='increment']")
	WebElement vegCauliflower;

	@FindBy(xpath = "//h4[starts-with(text(),'Cucumber')]//following-sibling::div[1]/a[@class='increment']")
	WebElement vegCucumber;

	@FindBy(xpath = "//h4[starts-with(text(),'Beetroot')]//following-sibling::div[1]/a[@class='increment']")
	WebElement vegBeetroot;

	@FindBy(xpath = "//h4[starts-with(text(),'Carrot')]//following-sibling::div[1]/a[@class='increment']")
	WebElement vegCarrot;

	@FindBy(xpath = "//h4[starts-with(text(),'Tomato')]//following-sibling::div[1]/a[@class='increment']")
	WebElement vegTomato;

	@FindBy(xpath = "//h4[starts-with(text(),'Beans')]//following-sibling::div[1]/a[@class='increment']")
	WebElement vegBeans;

	@FindBy(xpath = "//h4[starts-with(text(),'Brinjal')]//following-sibling::div[1]/a[@class='increment']")
	WebElement vegBrinjal;

	@FindBy(xpath = "//h4[starts-with(text(),'Pears')]//following-sibling::div[1]/a[@class='increment']")
	WebElement Pears;

	@FindBy(xpath = "//h4[starts-with(text(),'Raspberry')]//following-sibling::div[1]/a[@class='increment']")
	WebElement fruitsRaspberry;

	@FindBy(xpath = "//h4[starts-with(text(),'Water Melon')]//following-sibling::div[1]/a[@class='increment']")
	WebElement fruitsWaterMelon;

	@FindBy(xpath = "//h4[starts-with(text(),'Pomegranate')]//following-sibling::div[1]/a[@class='increment']")
	WebElement fruitsPomegranate;

	@FindBy(xpath = "//h4[starts-with(text(),'Strawberry')]//following-sibling::div[1]/a[@class='increment']")
	WebElement fruitsStrawberry;

	@FindBy(xpath = "//h4[starts-with(text(),'Nuts Mixture')]//following-sibling::div[1]/a[@class='increment']")
	WebElement dryfruitsNutsMixture;

	@FindBy(xpath = "//h4[starts-with(text(),'Pista')]//following-sibling::div[1]/a[@class='increment']")
	WebElement dryfruitsPista;

	@FindBy(xpath = "//h4[starts-with(text(),'Cashews')]//following-sibling::div[1]/a[@class='increment']")
	WebElement dryfruitsCashews;

	@FindBy(xpath = "//h4[starts-with(text(),'Almonds')]//following-sibling::div[1]/a[@class='increment']")
	WebElement dryfruitsAlmonds;

	// add to cart
	@FindBy(xpath = "//h4[starts-with(text(),'Brocolli')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_vegBrocolli;

	@FindBy(xpath = "//h4[starts-with(text(),'Cauliflower')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_vegCauliflower;

	@FindBy(xpath = "//h4[starts-with(text(),'Cucumber')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_vegCucumber;

	@FindBy(xpath = "//h4[starts-with(text(),'Beetroot')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_vegBeetroot;

	@FindBy(xpath = "//h4[starts-with(text(),'Carrot')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_vegCarrot;

	@FindBy(xpath = "//h4[starts-with(text(),'Tomato')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_vegTomato;

	@FindBy(xpath = "//h4[starts-with(text(),'Beans')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_vegBeans;

	@FindBy(xpath = "//h4[starts-with(text(),'Brinjal')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_vegBrinjal;

	@FindBy(xpath = "//h4[starts-with(text(),'Pears')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_Pears;

	@FindBy(xpath = "//h4[starts-with(text(),'Raspberry')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_fruitsRaspberry;

	@FindBy(xpath = "//h4[starts-with(text(),'Water Melon')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_fruitsWaterMelon;

	@FindBy(xpath = "//h4[starts-with(text(),'Pomegranate')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_fruitsPomegranate;

	@FindBy(xpath = "//h4[starts-with(text(),'Strawberry')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_fruitsStrawberry;

	@FindBy(xpath = "//h4[starts-with(text(),'Nuts Mixture')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_dryfruitsNutsMixture;

	@FindBy(xpath = "//h4[starts-with(text(),'Pista')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_dryfruitsPista;

	@FindBy(xpath = "//h4[starts-with(text(),'Cashews')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_dryfruitsCashews;

	@FindBy(xpath = "//h4[starts-with(text(),'Almonds')]//following-sibling::div[@class='product-action']/button")
	WebElement addToCart_dryfruitsAlmonds;

	@FindBy(xpath = "//button[contains(text(),'✔ ADDED')]")
	// need to wait for added element to disapper
	WebElement added;

	@FindBy(xpath = "//td[normalize-space()='Items']//following-sibling::td[2]/strong")
	WebElement totalItemsInCart;

	@FindBy(xpath = "//td[normalize-space()='Price']//following-sibling::td[2]/strong")
	WebElement totalPriceInCart;

	@FindBy(xpath = "//img[@alt='Cart']")
	WebElement cart;

	@FindBy(xpath = "(//ul[@class='cart-items'])[1]/li")
	WebElement listOfitemsInCart;

	@FindBy(xpath = "//button[normalize-space()='PROCEED TO CHECKOUT']")
	WebElement proceedToCheckout;

	@FindBy(css = ".quantity")
	WebElement quantityList;

	@FindBys({ @FindBy(xpath = "//tbody//td[4]/p[@class='amount']") })
	private List<WebElement> priceAmount;

	@FindBys({ @FindBy(xpath = "//tbody//td[5]/p[@class='amount']") })
	private List<WebElement> totalAmount;

	@FindBy(xpath = "//span[@class='discountAmt']")
	WebElement totalAfterDiscount;

	@FindBy(xpath = "//button[normalize-space()='Place Order']")
	WebElement placeOrder;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement agreeToTheTermsConditions;

	@FindBy(xpath = "//button[normalize-space()='Proceed']")
	WebElement proceed;

	@FindBy(tagName = "select")
	WebElement selectDropDown; // value=India

	@FindBy(xpath = "//span[starts-with(text(),'Thank you, your order has been placed successfully')]")
	WebElement orderSuccessMessage;

	public GreenKartHomePage() {
		PageFactory.initElements(driver, this);
	}

	private String items;
	private String price;

	public GreenKartHomePage(String items, String price) {
		super();
		this.items = items;
		this.price = price;
		System.out.println(this.items +" : "+ this.price+" : from Constructer");
	}

	public void addedVegsToCart() {
		vegCarrot.click();
		vegTomato.click();
		addToCart_vegBeans.click();
		addToCart_vegTomato.click();
		addToCart_vegCarrot.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public GreenKartHomePage getItemsAndPrice() {
		System.out.println("Items : " + listOfitemsInCart.getText());
		System.out.println("Price : " + totalPriceInCart.getText());

		String itemsTotal = listOfitemsInCart.getText();
		String totalPrice = totalPriceInCart.getText();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new GreenKartHomePage(itemsTotal, totalPrice);
		
	}

	public void checkTheItemsAndProcedeToCheckOut() {
		cart.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		proceedToCheckout.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void getTotalPrice() {
		int iprice=0;
		for (WebElement element : priceAmount) {
			String amount = element.getText();
			iprice=iprice+Integer.parseInt(amount);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(iprice);
	}
	
	public void completOrder() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		placeOrder.click();
		Select select = new Select(selectDropDown);
		select.selectByValue("India");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(agreeToTheTermsConditions));
		agreeToTheTermsConditions.click();
		proceed.click();
		System.out.println(orderSuccessMessage.getText());
	}

}
