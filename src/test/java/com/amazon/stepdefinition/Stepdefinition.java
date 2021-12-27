package com.amazon.stepdefinition;

import org.openqa.selenium.WebDriver;



import com.amazon.baseclass.BaseClass1;
import com.amazon.pom.AccountPage;
import com.amazon.pom.LaunchApplicationPage;
import com.amazon.pom.LoginPage;
import com.amazon.pom.Logout;
import com.amazon.pom.PasswordFunction1;
import com.amazon.pom.PasswordFunction2;
import com.amazon.pom.PasswordFunction3;
import com.amazon.pom.PasswordFunction4;
import com.amazon.pom.PasswordFunction5;
import com.amazon.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Stepdefinition extends BaseClass1 {

	public static WebDriver driver = Runner.driver;
	
	LaunchApplicationPage la = new LaunchApplicationPage(driver);
	
	LoginPage lp = new LoginPage(driver);
	
	AccountPage ap = new AccountPage(driver);
	
	PasswordFunction1 pf1 = new PasswordFunction1(driver);
	
	PasswordFunction2 pf2 = new PasswordFunction2(driver);
	
	PasswordFunction3 pf3 = new PasswordFunction3(driver);
	
	PasswordFunction4 pf4 = new PasswordFunction4(driver);
	
	PasswordFunction5 pf5 = new PasswordFunction5(driver);
	
	Logout lo = new Logout(driver);
	
	
	
	
	@Given("^User launch the application$")
	public void user_launch_the_application()  {
	   getUrl("https://www.amazon.co.uk/");
	}

	@When("^user maximize the window$")
	public void user_maximize_the_window()  {
	  driver.manage().window().maximize();
	}

	@When("^user accepts the cookies in the application$")
	public void user_accepts_the_cookies_in_the_application()  {
	   
		la.getCookies().click();
	}

	@Then("^user verifies the homepage$")
	public void user_verifies_the_homepage() {
	  
	}

	@When("^user mouse hover to sign in section$")
	public void user_mouse_hover_to_sign_in_section()  {
	  
	}

	@When("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button()  {
		   lp.getSignin().click();

	}

	@When("^User enters the valid username in the username field$")
	public void user_enters_the_valid_username_in_the_username_field()  {
	       lp.getEmaillogin().sendKeys("sheetal.karumuri@gmail.com");
	}

	@When("^user clicks the continue button$")
	public void user_clicks_the_continue_button() {
	       lp.getContinuelogin().click();
	}

	@When("^USer enters the valid password in the password field$")
	public void user_enters_the_valid_password_in_the_password_field()  {
	       lp.getPasswordlogin().sendKeys("Reyaansh@123");
	}

	@When("^User able to clicks the sign in button$")
	public void user_able_to_clicks_the_sign_in_button()  {
	       lp.getSigninsubmit().click();
	}

	@Then("^user logs in and navigates to the amazon homepage$")
	public void user_logs_in_and_navigates_to_the_amazon_homepage()  {

	}

	@When("^user mousehover to Account and lists$")
	public void user_mousehover_to_Account_and_lists()  {
	      
	}

	@When("^user selects the Your account option$")
	public void user_selects_the_Your_account_option()  {
		 ap.getAccountlink().click();
	}

	@When("^user clicks on Login and security$")
	public void user_clicks_on_Login_and_security()  {
	     ap.getLoginsecurity().click();
	}

	@Then("^user accepts the Two factor authentication and navigates to Login and secutiry page$")
	public void user_accepts_the_Two_factor_authentication_and_navigates_to_Login_and_secutiry_page()  {
	      ap.getEdit().click();
	}

	@When("^user clicks the edit button for password$")
	public void user_clicks_the_edit_button_for_password()  {
	    
	}

	@When("^user enters wrong current password$")
	public void user_enters_wrong_current_password()  {
	     pf1.getCurrentpassword().sendKeys("chikki123");
	}

	@When("^user enters wrong new password$")
	public void user_enters_wrong_new_password() {
	    pf1.getNewpassword().sendKeys("Sonyelm@111");
	}

	@When("^user enters wrong re-enter password$")
	public void user_enters_wrong_re_enter_password()  {
	   pf1.getNewpasswordcheck().sendKeys("Sonyelm111");
	}

	@When("^user click on save changes button$")
	public void user_click_on_save_changes_button()  {
	   pf1.getSavechangesbutton().click();
	}

	@Then("^user gets an error message saying Passwords do not match$")
	public void user_gets_an_error_message_saying_Passwords_do_not_match()  {
	   
	}

	@When("^user enters correct current password$")
	public void user_enters_correct_current_password() {
	    pf2.getCurrentpassword().sendKeys("Chikki@123");
	}

	@When("^user enters correct new password$")
	public void user_enters_correct_new_password()  {
	   pf2.getNewpassword().sendKeys("Sonyelm@123");	}

	@When("^user enters incorrect re-enter password$")
	public void user_enters_incorrect_re_enter_password()  {
	    pf2.getNewpasswordcheck().sendKeys("Sonyelm123");
	}

	@When("^user clicks on save changes button$")
	public void user_clicks_on_save_changes_button()  {
	   pf2.getSavechangesbutton().click();
	}

	@Then("^user gets the error message saying Passwords do not match$")
	public void user_gets_the_error_message_saying_Passwords_do_not_match()  {
	    
	}

	@When("^user enters the correct password$")
	public void user_enters_the_correct_password()  {
	  pf3.getCurrentpassword().sendKeys("Chikki@123");
	}

	@When("^user enters the incorrect new password$")
	public void user_enters_the_incorrect_new_password() {
	  pf3.getNewpassword().sendKeys("Sonyelm123");
	}

	@When("^user enters the incorrect re-enter password$")
	public void user_enters_the_incorrect_re_enter_password()  {
	   pf3.getNewpasswordcheck().sendKeys("sonyelm@123");
	}

	@When("^user clicks on save the changes button$")
	public void user_clicks_on_save_the_changes_button()  {
	   pf3.getSavechangesbutton().click();
	}

	@Then("^user gets the error message that says Passwords do not match$")
	public void user_gets_the_error_message_that_says_Passwords_do_not_match()  {
	   
	}

	@When("^user enters the correct password value$")
	public void user_enters_the_correct_password_value()  {
	   pf4.getCurrentpassword().sendKeys("chikki@123");
	}

	@When("^user enters the incorrect new password in the new password field$")
	public void user_enters_the_incorrect_new_password_in_the_new_password_field()  {
	    pf4.getNewpassword().sendKeys("Sonyelm@12");
	}

	@When("^user enters the incorrect re-enter password in the re-enter password field$")
	public void user_enters_the_incorrect_re_enter_password_in_the_re_enter_password_field() {
	   pf4.getNewpasswordcheck().sendKeys("sonyelm123");
	}

	@When("^user clicks the save the changes button$")
	public void user_clicks_the_save_the_changes_button()  {
	  pf4.getSavechangesbutton().click();
	}

	@Then("^user gets the error message says Passwords do not match$")
	public void user_gets_the_error_message_says_Passwords_do_not_match()  {
	    
	}

	@When("^user enters the correct password value in the current password field$")
	public void user_enters_the_correct_password_value_in_the_current_password_field()  {
	   pf5.getCurrentpassword().sendKeys("Chikki@123");
	}

	@When("^user enters the correct new password in the new password field$")
	public void user_enters_the_correct_new_password_in_the_new_password_field()  {
	   pf5.getNewpassword().sendKeys("Reyaansh@123");
	}

	@When("^user enters the correct re-enter password in the re-enter password field$")
	public void user_enters_the_correct_re_enter_password_in_the_re_enter_password_field() {
	  pf5.getNewpasswordcheck().sendKeys("Reyaansh@123");
	}

	@When("^user clicks the save the changes button in the page$")
	public void user_clicks_the_save_the_changes_button_in_the_page()  {
	  pf5.getSavechangesbutton().click();
	}

	@When("^user navigates you seccessful change password page$")
	public void user_navigates_you_seccessful_change_password_page() {
	  
	}

	@Then("^user clicks on Done button to leave the page$")
	public void user_clicks_on_Done_button_to_leave_the_page()  {
	// lo.getBtn().click();
	}

	@When("^verified user is in the amazon homepage$")
	public void verified_user_is_in_the_amazon_homepage() {
	   
	}

	@When("^user mousehover to Account and lists section$")
	public void user_mousehover_to_Account_and_lists_section() {
		
		lo.getAccountlink().click();
		
	    
	}
	

	@When("^user clicks on sign out button$")
	public void user_clicks_on_sign_out_button() {
		
	
	moveToElement(lo.getOut());
	clickonElement(lo.getOut());
	
		 
	   
	   
	}

	@When("^user logs out of the page and navigates to sign in page again$")
	public void user_logs_out_of_the_page_and_navigates_to_sign_in_page_again()  {
	  
	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser()  {
	driver.close();
	}
	
}