package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	public static WebDriver driver;

	@FindBy(id="auth-cnep-done-button")
	private WebElement btn;
	
	@FindBy(xpath="//i[@class='hm-icon nav-sprite']")
	private WebElement accountlink;
	
	@FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[29]/a")
	private WebElement out;
	
	
	
	
	public Logout(WebDriver driver2) {
		
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}




	public WebElement getBtn() {
		return btn;
	}




	public WebElement getAccountlink() {
		return accountlink;
	}




	public WebElement getOut() {
		return out;
	}

	
	
}
