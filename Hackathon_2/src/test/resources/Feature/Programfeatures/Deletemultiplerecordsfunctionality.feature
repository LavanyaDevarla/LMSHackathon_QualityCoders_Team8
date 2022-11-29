@tag
Feature: Delete Multiple Records Functionality

  Background: 
    Given Admin/User/Staff is on Manage Program page on deletemultirecord on program 

  @tag1
  Scenario: Verify the state of Delete button on left hand side on program 
    Given Admin/User/Staff Logged on to LMS Website on program 
    When Admin/User/Staff select Manage Program page on program 
    Then Admin/User/Staff see the Delete button on the top left hand side as Disabled on program 

  @tag2
  Scenario: Validates Multiple Program Selection on program 
    #Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff selects more than one Program Name using checkbox on program 
    Then Admin/User/Staff see the Delete button on the top left hand side as Enabled on program 

  @tag3
  Scenario: Verify Deletion of Multiple Records on program 
    Given Admin selects more than one Program Name using checkbox on program 
    When Admin Clicks on Enabled Delete button on the top left hand side on program 
    Then Admin see header text as "Delete Confirm" on program 

  @tag4
  Scenario: Click on Yes button in Delete Confirm window on program 
    Given Admin Clicks on Enabled Delete button after selecting  more than one Program Name on program 
    When Admin Clicks on Yes  button on program 
    Then Admin see Success message as "Program Deleted Succesfully" on program 

  @tag5
  Scenario: Click on No button in Delete Confirm window on program 
    Given Admin/User/Staff have access and Admin Clicks on Enabled Delete button after selecting  more than one Program Name  on program 
    When Admin Clicks on No button on program 
    Then Admin can see Program Names not deleted on program 

  @tag5
  Scenario: Verify Deleted program Names on program 
    #Given Admin/User/Staff is on Manage program page on program 
    When Admin/User/Staff Enters deleted  Program Names in Search on program 
    Then Admin/User/Staff finds no results on program 

  @tag6
  Scenario: Deletion of Multiple Records on program 
    Given User/Staff selects more than one Program Name using checkbox on program 
    When User/Staff Clicks on Enabled Delete button on the top left hand side on program 
    Then User/Staff see a Error message "Only Admin have Access" on program 
