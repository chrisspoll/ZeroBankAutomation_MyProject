$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccounSummary.feature");
formatter.feature({
  "name": "Account Summary",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify account summary page titles, account types and columns",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in using \"username\" and \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefs.the_user_logs_in_using_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page should have the title \"Zero - Account Summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.the_page_should_have_the_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account summary page should have to following account types",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.account_summary_page_should_have_to_following_account_types(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Credit Accounts table must have columns",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.credit_Accounts_table_must_have_columns(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify account activity page title and drop down options",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates Account Activity",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_navigates_Account_Activity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page should have the title \"Zero - Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.the_page_should_have_the_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In the Account drop down option should be \"Savings\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.in_the_Account_drop_down_option_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have the following options:",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.account_drop_down_should_have_the_following_options(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Transactions table must have columns",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.transactions_table_must_have_columns(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/AccountActivityNavigation.feature");
formatter.feature({
  "name": "Navigating to specific accounts in Accounts Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Savings account redirect",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Savings link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_clicks_on_Savings_link_on_the_Account_Summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_page_should_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Savings\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Brokerage account redirect",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Brokerage link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_page_should_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Brokerage\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Checking account redirect",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Checking link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_clicks_on_Checking_link_on_the_Account_Summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_page_should_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Checking\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Credit Card account redirect",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Credit card link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_page_should_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Credit Card\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
