package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.ShowTransactionsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import javax.sql.rowset.BaseRowSet;
import java.util.List;

public class AccountActivityStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        new LoginPage().login(username,password);
    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().savingsLinkFirst.click();
    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String tabName) {
        BrowserUtils.waitFor(1);
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue("verify title contains " + tabName, actualTitle.contains(tabName));
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String option) {
        Select accountDropDown = new Select(new ShowTransactionsPage().accountDropDown);
        String actualOption = accountDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals("verify selected account option is " + option,option,actualOption);
    }

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
       new  AccountSummaryPage().brokerageLink.click();
    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().checkingLink.click();
    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().creditCardLink.click();
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().loanLink.click();
    }

    @When("the user navigates Account Activity")
    public void the_user_navigates_Account_Activity() {
        new AccountActivityPage().accountActivityTab.click();
    }

    @Then("In the Account drop down option should be {string}")
    public void in_the_Account_drop_down_option_should_be(String expectedOption) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Select accountDropDown = new Select(accountActivityPage.accountDropDown);
        String actualOption = accountDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals("Verify selected dropdown is " + expectedOption,expectedOption,actualOption);
    }

    @Then("Account drop down should have the following options:")
    public void account_drop_down_should_have_the_following_options(List<String> expectedOptions) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Select accountDropDown = new Select(accountActivityPage.accountDropDown);
        List<String> actualOptions = BrowserUtils.getElementsText(accountDropDown.getOptions());
        Assert.assertEquals("Verify dropdown options are matching",expectedOptions,actualOptions);
    }

    @Then("Transactions table must have columns")
    public void transactions_table_must_have_columns(List<String> expectedColumns) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        List<String> actualColumns = BrowserUtils.getElementsText(accountActivityPage.transactionsTableColumns);
        Assert.assertEquals("Verify columns are matching",expectedColumns,actualColumns);
    }



}
