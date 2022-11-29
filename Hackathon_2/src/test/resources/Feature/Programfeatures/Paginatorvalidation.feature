Feature: Validating the Manage Program Paginator

  Background: Admin/User/Staff Logged on to LMS Website on program 
Given Admin/User/Staff now is on Manage Program page paginator on program 
  
  Scenario: Validating the Manage Program Paginator on program 
    Given Admin/User/Staff Logged on to LMS Website on program 
    When Admin/User/Staff is on the Manage Program page on program 
    Then Admin/User/Staff  see the text as "Showing 1 to 5 of 9 entries" on program 

  Scenario: Verify paginator -next button  on the Program page on program 
  #  Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff Clicks on Enabled paginator-next button on program 
    Then Admin/User/Staff see Paginator text as "Showing 6 to 9 of 9 entries" on program 

  Scenario: Verify paginator -prevoius button on the Program page on program 
  #  Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff Clicks on Enabled paginator -prev button on program 
    Then Admin/User/Staff see Paginator text as "Showing 1 to 5 of 9 entries" on program 

  Scenario: Verify  paginator -last button  on the Program page on program 
   # Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff Clicks on Enabled paginator-last button on program 
    Then Admin/User/Staff see Page number navigated to '2' on program 

  Scenario: Verify  paginator -first button  on the Program page on program 
    #Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff Clicks on Enabled paginator -first button on program 
    Then Admin/User/Staff see Page number navigated to '1' on program 
