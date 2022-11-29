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
Feature: Paginator Vaildation
  

  @tag1
  Scenario:  Validating Assignment Paginator
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff Should see a Paginator text "Showing 1 to 3 of 3 entries"
    

  @tag2
  Scenario: Verify  paginator -next button  on the Assignment page
    Given Admin/User/Staff is on Assignment Page
 #   When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff Should be navigated to next page
    
    Scenario: Verify paginator -previous button on the Assignment page
   Given Admin/User/Staff is on Assignment Page
   When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff Should be navigated to previous page
    
    
    Scenario: Verify paginator -last button on the Assignment page
   Given Admin/User/Staff is on Assignment Page
   When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff Should be navigated to Last page
    
    
    
    Scenario: Verify paginator -first button on the Program page
   Given Admin/User/Staff is on Assignment Page
   When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff Should be navigated to First  page
    
    
    
    
    
