@TC005
Feature: search
Scenario: Verify the presence of Input field for searching
Given Admin/User/Staff is on any page after Login--search
When Admin/User/Staff is on the Manage user page after clicking User Tab-search
Then  Admin/User/Staff see the Search Text box has text as Search
Scenario: Verify the presence of search icon and text in the search input filed
Given Admin/User/Staff is on any page after Login-searchinput
When Admin/User/Staff is on the Manage user page after clicking UserTab-searchinput
#Then  Admin/User/Staff should see the search input field with search icon and text as" Search…"
Scenario: Verify the functionality of search
Given Admin/User/Staff is on Manage user page-searchfun
When Admin/User/Staff types Name to search
Then  Rows with the name should be displayed
Scenario: Verify the functionality of search
Given Admin/User/Staff is on Manage user page--verifyfun
When Admin/User/Staff types random text in search field which has no matching entry
Then  No rows is displayed
#id
Scenario: Verify ID functionality
Given Admin/User/Staff table is displayed in manage user page-id
When Admin/User/Staff clicks ID in any row
Then  Admin/User/Staff  see dialog box displayed with user information
#userdetails
Scenario: Verify the heading of User Details window
Given Admin/User/Staff is on Manage user page-userdet
When Admin/User/Staff clicks Add new user button
Then  Admin/User/Staff should see User Details window with text as User Details
#cancel
Scenario: Verify the presence of Cancel button in User Details window
Given Admin/User/Staff is on Manage user page-cancel
When Admin/User/Staff clicks Add new user button-cancel
Then  Admin/User/Staff should see a button with text as Cancel  in User Details window

Scenario: Validate Fucntionality of Cancel button
Given Admin/User/Staff is on User Details window
When Admin/User/Staff clicks cancel button
Then  Admin/User/Staff  see User Details window getting  closed
#cancelx
Scenario: Verify the presence of Cancel(x) icon in user detais window
Given Admin/User/Staff is on Manage user page-cancelx
When Admin/User/Staff clicks Add new user button-cancelx
Then  Admin/User/Staff should see a cancelx icon
Scenario: Functionality of Cancel(x) icon
Given Admin/User/Staff is on User Details details window
When Admin/User/Staff clicks cancelX
Then  User Details window should be closed