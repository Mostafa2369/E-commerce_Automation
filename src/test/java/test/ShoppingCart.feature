Feature: tag

  Scenario: Logged user could select different tags
    Given user  logged in  successfuly
    When user select cell phones sub category
    And user add phone to cart
    And user select  books category
    And user add 2 books to cart
    And user select  Jewelry category
    And user add 2 Jewelry to cart
    Then list  of products add to shopping cart




