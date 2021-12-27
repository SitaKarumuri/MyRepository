package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	private WebElement signin;
	
	@FindBy(name="email")
	private WebElement emaillogin;
	
	@FindBy(id="continue")
	private WebElement continuelogin;
	
	@FindBy(name="password")
	private WebElement passwordlogin;
	
	@FindBy(id="signInSubmit")
	private WebElement signinsubmit;
	


	public LoginPage(WebDriver driver2) {
	
	this.driver = driver2;
		
	PageFactory.initElements(driver, this);
	}



	public WebElement getSignin() {
		return signin;
	}


	public WebElement getEmaillogin() {
		return emaillogin;
	}


	public WebElement getContinuelogin() {
		return continuelogin;
	}


	public WebElement getPasswordlogin() {
		return passwordlogin;
	}



	public WebElement getSigninsubmit() {
		return signinsubmit;
	}

	
	
}
