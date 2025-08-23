Feature: Login Functionality

#  @regression
#  Scenario Outline: Verify login with multiple credentials
#    Given User is on the login page
#    When user enters "<username>" and "<password>"
#    And user clicks on the login button
#    Then user should see "<expectedResult>"

#    Examples:
#      | username | password | expectedResult            |
#      | Admin    | admin123 | Home Page                 |
#      | wrong    | wrong123 | Invalid username or password |

@regression
Scenario: Login with multiple users
	Given User is on the login page
	When User enters credentials
      | username | password  |
      | Admin    | admin123  |  
	And User clicks on the login button
	Then User is navigated to home page
	
	