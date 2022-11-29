Feature: Search TextBox Functionality

  Background: Admin/User/Staff Logged on to LMS Website on program 
    Given Admin/User/Staff is on Manage Program Page search on program  
   
  Scenario: Validate Search Feature on program 
   Given Admin/User/Staff Loggedon to LMS Website on program 
    When Admin/User/Staff is on Manage Program Page for search on program 
    Then Admin/User/Staff see the Search Text box has text as "Search" on program 

  Scenario: Search by  Program Name on program 
    # Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff enters Program Name to be searched on program 
    Then Entries for the searched Program Name are shown on program .

  Scenario: Search by Program Description
    #Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff enters Program Description to be searched on program 
    Then Entries for the searched Program Description are shown on program .

  Scenario: Search by  Program Status on program 
    #Given Admin/User/Staff is on Manage Program page on program 
    When Admin/User/Staff enters Program Status to be searched on program 
    Then Entries for the searched Program Status are shown on program .
