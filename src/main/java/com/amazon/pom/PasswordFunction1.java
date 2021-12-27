package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordFunction1 {
	

	public static WebDriver driver;

	
	
	@FindBy(name="password")
	private WebElement currentpassword;
	
	@FindBy(name="passwordNew")
	private WebElement newpassword;
	
	@FindBy(name="passwordNewCheck")
	private WebElement newpasswordcheck;
	
	@FindBy(id="cnep_1D_submit_button")
	private WebElement savechangesbutton;
	
	public PasswordFunction1(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getCurrentpassword() {
		return currentpassword;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	public WebElement getNewpasswordcheck() {
		return newpasswordcheck;
	}

	public WebElement getSavechangesbutton() {
		return savechangesbutton;
	}

	

}
