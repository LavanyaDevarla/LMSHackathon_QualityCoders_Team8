#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Descending order Functionality

Background:
  Given Admin/User/Staff is on Assignment Page

  @tag1
  Scenario: Verify Assignment Name are displayed in Descending order
    When Admin/User/Staff Clicks on Assignment Name Descending Arrow
    Then Admin/User/Staff should see the Assignment Name displayed in Descending order
    

  @tag2
  Scenario: Verify Assignment Description are displayed in Descending order
    When  Admin/User/Staff Clicks on Assignment Description Descending Arrow
    Then Admin/User/Staff should see the Assignment Description displayed in Descending order
    
    
    Scenario: Verify Assignment Duedate are displayed in Descending order
    When  Admin/User/Staff Clicks on Assignment Due Date Descending Arrow
    Then  Admin/User/Staff should see the Assignment Due Date displayed in Descending order

    
     Scenario: Verify Assignment Grade are displayed in Descending order
    When  Admin/User/Staff Clicks on Assignment Grade Descending Arrow
    Then   Admin/User/Staff should see the Assignment Grade displayed in Descending order
