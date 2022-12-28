Feature: register
  Scenario: User could register with valid data
    Given user navigate to login page
    When user enter "username" and "password"
    And user click on login button
    Then user could login successfully to home page