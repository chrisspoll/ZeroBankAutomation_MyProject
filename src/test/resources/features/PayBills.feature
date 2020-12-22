
Feature: Pay Bills

  Background:
    Given the user is logged in
    When the user navigates Pay Bills
    Then the page should have the title "Zero - Pay Bills"
  @regression
  Scenario: user completes a successful Pay operation
    When user completes a successful Pay operation
    Then The payment was successfully submitted. should be displayed
  @regression
  Scenario: user tries to make a payment without entering the amount
    When user enters the amount "" and date "2020-11-11" and description "payment"
    And user clicks on Pay button
    Then "Please fill out this field message!" should be displayed for amount

  Scenario: user tries to make a payment without entering the date
    When user enters the amount "5000" and date "" and description "payment"
    And user clicks on Pay button
    Then "Please fill out this field message!" should be displayed for date

  Scenario: user tries to send alphabetical characters to amount field
    When user enters the amount "alpha" and date "2020-11-11" and description "payment"
    And user clicks on Pay button
    Then The payment was successfully submitted. should NOT be displayed

  Scenario: user tries to send special characters to amount field
    When user enters the amount "@amount" and date "2020-11-11" and description "payment"
    And user clicks on Pay button
    Then The payment was successfully submitted. should NOT be displayed

  Scenario: user tries to send alphabetical characters to date field
    When user enters the amount "5000" and date "date" and description "payment"
    And user clicks on Pay button
    Then "Please fill out this field message!" should be displayed for date
