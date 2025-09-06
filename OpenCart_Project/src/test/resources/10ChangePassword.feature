Feature: Change Password Functionality

  Scenario: Verify that user is able to change password with valid details
    Given user is on TutorialNinja homepage
    When user navigates to Login page
    And user logs in with username "manasaaduvala123@gmail.com" and password "newpass123"
    And user navigates to Change Password page
    And user enters new password "newpass" and confirm password "newpass"
    And user clicks on Continue button
    Then user should see a success message "Success: Your password has been successfully updated."
