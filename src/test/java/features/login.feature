Feature: login
  Scenario: User could log in with valid email and password
    Given user navigate to login page
    When user enter "mostafa112@gmail.com" and "most6789"
    And user click on login button
    Then user could login successfully to home page

