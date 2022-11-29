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
Feature: Assignment Google form
  

  @tag1
  Scenario: Admin/User/Staff clicks Assignment Name
    Given Admin/User/Staff is on Assignment page1
    When Admin/User/Staff clicks on Assignment Name
    Then Admin/User/Staff should be navigated to Assignment Google form page
    

  @tag2
  Scenario: Admin clicks Assignment Name
    Given Admin is on Assignment page
    When Admin clicks on Assignment Name
    Then Admin should see a warning message "you dont have access"
    
     Scenario: Admin/User/Staff validate assignment Google form with entering all fields
    Given Admin/User/Staff is on Assignment  Google form page
    When Admin/User/Staff clicks on submit button after entering all questions and mail id 
    Then Admin/User/Staff entered google forms successfully
    
    
    
       
    Scenario: Admin/User/Staff validate assignment Google form leaving empty
    Given Admin/User/Staff is on Assignment  Google form page1
    When Admin/User/Staff clicks on submit button after leaving all questions and mail id 
    Then Admin/User/Staff should get a warning message "Must enter the mandatory fields"
    
    
       
    Scenario: Admin/User/Staff Validate Assignment google form after cliclking clear button
    Given Admin/User/Staff is on Assignment  Google form page2
    When Admin/User/Staff clicks clear form button after entering all questions and mail id 
    Then The Assignment Google form cleared successfully
    
    
    
    Scenario: Admin/User/Staff clicks Switch account
    Given Admin/User/Staff is on Assignment  Google form page3
    When Admin/User/Staff clicks Switch account link
    Then Admin/User/Staff should be switched over the account Successfully
    
    
    
   