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
Feature: Delete Assignment Functionality
 

  @tag1
  Scenario: Staff clicks delete button
    Given Staff is on Manage Assignment page2
    When Staff clicks on delete button on the righr side
    Then Staff should see a Delete Confirmation window
    
Scenario: Staff click Yes in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks Yes
    Then Staff Should see "Assignment Deleted Successfully
    
    
    Scenario: Staff clicks No button in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks No
    Then Confirmation delete window should be closed successfully
    
    
    
    Scenario: Admin clicks delete button
    Given Admin is on Manage Assignment page
    When Admin clicks on delete button
    Then Admin should see a message "Staff only have access"
    
    
    Scenario: Admin/User/Staff clicks delete button
    Given Admin/User/Staff is on Manage Assignment page2
    When Admin/User/Staff clicks on delete button
    Then Admin/User/Staff should see a message"Staff only have access"
    
    
    
 