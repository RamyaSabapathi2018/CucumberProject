package org.pojo;


import org.Base.SupportClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelAppSelectPojo extends SupportClass {
	public AdactinHotelAppSelectPojo(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_1")
	private WebElement radio1;
	@FindBy(id="continue")
	private WebElement continueButton;
	/**
	 * @return the continueButton
	 */
	public WebElement getContinueButton() {
		return continueButton;
	}
	/**
	 * @return the radio1
	 */
	public WebElement getRadio1() {
		return radio1;
	}
	
	
}
