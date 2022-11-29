@tag
Feature: Add A New Program Functionality

  Background: Admin Logged on to LMS Website
    Given Admin Clicks on "A New Program" button on program 

  @tag1
  Scenario: Validate Add A New Program button on program 
    Given Admin is on Manage Program page to Addnewrecord on program 
    When Admin Clicks on  the" + A New Program" button on program 
    Then Admin see header text as "Program Details" on program 

  @tag2
  Scenario: No details Entered in Program Details window on program 
    # Given Admin Clicks on "A New Program" button
    When Admin Clicks on Save Button with out entering  details on program 
    Then Admin see Error message "Name is required" on program 
    And Suggestion - "Name is required " message can be added  - Negative Scenario on program 

  @tag3
  Scenario: Enters  All details in Program Details window on program 
    # Given Admin Clicks on "A New Program" button on program 
    When Admin Clicks on Save Button after entering all details on program 
    Then Admin see Success message "New Program Created" on program 

  @tag4
  Scenario: Enters Only Name in Program Details window on program 
    #Given Admin Clicks on "A New Program" button on program 
    When Admin Clicks on Save Button after entering Name alone on program 
    Then Admin see Error message "Description is required" on program 

  @tag5
  Scenario: Admin see Error message "Description is required" on program 
    #Given Admin Clicks on "A New Program" button on program 
    When Admin Clicks on Save Button after entering Description alone on program 
    Then Admin see Error message "Name is required" on program 

  @tag6
  Scenario: Selects Only Status in Program Details window on program 
    #Given Admin Clicks on "A New Program" button on program 
    When Admin Clicks on Save Button after selecting Status alone on program 
    Then Admin see Error message "Name is required" on program 

  @tag7
  Scenario: Click on Cancel button in Program Details window on program 
    #Given Admin Clicks on "A New Program" button on program 
    When Admin Clicks on Cancel button on program 
    Then Admin see a Program Details window getting closed on program 

  #Background: Admin/User/Staff Logged on to LMS Website on program 
  @tag8
  Scenario: Verify Added New Program Name on program 
    Given Admin/User/Staff is on Manage Program page foraddrec on program 
    When Admin/User/Staff Enters newly added  Program Name in Search on program 
    Then Entry for the newly added Program Name is shown on program 

  #Background: User/Staff Logged on to LMS Website on program 
  @tag9
  Scenario: User/Staff Validate Add A New Program button on program 
    Given User/Staff is on Manage Program page on program 
    When User/Staff Clicks on " + A New Program" button on program 
    Then User/Staff see a Error message "Only Admin have Access" on program 
