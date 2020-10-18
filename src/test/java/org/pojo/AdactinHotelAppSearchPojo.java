package org.pojo;


import org.Base.SupportClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelAppSearchPojo extends SupportClass {
	public AdactinHotelAppSearchPojo(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	/**
	 * @return the checkInDate
	 */
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	/**
	 * @param checkInDate the checkInDate to set
	 */
	public void setCheckInDate(WebElement checkInDate) {
		this.checkInDate = checkInDate;
	}
	/**
	 * @return the checkOutDate
	 */
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	/**
	 * @param checkOutDate the checkOutDate to set
	 */
	public void setCheckOutDate(WebElement checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="Submit")
	private WebElement submitButton;
	@FindBy(id="hotels")
	private WebElement hotel;
	/**
	 * @return the hotel
	 */
	public WebElement getHotel() {
		return hotel;
	}
	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}
	/**
	 * @return the roomType
	 */
	public WebElement getRoomType() {
		return roomType;
	}
	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(WebElement roomType) {
		this.roomType = roomType;
	}
	/**
	 * @return the roomNo
	 */
	public WebElement getRoomNo() {
		return roomNo;
	}
	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(WebElement roomNo) {
		this.roomNo = roomNo;
	}
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement roomNo;
	/**
	 * @return the submitButton
	 */
	public WebElement getSubmitButton() {
		return submitButton;
	}
	/**
	 * @return the location
	 */
	public WebElement getLocation() {
		return location;
	}

}
