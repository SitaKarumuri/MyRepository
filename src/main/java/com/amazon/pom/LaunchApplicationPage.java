package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchApplicationPage {
	
	public static WebDriver driver;
	
	@FindBy(id="sp-cc-accept")
	private WebElement cookies;
	
	
	public LaunchApplicationPage(WebDriver driver2) {
			
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getCookies() {
		return cookies;
	}

	
	
}
