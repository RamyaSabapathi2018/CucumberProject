package org.pojo;


import org.Base.SupportClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelAppBookPojo extends SupportClass {
		public AdactinHotelAppBookPojo(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cardNumber;
	@FindBy(id="cc_type")
	private WebElement cardType;
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bookButton;
	/**
	 * @return the firstName
	 */
	public WebElement getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public WebElement getLastName() {
		return lastName;
	}
	/**
	 * @return the address
	 */
	public WebElement getAddress() {
		return address;
	}
	/**
	 * @return the cardNumber
	 */
	public WebElement getCardNumber() {
		return cardNumber;
	}
	/**
	 * @return the cardType
	 */
	public WebElement getCardType() {
		return cardType;
	}
	/**
	 * @return the expiryMonth
	 */
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	/**
	 * @return the expiryYear
	 */
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	/**
	 * @return the cvv
	 */
	public WebElement getCvv() {
		return cvv;
	}
	/**
	 * @return the bookButton
	 */
	public WebElement getBookButton() {
		return bookButton;
	}

}
