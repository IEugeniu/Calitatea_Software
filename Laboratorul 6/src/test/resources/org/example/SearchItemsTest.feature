Feature: Search items
  Scenario Outline: User can search items
    Given User access home page
    When User fills '<productName>' in 'search' box
    And User clicks on search icon
    Then Items with '<productName>' name are displayed

    Examples:
      | productName |
      | shoes       |