Feature: Validating the Manage Program Footer
  
  Background: Admin/User/Staff Logged on to LMS Website on program  
  Scenario: Validating the Manage Program Footer on program on program 
    Given   Admin/User/Staff Logged on to LMS Website on program 
    When Admin/User/Staff  is on Manage Program page on program 
    Then Admin/User/Staff see  Footer text as "In total there are 9 programs." on program
    
    
