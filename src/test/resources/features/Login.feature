@login @smoke @regression
Feature: User should be able to login
@wip
  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user logs in using "username" and "password"
    Then the user should be able to login

  Scenario: Login with invalid username
    Given the user is on the login page
    When the user logs in using "wrongUsername" and "password"
    Then the user should NOT be able to login

  Scenario: Login with invalid password
    Given the user is on the login page
    When the user logs in using "username" and "wrongPassword"
    Then the user should NOT be able to login

  Scenario: Login with invalid username and password
    Given the user is on the login page
    When the user logs in using "wrongUsername" and "wrongPassword"
    Then the user should NOT be able to login

  Scenario: Login with blank username
    Given the user is on the login page
    When the user logs in using "" and "password"
    Then the user should NOT be able to login

  Scenario: Login with blank password
    Given the user is on the login page
    When the user logs in using "username" and ""
    Then the user should NOT be able to login

  Scenario: Login with blank usernmae and password
    Given the user is on the login page
    When the user logs in using "" and ""
    Then the user should NOT be able to login