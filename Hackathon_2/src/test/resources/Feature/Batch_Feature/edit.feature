Feature: Edit Functionality
Background: Admin Clicks on Batch "Edit" button
#Given Admin Clicks on "Edit" button
Scenario: Validates Edit button
Given Admin is on Manage Batch page
Then Admin Clicks on Edit buttton
When Admin see header text as "Batch Details"

Scenario: Edit Name in Batch Details window
Then Admin Clicks on Save Button after updating Name
When Admin see Success message "Updated Name"

Scenario: Edit Description in Batch Details window
Then Admin Clicks on Save Button after updating Description
When Admin see Success message Batch"Updated Description"

Scenario: Edit Program Name from Dropdown in Batch Details window
When Admin Clicks on Save button after Selecting another Program Name
Then Admin see Success message "Updated Program Name"

Scenario: Edit Status in Batch Details window
When Admin Clicks on Save Button after updating Status	
Then Admin see Success message "Updated Status"

Scenario: Edit Number Of Classes in Batch Details window
When Admin Clicks on Save Button after updating No Of Classes
Then 	Admin see Success message "Updated No of Classes"

Scenario: Click on Cancel button in Batch Details window
When Admin Clicks on Cancel button	
Then  Admin see a Batch Details window getting closed

Scenario: Verifys Edited Batch Name/BatchDescription
Given Admin/User/Staff is on Manage Batch page
When Admin/User/Staff Enters edited Batch Name/Batch Description in Search
Then Entry for the edited Batch Name/Batch Description is shown

Scenario: User/Staff Validate Edit button
Given User/Staff is on Manage Batch page
When User/Staff Clicks on Edit buttton	
Then 	User/Staff see a Error message "Only Admin have Access"