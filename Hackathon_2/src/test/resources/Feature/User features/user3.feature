@TC004
Feature: Delete Icon

Scenario: Verify the presence of Delete icon in manage user page
Given Admin/User/Staff is on any page after Login-Deleteicon
When Admin/User/Staffis on the Manage user page after clicking User Tab
Then Admin/User/Staff should see the delete icon at the top left corner of the user table
#
Scenario: Behaviour of Delete icon when no rows unchecked
Given Admin/User/Staff table is displayed in manage user page-deleteicon
When No rows is checked
Then Delete icon at the top left corner of the user table disabled

Scenario: Behaviour of Delete icon when rows checked
Given Admin/User/Staff table is displayed in manage user page-del
When Admin/User/Staff checks the rows in user table-del
Then Delete icon at the top left corner of the user table enabled

Scenario: Behaviour of Delete icon when rows checked
Given Admin/User/Staff checks the rows in user table-checksrow
When Admin/User/Staff clicks the delete icon at the top left corner of user table
Then Confirm dialog box should be displayed with Text Are you sure you want to delete the selected Admin/User/Staffs

Scenario: Validating Confirm dialog box by selecting No
Given Admin/User/Staff is in confirm dialog box after clicking delete icon
When Admin/User/Staff clicks button with text No
Then Selected rows should not be deleted and dialog box should be closed

Scenario: Validating Confirm dialog box by selecting Yes
#Given Admin/User/Staff is in confirm dialog box after clicking delete icon-dialobox
When Admin/User/Staff clicks button with text Yes
Then Selected rows should be deleted and popup should be shown with success message User deleted

Scenario: Validating Confirm dialog box by clicking close(x) icon
Given Admin/User/Staff is in confirm dialog box after clicking delete icon-x
When Admin/User/Staff clicks the close(x) icon
Then Confirm dialog box should be closed
#editdelete
Scenario: Validate the presence of Edit/Delete icon
Given Admin/User/Staff is on any page after Login-editdelete
When Admin/User/Staff is on the Manage user page after clicking User Tab-editdelete
Then Admin/User/Staff should see the buttons with edit/delete icon in each row of Edit/Delete coulmn

Scenario: Validate Functionality of delete button
Given Admin/User/Staff table is displayed in manage user page-delfun
When Admin/User/Staff clicks delete button
Then Confirm dialog box should be displayed with Text Are you sure you want to delete selected user name
 
 Scenario: Updating with Edit button
Given Admin/User/Staff table is displayed in manage user page-edit
When Admin/User/Staff clicks Edit button
Then User Details dialog box should be displayed for editing
 


