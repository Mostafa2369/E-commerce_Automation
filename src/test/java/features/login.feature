Feature: user should be able to login
  Scenario: user login with valid username and password
    Given user navigate to login page
    When user enter "username" and "password"
    And user click on login button
    Then user could login successfully to home page
