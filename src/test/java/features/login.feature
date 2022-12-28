Feature: login
  Scenario: User could log in with valid email and password
    Given user navigate to login page
    When user enter "username" and "password"
    And user click on login button
    Then user could login successfully to home page
