Feature: Account Summary
  @regression
  Scenario: Verify account summary page titles, account types and columns
    Given the user is on the login page
    When the user logs in using "username" and "password"
    Then the page should have the title "Zero - Account Summary"
    And Account summary page should have to following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    And Credit Accounts table must have columns
      | Account     |
      | Credit Card |
      | Balance     |
