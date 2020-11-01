Feature: Account Activity


  Scenario: Verify account activity page title and drop down options
    Given the user is logged in
    When the user navigates Account Activity
    Then the page should have the title "Zero - Account Activity"
    And In the Account drop down option should be "Savings"
    Then Account drop down should have the following options:
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    And Transactions table must have columns
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |