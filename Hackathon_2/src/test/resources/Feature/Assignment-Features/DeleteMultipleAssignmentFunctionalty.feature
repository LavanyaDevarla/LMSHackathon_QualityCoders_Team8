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
Feature: Delete Multiple Assignment Functionalty
 

  @tag1
  Scenario: Admin/User/Staff Validate Disabled delete button
    Given Admin/User/Staff is on Assignments page
    When Admin/User/Staff clicks on delete button on the top left
    Then Admin/User/Staff/ should see a disabled delete button
    
  @tag2
  Scenario: Staff  validate delete button on the top left
    Given Staff is on Manage Assignment page
    When Staff clicks delete button on the top aftr selecting multiple checkbox
    Then Staff should see a  Delete confirm window


 Scenario: Staff click Yes in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks Yes
   Then All Assignments are deleted Successfully
    
    
     Scenario: Staff click No in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks No
    Then Confirmation delete window should be closed successfully
    
