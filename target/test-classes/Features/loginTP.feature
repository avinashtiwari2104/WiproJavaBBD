Feature: Tutorialspoint Practice Login

  @SmokeTest
  Scenario: Successful login with valid credentials
    Given the user navigates to the tp login page
    When the user enters tp login username "validUser"
    And the user enters tp login password "validPassword"
    And the user clicks on the tp login button
    Then the user should be redirected to the tp login homepage
    And a welcome message should be displayed on tp login
