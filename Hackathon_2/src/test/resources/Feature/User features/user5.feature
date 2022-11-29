@TC006
Feature: Submit button
Scenario: Verify the presence of Submit button in User Details window
Given Admin/User/STAFF in Manage user page
When Admin/User/Staff CLIck Add new user button
Then Admin/User/Staff should see a button with text as Submit in user details window
#Label
Scenario: Verify the presence of Label Texts
Given Admin/User/Staff is on MAnage user page
When Admin/User/Staff clicks ADD new user button-LabelText
Then Admin/User/Staff should see the placeholders with Text As First name and so on
#input fields
Scenario: Verify the presence of input fields
Given Admin/uSER/Staff is on Manage user page
When Admin/User/Staff clicks Add NEW user BUTTON-input
Then Admin/User/Staff should see the input fields for First name,Middle name and so on
#Drop down
Scenario: Verify drop down menu for state
Given Admin/User/Staff is on User DETAils window
When Admin/User/Staff clicks the drop down icon for state
Then Admin/User/Staff should select from the drop down menu for state
Scenario: Verify drop down menu for user role
Given Admin/User/Staff is on User details WINdow
When Admin/User/Staff clicks the drop down icon for User Role
Then Admin/User/Staff should select from the drop down menu for user role
#Submit button functionality
Scenario: Validating the User Details window with all fields empty
Given Admin/User/Staff is on User DetailswinDOW
When Admin/User/Staff clicks submit button with all details empty
Then Admin/User/Staff should see a Error message Mandatory Fields cannot be empty
Scenario: Adding new User
#Given AdmiN/User/Staff is on USerDetailswindow-for new user
When Admin/User/Staff clicks Submit button by "entering all valid values in required fields"
Then Admin/User/Staff  see Success message  New User Created  is  Should be Saved.
#namefield
Scenario: Validating the User Details window with few fields empty
Given Admin/User/Staff is on User Detailwindow
When Admin/User/Staff clicks on Submit button after entering  Few Field details 
Then Admin/User/Staff see error message Name is required
#email
Scenario: Validating the Email address
Given Admin/User/Staff is on User Detailswindow- foremailid
When Admin/User/Staff clicks on Submit button after entering wrong email address 
Then Admin/User/Staff see error message Invalid Email address
#address2
Scenario: Validating the presence of Address2 button
Given Admin/User/Staff is on Manage user page- foraddress2
When Admin/User/Staff clicks Add new user button -validating address
Then Admin/User/Staff should see  button with text  Add C/O, Apt, Suite, Unit

