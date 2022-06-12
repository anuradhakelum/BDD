Feature: Login Page
  Scenario: Login to website with correct details
    Given User is in login page
    When User enter correct username
    And password
    Then User can login to the system
