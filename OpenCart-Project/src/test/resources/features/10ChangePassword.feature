Feature: Change Password Functionality
Scenario Outline: Verify that user is able to change password with valid details
Given user is on TutorialNinja homepage
When user navigates to Login page
And user logs in with username "<username>" and password "<oldPassword>"
And user navigates to Change Password page
And user enters new password "<newPassword>" and confirm password "<confirmPassword>"
And user clicks on Continue button
Then user should see a success message "Success: Your password has been successfully updated."
Examples:
    | username                  | oldPassword | newPassword | confirmPassword |
    | manasaaduvala123@gmail.com | newpass123  | newpass     | newpass         |
    | ravi.kumar@example.com     | test123     | test456     | test456         |



