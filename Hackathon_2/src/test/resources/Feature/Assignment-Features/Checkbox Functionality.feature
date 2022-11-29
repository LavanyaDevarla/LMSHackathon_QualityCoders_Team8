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
Feature: Checkbox Functionality
 

  @tag1
  Scenario: Admin/User/Staff validate check box on the left side to the Assignment Name
    Given Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff clicks check box on the left side to the Assignment Name
    Then Admin/User/Staff should see a enabled delete button on the top left 
    

  @tag2
  Scenario: Admin validate check box on the left side to the Assignment Name
    Given Admin is on Manage Assignment page
    When Admin clicks check box on the left side to the Assignment Name
    Then Admin should see a warning message "Admin dont have access  "
    
    
     Scenario: User/Staff validate individual checkbox
    Given Admin/User/Staff is on Assignments page	
    When Admin/User/Staff clicks individual checkbox button 
    Then Admin/User/Staff should see a delete button on the top left
    
     Scenario: Admin validate individual checkbox
    Given Admin is on Manage Assignment page
    When Admin clicks individual checkbox button 
    Then Admin should see a warning message "Admin dont have access "

   
