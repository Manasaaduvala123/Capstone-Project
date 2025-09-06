Feature: Contact Us Form
Scenario: Submit a query through the contact form
Given User is on the Contact Us page
When User enters name "Manasa"
And User enters email "manasaaduvala123@gmail.com"
And User enters enquiry "I would like to know about my order dispatchment."
And User clicks on Submit button
Then User should be redirected to the success page
