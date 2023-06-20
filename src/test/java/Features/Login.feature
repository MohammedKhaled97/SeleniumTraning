Feature: User Login
  I want to Check That User is able to login Successfully
  Scenario Outline: User Happy Login
    Given the User is at Login Page
    When User Enter "<UserName>" , "<Password>"
    And Click on Login Button
    Then user Logged in Successfully

    Examples:
      |UserName  |Password|
      |Admin     |admin123|