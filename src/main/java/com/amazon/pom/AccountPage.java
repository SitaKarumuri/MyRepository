package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountlink;
	
	@FindBy(xpath ="//span[text()='Edit login, name, and mobile number']")
	private WebElement loginsecurity;
	
	@FindBy(id="auth-cnep-edit-password-button")
	private WebElement edit;
	

	public AccountPage(WebDriver driver2) {
		
	this.driver = driver2;
		
    PageFactory.initElements(driver, this);
		
	
	}


	public WebElement getAccountlink() {
		return accountlink;
	}


	public WebElement getLoginsecurity() {
		return loginsecurity;
	}


	public WebElement getEdit() {
		return edit;
	}



}
