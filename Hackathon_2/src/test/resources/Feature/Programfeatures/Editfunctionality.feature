@tag
Feature: Edit Functionality

  @tag1
  Scenario: Validates Edit button in Program Details window on program 
    Given Admin is on Manage Program page on program 
    When Admin Clicks on Edit buttton on program 
    Then Admin see header text as "Program Details" on program 

  @tag2
  Scenario: Edit Program Name in Program Details window on program 
    Given Admin Clicks on "Edit" button on program 
    When Admin Clicks on Save Button after updating Name on program 
    Then Admin see Success message "Updated Program Name" on program 

  @tag3
  Scenario: Edit Program Description in Program Details window on program 
    Given Admin Clicks on "Edit" button on program 
    When Admin  Clicks on Save Button after updating  Description on program 
    Then Admin see Success message"Updated Description" on program 

  @tag4
  Scenario: Edit Program Status in Program Details window on program 
    Given Admin Clicks on "Edit" button on program 
    When Admin  Clicks on Save Button after Changing  status on program 
    Then Admin see Success message "Updated Status" on program 

  @tag5
  Scenario: Click on Cancel button in Program Details window on program 
    Given Admin  Clicks on "Edit" button record edit on program 
    When Admin Clicks on Cancel button on program 
    Then Admin see a Program Details window getting closed on program 

  @tag6
  Scenario: User/Staff Validate Edit button on program 
    Given User/Staff is on Manage Program page for edit on program 
    When User/Staff Clicks on Edit buttton on program 
    Then User/Staff see a Error message  "Only Admin have Access" aspopup on program 

  @tag7
  Scenario: Verifys Edited Program Name/Program Description on program 
    Given Admin/User/Staff is on Manage Program page edit3 on program 
    When Admin/User/Staff Enters edited Program Name in Search on program 
    Then Entry for the edited  Program Name is shown on program 
