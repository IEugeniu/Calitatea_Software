Feature: Sign In
  Scenario Outline: User can Sign In on page
    Given User access home page
    And User clicks on 'Sign In' button
    When User fills '<name>' in 'Name' box
    And User fills '<email>' in 'Email' box
    And User clicks on SignIn button
    Then User is logged in successfully

    Examples:
      | name    | email                  |
      | Eugeniu | ignat.eugeniu@mail.com |