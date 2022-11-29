Feature: Header Validation
  
  Background: Admin/User/Staff Logged on to LMS Website 
  Scenario: Validating the Manage Program Header
    Given  Admin/User/Staff Logged on to LMS Website on program 
    When Admin/User/Staff  is on Manage Program page on program 
    Then Admin/User/Staff see header text as "Manage Program" on program 
    

  