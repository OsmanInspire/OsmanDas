@wip
Feature: Navigation Categories

  Scenario: Laptops Page Cart page and Purchase Page actions
    Given the user is on the login page
    When the user click "Laptops"
    And the user navigate to Laptops Page
    And the user click on "Sony vaio i5" and click add to cart
    And  the user add item to cart
    And  the user hit return on the keyboard
    And the user click "Laptops"
    And the user click on "Dell i7 8gb" and click add to cart
    And  the user add item to cart
    And  the user hit return on the keyboard
    And  the user navigate to Cart Page
    Then  the user click on "Cart"
   Then the user click on Delete
    When the user click on the Place Order Button
    Then the user fill in all the information "osman" "Spain" "Alicante" "12345"
    And Click Purchase Button
