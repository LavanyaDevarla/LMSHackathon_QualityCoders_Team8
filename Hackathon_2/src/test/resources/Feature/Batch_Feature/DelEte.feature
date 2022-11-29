Feature: deletE Functionality2

Scenario: Verify Delete Functionality
Given Admin is on Manage Batch page
When Admin Clicks on any Delete button located on the right side
Then Admin see header text as "Delete Confirm"

Scenario: Click on Yes button in Delete Confirm window
Given Admin Clicks on any Delete button located on the right right side 	
When Admin Clicks on Yes button
Then Admin see Success message "Program Deleted Succesfully"

Scenario: Clicks on No button in Delete Confirm window
Given Admin Clicks on any Delete button located on the right side side
When 	Admin Clicks on No button	
Then Admin can see Program Name not deleted

Scenario: Verify Delete Functionality
Given Admin/User/Staff is on Manage Batch page
When 	Admin/User/Staff Enters deleted Program Name in Search	
Then Admin/User/Staff finds no results

Scenario: Validate Deleted Program Name
Given User/Staff is on Manage Batch page	
When User/Staff Clicks on Delete buttton	
Then User/Staff see a Error message "Only Admin have Access"

Scenario:User/Staff Validates Delete button
Given Admin/User/Staff Logged on to LMS Website
When 	Admin/User/Staff is on Manage batch page Page1
Then 	Admin/User/Staff see the Delete button on the top left hand side as Disabled