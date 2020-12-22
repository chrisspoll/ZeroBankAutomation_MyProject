Feature: Find Transactions in Account Activity

  Scenario: Search date range
    Given the user accesses the Find Transactions tab
    When the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks search
    Then results table should only show transactions dates between "2012-09-01" to "2012-09-06"
    And the results should be sorted by most recent date
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And clicks search
    Then results table should only show transactions dates between "2012-09-02" to "2012-09-06"
    And the results table should only not contain transactions dated "2012-09-01"
  @regression
  Scenario: Search description
    Given the user accesses the Find Transactions tab
    When the user enters description "ONLINE"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"
    When the user enters description "OFFICE"
    And clicks search
    Then results table should only show descriptions containing "OFFICE"
    But results table should not show descriptions containing "ONLINE"

  @regression
  Scenario Outline: Search description
    Given the user accesses the Find Transactions tab
    When the user enters description "<word1>"
    And clicks search
    Then results table should only show descriptions containing "<word1>"
    When the user enters description "<word2>"
    And clicks search
    Then results table should only show descriptions containing "<word2>"
    But results table should not show descriptions containing "<word1>"
    Examples:
      | word1    | word2  |
      | ONLINE   | OFFICE |
      | TRANSFER | SUPPLY |


  Scenario Outline: Search description case insensitive
    Given the user accesses the Find Transactions tab
    When the user enters description "<word1>"
    And clicks search
    Then results table should only show descriptions containing "<word1>"
    When the user enters description "<word2>"
    And clicks search
    Then results table should only show descriptions containing "<word1>"
    Examples:
      | word1    | word2    |
      | ONLINE   | online   |
      | OFFICE   | office   |
      | TRANSFER | transfer |
      | SUPPLY   | supply   |


  Scenario: Type
    Given the user accesses the Find Transactions tab
    And clicks search
    Then results table should show at least one result under Deposit
    Then results table should show at least one result under Withdrawal
    When user selects type "Deposit"
    And clicks search
    Then results table should show at least one result under Deposit
    But results table should show no result under Withdrawal
    When user selects type "Withdrawal"
    And clicks search
    Then results table should show at least one result under Withdrawal
    But results table should show no result under Deposit
