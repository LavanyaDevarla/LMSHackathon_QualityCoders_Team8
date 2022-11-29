Feature: Delete Functionality

  Background: Admin Logged on to LMS Website

  Scenario: Verify Delete Functionality on program 
    Given Admin is on Manage Program page delete1 on program 
    When Admin Clicks on any Delete button located on the right side on program 
    Then Admin see header text as "Delete Confirm" on program 

  Scenario: Click on Yes button in Delete Confirm window on program 
    Given Admin Clicks on any Delete button located on the right side on program 
    When Admin Clicks on Yes  button on program 
    Then Admin see Success message "Program Deleted Succesfully" on program 

  Scenario: Click on No  button in Delete Confirm window on program 
    Given Admin Clicks on any Delete button located on the right side on program 
    When Admin Clicks on No button on program 
    Then Admin can see Program Name not deleted on program 

  Scenario: Validate Deleted Program Name on program 
    Given Admin/User/Staff  is on Manage Program page for delete3 on program 
    When Admin/User/Staff Enters deleted  Program Name in Search on program 
    Then Admin/User/Staff finds no results on program 

  Scenario: User/Staff Validates Delete button on program 
    Given User/Staff is on Manage Program page for delete4 on program 
    When User/Staff Clicks on Delete buttton on program 
    Then User/Staff see a Error message "Only Admin have Access" on program 
