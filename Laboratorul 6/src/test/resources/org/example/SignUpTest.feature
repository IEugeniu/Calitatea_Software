Feature: Register user
  Scenario Outline: User can Sing Up on page
    Given User access home page
    And User clicks on 'Sign Up' button
    When User fills '<name>' in Name box
    And User fills '<email>' in Email box
    And User fills '<password>' in 'password' box
    And User fills '<confirmPassword>' in 'Confirm Password' box
    And User clicks on SignUp button
    Then User is registered successfully

    Examples:
      | name    | email                  | password   | confirmPassword |
      | Eugeniu | ignat.eugeniu@mail.com | eugeniu123 | eugeniu123      |