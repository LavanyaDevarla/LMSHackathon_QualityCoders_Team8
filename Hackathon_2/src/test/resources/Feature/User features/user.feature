
@TC001
Feature: Page Validation
  Background: 
 
 
  Given Admin/User/Staff is on any page after Login
  Scenario: Validate landing in Manage page
  When Admin/User/Staff clicks the Tab User
  Then Admin/User/Staff should see the Manage user page
  
  #Header Validation feature
  Scenario: Validate the Manage page heading
  When Admin/User/Staff is on the Manage user page after clicking User Tab
  Then Admin/User/Staff should see the page heading as Manage User