
Feature: User should be able to login

  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be able to login

  Scenario: Login with invalid username
    Given the user is on the login page
    When the user enters invalid username and valid password
    Then the user should NOT be able to login

  Scenario: Login with invalid password
    Given the user is on the login page
    When the user enters valid username and invalid password
    Then the user should NOT be able to login

  Scenario: Login with blank username
    Given the user is on the login page
    When the user enters blank username and valid password
    Then the user should NOT be able to login

  Scenario: Login with blank password
    Given the user is on the login page
    When the user enters valid username and blank password
    Then the user should NOT be able to login