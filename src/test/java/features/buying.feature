Feature: buying
  Scenario: Logged user could add different products to Shopping cart
    Given user navigate to login page
    When user enter "username" and "password"
    And user click on login button
    Then user could login successfully to home page

  Scenario: Logged user could add different products to Wishlist
    Given user navigate to login page
    When user enter "username" and "password"
    And user click on login button
    Then user could login successfully to home page

  Scenario: Logged user could add different products to compare list
    Given user navigate to login page
    When user enter "username" and "password"
    And user click on login button
    Then user could login successfully to home page

  Scenario: Create successful Order
    Given user navigate to login page
    When user enter "username" and "password"
    And user click on login button
    Then user could login successfully to home page