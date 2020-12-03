Feature: Send Contact Form
  Scenario Outline: User can send Contact Form
    Given User access home page
    And User clicks on 'Contact' button
    When User fills '<name>' in Name-box
    And User fills '<email>' in Email-box
    And User fills '<subject>' in 'Subject' box
    And User fills '<message>' in 'Message' box
    And User clicks on Send button
    Then Message is sent successfully

    Examples:
      | name          | email                | subject | message |
      | Ignat Eugeniu | ignat.eugen@mail.com | Bug     | SignIn  |