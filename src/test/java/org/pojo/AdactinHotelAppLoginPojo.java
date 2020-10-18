package org.pojo;


import org.Base.SupportClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelAppLoginPojo extends SupportClass{
	
	public AdactinHotelAppLoginPojo(){
		PageFactory.initElements(driver, this);
		/*WebDriver factory;
		PageFactory.initElements(factory, this);*/
	}
	@FindBy(id="username")
	//@FindAll({@FindBy(id="username"),@FindBy(name="username")})
	private WebElement userNameField;
	@FindBy(id="password")
	//@FindBys({@FindBy(id="password"),@FindBy(name="password")})
	private WebElement passwordField;
	@FindBy(id="login")
	private WebElement loginButton;
	/**
	 * @return the userNameField
	 */
	public WebElement getUserNameField() {
		return userNameField;
	}
	/**
	 * @return the passwordField
	 */
	public WebElement getPasswordField() {
		return passwordField;
	}
	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}
	

}
