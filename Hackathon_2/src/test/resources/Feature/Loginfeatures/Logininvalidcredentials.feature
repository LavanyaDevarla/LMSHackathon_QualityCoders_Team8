Feature: Login -Invalid Credentials

 Background: Admin/User/Staff opens the LMS website

  Scenario: User login with valid username and invalid password
    Given User is on Login Page
    When User clicks login button after entering valid Username and invalid Password  
    Then User should see a error message "Entered invalid password"

    Scenario: User User login with invalid username and valid password
    Given User is on Login Page
    When User clicks login button after entering  Invalid username and valid Password  
    Then User should see a error message "Entered invalid username"

     Scenario: User login with invalid username and invalid password
    Given User is on Login Page
    When User clicks login button after entering Invalid username and invalid Password 
    Then User should see a error message "The username and password  are incorrect"
    
   
     Scenario: User login with valid username and leaves password empty
    Given User  is on the Login Page 
    When User clicks login button after entering valid username and leaves Password field empty  
    Then It should show error message "enter valid password"
    
     Scenario: Admin/Staff with valid username,invalid password,code
    Given Admin/Staff is on the Login Page
    When Admin/Staff  clicks login button after entering  valid username invalid Password and code  
    Then Admin/Staff should see a error message "Entered invalid password"
    
     Scenario: Admin/Staff with invalid username,valid password,code
    Given Admin/staff is on Login Page
    When Admin/Staff  clicks login button after entering invalid username,valid Password and code 
    Then Admin/Staff should see a error message "Entered invalid username"
    
     Scenario: Admin/Staff with valid username,valid password without code
    Given Admin/staff is on Login Page
    When Admin/Staff  clicks login button after entering invalid username,valid Password  and without code 
    Then Admin/Staff should see a error message "The code is required"
    