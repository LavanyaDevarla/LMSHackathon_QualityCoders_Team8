
@tag
Feature: Edit Functionality
  

  @tag1
  Scenario: Staff Validates Edit button
    Given Staff is on Manage Assignment page
    When Staff clicks an edit Assignment button
    Then Staff should see a Assignment details window
    

  @tag2
  Scenario: Staff Edit Assignment Name in Assignment Details window
    Given Staff is on Assignment Details page6
    When Staff clicks Save button  after edits Assignment Name 
    Then Staff should see a message "Assignment Name Updated"

   
   Scenario: Staff Edit Assignment Description in Assignment Details window
    Given Staff is on Assignment Details page2
    When Staff clicks Save button  after edits Assignment Description 
    Then Staff should see a message "Assignment Description Updated"
    
    Scenario: Staff Edit Assignment Grade in Assignment Details window
    Given Staff is on Assignment Details page3
    When Staff clicks Save button After edits Assignment Grade
    Then Staff should see a message "Assignment Grade Updated"
    
    Scenario: Staff Edit Assignment DueDate in Assignment Details window
    Given Staff is on Assignment Details page4
    When Staff clicks Save button After edits Assignment DueDate
    Then Staff should see a message "Assignment Due Date Updated"
    
    Scenario: Staff Click Cancel in  Assignment Details window
    Given Staff is on Assignment Details page5
    When Staff clicks cancel button 
    Then Staff Should see a Assignment Details Page is closed
    
    
     Scenario: Admin/User/Staff Validate Edit Button
    Given Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff clicks on the Edit button 
    Then Admin/User/Staff should see a message "Staff only have access to Edit Assignment"
    
