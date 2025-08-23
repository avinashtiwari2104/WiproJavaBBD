Feature: Registration Functionality

  @SmokeTest
  Scenario: Successful registration with valid details
    Given user is on the tp registration page
    When the user enters firstname "John"
    And the user enters lastname "Doe"
    And the user enters tp username "johndoe"
    And the user enters tp password "secret123"
    And the user clicks on register button
    Then the user should remain on registration page
    And registration confirmation should be displayed
