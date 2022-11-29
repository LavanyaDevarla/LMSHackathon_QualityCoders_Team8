@tag
Feature: CheckBox Functionality

  Background: Admin/User/Staff Logged on to LMS Website

  @tag1
  Scenario: Verify Checkbox Functionality on program 
    Given Admin/User/Staff is on Manage Program page to check checkbox on program 
    When Admin/User/Staff Selects First checkbox left to Program Name on program 
    Then Admin/User/Staff see all the checkboxes in the Program page get selected on program 
