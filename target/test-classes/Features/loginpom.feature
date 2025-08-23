Feature: Login Functionality

  @regression
  Scenario Outline: Verify login with multiple credentials
    Given User is on the login page
    When user enters "Admin" and "admin123"
    And user clicks on the login button
    Then user is navigated to home page