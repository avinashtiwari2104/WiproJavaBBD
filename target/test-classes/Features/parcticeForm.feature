Feature: Registration Functionality

  @sanity
  Scenario Outline: Register with multiple data
    Given user is on the registration page
    When user enters "<name>" as name
    And user enters "<email>" as email
    And user selects gender
    And user enters "<MoNum>" as mobile number
    And user enters "<DOB>" as DOB
    And user enters "<subject>" as subject
    And user selects hobbies
    And user uploads picture "<pic>"
    And user enters "<address>" as address
    And user selects "<state>" as state
    And user selects "<city>" as city
    And user clicks on login button
    Then user should sees "<expectedResult>"

    Examples:
      | name           | email          | MoNum      | DOB       | subject   | pic                           	  | address   | state          | city | expectedResult |
      | Avinash Tiwari | avi@123.com    | 9027681589 | 21-04-2003| Selenium  | C:\Users\avina\Downloads\image.png | 123-SK-UP | Uttar Pradesh  | Agra | Success        |
