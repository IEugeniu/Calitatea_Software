Feature: Add items to cart
  Scenario: Verify if user can add items to cart
    Given User access home page
    When User click on [ADD TO CART] button
    Then Selected item is added to the shopping cart