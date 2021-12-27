Feature: To check change password functionality

Scenario: Verify User is able to navigate to the Amazon application

Given User launch the application
When user maximize the window
And user accepts the cookies in the application
Then user verifies the homepage

Scenario: Verify user is able to login to the application with valid username and password

When user mouse hover to sign in section
And user clicks on sign in button 
And User enters the valid username in the username field
And user clicks the continue button
And USer enters the valid password in the password field
And User able to clicks the sign in button
Then user logs in and navigates to the amazon homepage

Scenario: To check change password functionality

When user mousehover to Account and lists
And user selects the Your account option
And user clicks on Login and security
Then user accepts the Two factor authentication and navigates to Login and secutiry page

Scenario: To check change password functionality by using wrong current password, wrong new password and wrong confirm password

When user clicks the edit button for password
And user enters wrong current password
And user enters wrong new password
And user enters wrong re-enter password
And user click on save changes button 
Then user gets an error message saying Passwords do not match

Scenario: To check change password functionality by using correct current password, correct new password and wrong confirm password

When user enters correct current password
And user enters correct new password
And user enters incorrect re-enter password
And user clicks on save changes button 
Then user gets the error message saying Passwords do not match

Scenario: To check change password functionality by using the correct current password, wrong new password and wrong confirm password

When user enters the correct password
And user enters the incorrect new password
And user enters the incorrect re-enter password
And user clicks on save the changes button 
Then user gets the error message that says Passwords do not match

Scenario: To check change password functionality by using incorrect current password, correct new password and correct confirm password

When user enters the correct password value
And user enters the incorrect new password in the new password field
And user enters the incorrect re-enter password in the re-enter password field
And user clicks the save the changes button 
Then user gets the error message says Passwords do not match

Scenario: To check change password functionality by using correct current password, correct new password and correct confirm password

When user enters the correct password value in the current password field
And user enters the correct new password in the new password field
And user enters the correct re-enter password in the re-enter password field
And user clicks the save the changes button in the page
And user navigates you seccessful change password page
Then user clicks on Done button to leave the page 

Scenario: User log out of the account 
 
 When verified user is in the amazon homepage 
 And user mousehover to Account and lists section
 And user clicks on sign out button 
 And user logs out of the page and navigates to sign in page again
 Then user closes the browser
 
 
 








