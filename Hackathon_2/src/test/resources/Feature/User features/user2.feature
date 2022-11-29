@TC003
Feature: Footer Validation

Scenario: Validating table footer
Given Admin/User/Staff table is displayed in manage user page
When Admin,User,Staff lands on Manage UseR page
Then Admin/User/Staffshould see the table footer as In total there are four users.
#Add New User Functionality
Scenario: Validate the presence of Add new user button
Given Adminr User r Staff is on any page after Login
When Adminr Userr Staff is on the Manage user page after clicking User Tab
Then Admin/User/Staff should see the button with text plus  icon and Add New User
Scenario: Verify the functionality of Add new user button
Given Admin/User/Staff is on Manage user page
When Admin/User/Staff clicks Add New User
Then Admin/User/Staff should see the User details dialog box
#Table header
Scenario: Validating Table header
Given Adminr User r Staff is on any page after LogiN
When Adminr Userr Staff is on the Manage user page after clicking User
Then Adminr Userr Staff should see the table header as Empty checkbox-icon  ID with sort icon, Name with Sort icon 
Scenario: Verify the functionality of sort icon present in table header
Given Admin/User/Staff table is displayed in manage user page-sort icon
When Admin/User/Staff clicks sort icon in table header
Then Table rows should be sorted
Scenario: Check box in table header
Given Admin/User/Staff table is displayed in manage user page-checkbox
When Admin/User/Staff checks empty checkbox in header
Then Check box in all the rows of user table should be checked
Scenario: Check box in table header
Given Admin/User/Staff table is displayed in manage user page-unchecks
When Admin/User/Staff unchecks checkbox in header
Then Check box in all the rows of user table should be unchecked
