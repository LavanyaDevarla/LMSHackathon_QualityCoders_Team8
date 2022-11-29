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
Feature: Ascending Order Functionality

Background: 
Given Admin/User/Staff is on Assignment Page
  

  
  Scenario: Verify Assignment Name are displayed in Ascending order
    When  Admin/User/Staff Clicks on Assignment Name Ascending Arrow
    Then  Admin/User/Staff should see the Assignment Name displayed in Ascending order
    

  
  Scenario: Verify Assignment Description are displayed in Ascending order
    When Admin/User/Staff Clicks on Assignment Description Ascending Arrow
    Then  Admin/User/Staff should see the Assignment Description displayed in Ascending order
    
    
     
  Scenario: Verify Assignment Duedate are displayed in Ascending order
    When Admin/User/Staff Clicks on Assignment Due Date Ascending Arrow
    Then  Admin/User/Staff should see the Assignment Due Date displayed in Ascending order
    
    
       
  Scenario: Verify Assignment Grade  are displayed in Ascending order
    When Admin/User/Staff Clicks on Assignment Grade Ascending Arrow
    Then  Admin/User/Staff should see the Assignment Grade displayed in Ascending order
    

    