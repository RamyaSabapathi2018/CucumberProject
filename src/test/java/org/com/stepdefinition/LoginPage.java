package org.com.stepdefinition;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.Base.OtherSupportClass;
import org.Base.SupportClass;
import org.Base.WebElementSupportClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.AdactinHotelAppBookPojo;
import org.pojo.AdactinHotelAppLoginPojo;
import org.pojo.AdactinHotelAppSearchPojo;
import org.pojo.AdactinHotelAppSelectPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	SupportClass sc = new org.Base.SupportClass();
	AdactinHotelAppLoginPojo loginPOJO;
	OtherSupportClass otherSupport;
	AdactinHotelAppBookPojo bookPOJO;
	AdactinHotelAppSelectPojo selectPOJO;
	AdactinHotelAppSearchPojo searchPOJO;
	WebElementSupportClass webElementBase = new WebElementSupportClass();

	public WebDriver driver;
	String url = "http://adactinhotelapp.com/";

	@Given("User is in Login Page")
	public void user_is_in_Login_Page() {
		driver = sc.launchChromeBrowser();
		sc.launchURL("http://adactinhotelapp.com/");
		Assert.assertEquals("Verify Login page", url, sc.getBrowserCurrentURL());
	}

	@When("User enters valid {string} and valid {string}")
	public void user_enters_valid_and_valid(String userName, String password) {
		loginPOJO = new AdactinHotelAppLoginPojo();
		webElementBase.insertValue(loginPOJO.getUserNameField(), userName);
		webElementBase.insertValue(loginPOJO.getPasswordField(), password);
	}

	@Then("User click the Login Button")
	public void user_click_the_Login_Button() {
		webElementBase.clickButton(loginPOJO.getLoginButton());
	}

	@When("User is in Search Hotel Page")
	public void user_is_in_Search_Hotel_Page() {
		Assert.assertEquals("Verify Search page", "http://adactinhotelapp.com/SearchHotel.php",
				sc.getBrowserCurrentURL());

	}

	@When("User select {string},{string},{string},{string},{string},{string}")
	public void user_select(String location, String hotels, String roomType, String noOfRooms, String checkinDate,
			String checkOutDate) {
		otherSupport = new OtherSupportClass();
		searchPOJO = new AdactinHotelAppSearchPojo();
		otherSupport.createSelectClass(searchPOJO.getLocation());
		otherSupport.selectDropDown(searchPOJO.getLocation(), location, 1);
		otherSupport.selectDropDown(searchPOJO.getHotel(), hotels, 1);
		otherSupport.selectDropDown(searchPOJO.getRoomType(), roomType, 1);
		otherSupport.selectDropDown(searchPOJO.getRoomNo(), noOfRooms, 1);
		webElementBase.insertValue(searchPOJO.getCheckInDate(), checkinDate);
		webElementBase.insertValue(searchPOJO.getCheckOutDate(), checkOutDate);

	}

	@Then("User click on Search Button")
	public void user_click_on_Search_Button() {
		searchPOJO = new AdactinHotelAppSearchPojo();
		webElementBase.clickButton(searchPOJO.getSubmitButton());

	}

	@When("User is in Select Hotel Page")
	public void user_is_in_Select_Hotel_Page() {
		Assert.assertEquals("Verify Select page", "http://adactinhotelapp.com/SelectHotel.php",
				sc.getBrowserCurrentURL());

	}

	@Then("User selects the Hotel")
	public void user_selects_the_Hotel() {
		List<WebElement> allHotel = sc.findAllLocators("//input[contains(@id,'radiobutton')]", "xpath");
		allHotel.get(0).click();

	}

	@Then("User click the Continue button")
	public void user_click_the_Continue_button() throws InterruptedException {
		selectPOJO = new AdactinHotelAppSelectPojo();
		webElementBase.clickButton(selectPOJO.getContinueButton());

	}

	@When("User is in Hotel Booking page")
	public void user_is_in_Hotel_Booking_page() {
		Assert.assertEquals("Verify Booking page", "http://adactinhotelapp.com/BookHotel.php", driver.getCurrentUrl());

	}

	@When("User enters the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_the(String firstName, String lastName, String address, String cardNo, String cardType,
			String expiryMonth, String expiryYear, String cvv) {
		bookPOJO = new AdactinHotelAppBookPojo();
		webElementBase.insertValue(bookPOJO.getFirstName(), firstName);
		webElementBase.insertValue(bookPOJO.getLastName(), lastName);
		webElementBase.insertValue(bookPOJO.getAddress(), address);
		webElementBase.insertValue(bookPOJO.getCardNumber(), cardNo);
		otherSupport.selectDropDown(bookPOJO.getCardType(), cardType, 1);
		otherSupport.selectDropDown(bookPOJO.getExpiryMonth(), expiryMonth, 1);
		otherSupport.selectDropDown(bookPOJO.getExpiryYear(), expiryYear, 1);
		webElementBase.insertValue(bookPOJO.getCvv(), cvv);
	}

	@Then("User click the Book Now button")
	public void user_click_the_Book_Now_button() throws InterruptedException {
		bookPOJO = new AdactinHotelAppBookPojo();
		webElementBase.clickButton(bookPOJO.getBookButton());

	}

	@Then("User fetch the Booking order Number and display it")
	public void user_fetch_the_Booking_order_Number_and_display_it() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.urlToBe("http://adactinhotelapp.com/BookingConfirm.php"));
		WebElement table = sc.findLocators("//table[@class='login']", "xpath");
		List<WebElement> allRow = webElementBase.findAllLocators("tr", "tagName", table);
		for (int i = 0; i < allRow.size(); i++) {

			if (allRow.get(i).getText().contains("Order No")) {
				List<WebElement> allData = webElementBase.findAllLocators("td", "tagName", allRow.get(i));

				String orderNumber = "";
				for (int j = 0; j < allData.size(); j++) {
					WebElement order = sc.findLocators("order_no", "id");
					orderNumber = webElementBase.fetchAttribute(sc.findLocators("order_no", "id"), "value");
				}
				System.out.println("\n" + orderNumber);
			}
		}
		
	}

	@Then("User Close the browser")
	public void user_Close_the_browser() {
		sc.closeSingleWindow();
	}

}
