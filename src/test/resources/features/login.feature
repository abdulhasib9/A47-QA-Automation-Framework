Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given User navigates to the login page
    When User enters valid username and password
    And User clicks on the login button
    Then User should be logged in successfully
