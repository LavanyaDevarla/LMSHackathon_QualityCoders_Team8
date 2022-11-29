@TC007
Feature: PhoneNumber
Scenario: Validating the Phone number
Given Admin/User/Staff is  Manage user page
When Admin/User/Staff Enters more than "ten digits"
Then Admin/User/Staff see error message Invalid Input
#postal
Scenario: Validating Postal Code
Given admin/User/Staff is on Manage user page-postal
When Admin/User/Staff Enters moreThan "five digits"-postal
Then Admin/User/Staff see error message Invalid Input-Postal
#State
Scenario: Validating State dropdown
Given Admin/User/Staff is on ManagE user page
When Admin/User/Staff clicks on state dropdowN
Then Admin/User/Staff see list of states in Alphabetical Order
#ug
Scenario: Validating UG Program Dropdown 
Given Validating UG Program Dropdown 
When Admin/User/Staff clicks on UG Program dropdown
Then Admin/User/Staff see list of UG Program 
#addline
Scenario: Validating Address line  in User Details window 
Given Admin/User/Staff  on User Detailswindow
When Admin/User/Staff CLicks the button  Add C/O, Apt, Suite, Unit
Then Admin/User/Staff should see the input field with Label New Address2