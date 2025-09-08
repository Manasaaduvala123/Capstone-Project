Feature: Contact Us Form
Scenario Outline: Submit a query through the contact form
Given User is on the Contact Us page
When User enters name "<name>"
And User enters email "<email>"
And User enters enquiry "<enquiry>"
And User clicks on Submit button
Then User should be redirected to the success page
Examples:
    | name   | email                         | enquiry                                      |
    | Manasa | manasaaduvala123@gmail.com    | I would like to know about my order dispatchment. |
    | Ravi   | ravi.kumar@example.com        | Can you provide details about bulk order discounts? |
    | Sneha  | sneha.sharma@example.com      | I want to change my shipping address.        |


