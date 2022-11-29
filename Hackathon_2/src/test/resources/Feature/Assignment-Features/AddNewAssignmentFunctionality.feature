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
Feature: Add New Assignment  Functionality
  

  @tag1
  Scenario:  Validate Add New Assignment Button
    Given Staff Logged on to LMS website1
    And Staff is on Manage Assignment page
    When Staff clicks a Add new assignment button
    Then Staff should see Assignment details window
   

  @tag2
  Scenario:  Validate Add New Assignment Button
    Given Admin/User Logged on to LMS website1
    And Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff clicks a Add New Assignment button
    Then Admin/User/Staff should see a message "Staff only have access to add New Assignment"
    
    
    Scenario: No details Entered in  Assignment Details window 
    Given Staff Logged on to LMS website2
    And Staff is on  Assignment Details page1
    When Staff  clicks on Save after leaving all the fields empty
    Then Staff should see an error message "Name is required"
    
    
    Scenario: Staff Validate Assignment Details window with entering all fields
    Given Staff is on Assignment Details page2
    When Staff clicks  Save button after entering assignment name,assignment description,assignment Grade and Duedate
    Then Staff should see a message "New Assignment successfully added"
    
    Scenario: Staff Click Cancel in Assignment Details window 
    Given Staff logged on to LMS website3
    And Staff is on Assignment Details page3
    When Staff clicks cancel button with entering all fields
    Then Staff should see a Assignment details window is closed
    
    
      
    Scenario: validate New assignment
    Given Admin/user/Staff logged on to LMS website2
    And Admin/User/Staff is on Assignments page
    When Admin/User/Staff clicks on Assignment
    Then Admin/User/Staff should see a newly added Assignment
    
     Scenario: Validate  Manage button in Assignment Grade
    Given Staff logged on to LMS website4
    And Staff is on Assignment  page
    When Staff clicks manage button under Assignment Grade
    Then Staff should be navigated to Grade Window

    
