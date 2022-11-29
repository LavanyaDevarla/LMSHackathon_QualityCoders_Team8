@tag
Feature: Descending order Functionality

  Background: Admin/User/Staff Logged on to LMS Website
    Given Admin/User/Staff is on Manage Program page for decendingorder on program

  @tag1
  Scenario: Verify Program Name are displayed in Descending order on program 
    # Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff Clicks on Program Name Descending Arrow on program 
    Then Admin/User/Staff see the Program Name displayed in Descending order on program 

  @tag2
  Scenario: Verify Program Description are displayed in Descending order on program 
    # Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff Clicks on Program Description Descending  Arrow on program 
    Then Admin/User/Staff see the Program Description displayed in Descending  orderr on program 

  @tag3
  Scenario: Verify Program Status are displayed in Descending order on program 
    # Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff Clicks on Program Status Descending Arrow on program 
    Then Admin/User/Staff see the Program Status displayed in Descending order on program 
