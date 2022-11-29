Feature: Paginator Validation         
 Background:  Admin/User/Staff is on Manage Batch page
 
 Given  Admin/User/Staff Logged on to LMS Website 
When Admin/User/Stafff Clicks on Enabled paginator-next to Button on Batch 
Then Admin/user/Staff  see the text as as showing 1 to 5 of 21 batche.

Scenario: validating the Manage batch Paginator
When    Admin/User/Staff clicks on enabled paginator prev button on Batch


Scenario: Verify paginator prevoius button on the Program page
When   Admin/User/Staff -clicks on Enabled Pagepaginator  button
Then   Admin/User/Staff  see the text as Show Sshowing 1 to 5 of 21 batches.

Scenario: Verify paginator -last button on the program page
When   Admin/User/Staff Clicks on the enabled -paginator-last button
Then   Admin/User/Staff see Page number Navigated to Five

Scenario:Verify paginator -first button on the Program page
When   Admin/user/Staff Clicks on -Enabled paginator -first Batch button
Then   Admin/user/Staff see page number navigated too One






