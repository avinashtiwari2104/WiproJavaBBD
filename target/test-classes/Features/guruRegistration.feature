Feature: Mercury Tours Registration

@regression
  Scenario: Successful registration
    Given user navigates to registration page
    When user enters registration details
      | firstName    | lastName | phone       | email           | address       | city       | state       | postalCode | country   | userName   | password | confirmPassword |
      | Avinash      | Tiwari   | 1234567890  | avi@example.com | 123 SK IND    | Anytown    | AnyState    | 12345      | INDIA     | avi5468    | pass123  | pass123         |
    And user submits the form
    Then registration should be successful
