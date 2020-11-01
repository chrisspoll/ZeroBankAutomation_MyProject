package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FindTransactionsStepDefs {

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        new LoginPage().login(username,password);
        new AccountSummaryPage().accountActivityTab.click();
        new AccountActivityPage().findTransactionsSubTab.click();
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String dateFrom, String dateTo) {
        BrowserUtils.waitFor(2);
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        findTransactionsPage.dateFromInput.clear();
        findTransactionsPage.dateFromInput.sendKeys(dateFrom);
        findTransactionsPage.dateToInput.clear();
        findTransactionsPage.dateToInput.sendKeys(dateTo);
    }

    @When("clicks search")
    public void clicks_search() {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForClickablility(findTransactionsPage.findBtn,5);
        findTransactionsPage.findBtn.click();
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String dateFrom, String dateTo) {
        boolean b = new FindTransactionsPage().isValidDate(dateFrom, dateTo);
        Assert.assertTrue("Verify valid dates are displayed",b);
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        Assert.assertTrue("Verify the results sorted by most recent date",new FindTransactionsPage().isSortedByRecent());
    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String str) {

        boolean b = true;
        for (String date : BrowserUtils.getElementsText(new FindTransactionsPage().dates)) {
            if (date.equalsIgnoreCase(str)){
                b = false;
                break;
            }
        }
        Assert.assertTrue("Results NOT contain " + str, b);
    }


    @When("the user enters description {string}")
    public void the_user_enters_description(String str) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForVisibility(findTransactionsPage.descriptionInput,5);
        findTransactionsPage.descriptionInput.clear();
        findTransactionsPage.descriptionInput.sendKeys(str);
    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String str) {
        BrowserUtils.waitFor(1);
        boolean result = true;

        for (String description : BrowserUtils.getElementsText(new FindTransactionsPage().descriptions)) {
            if (!description.contains(str)){
                result = false;
                break;
            }
        }

        Assert.assertTrue("Verify results table should ONLY show " + str,result);
    }

    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String str) {
        boolean result = false;

        for (String description : BrowserUtils.getElementsText(new FindTransactionsPage().descriptions)) {
            if (description.contains(str)){
                result = true;
                break;
            }
        }

        Assert.assertFalse("Verify results table should NOT show " + str,result);
    }


    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitFor(1);
        boolean bool = false;
        for (String deposit : BrowserUtils.getElementsText(findTransactionsPage.deposits)) {
            if (!deposit.isEmpty()){
                bool = true;
                break;
            }
        }
        Assert.assertTrue("Verify results table should show at least one result under Deposit",bool);
    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitFor(1);
        boolean bool = false;
        for (String deposit : BrowserUtils.getElementsText(findTransactionsPage.withdrawals)) {
            if (!deposit.isEmpty()){
                bool = true;
                break;
            }
        }
        Assert.assertTrue("Verify results table should show at least one result under Withdrawal",bool);
    }



    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        boolean bool = false;
        for (String deposit : BrowserUtils.getElementsText(findTransactionsPage.withdrawals)) {
            if (!deposit.isEmpty()){
                bool = true;
                break;
            }
        }
        Assert.assertFalse("Verify results table should show at least one result under Withdrawal",bool);
    }

    @When("user selects type {string}")
    public void user_selects_type(String str) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        Select type = new Select(findTransactionsPage.typeDropDown);
        type.selectByVisibleText(str);
    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        boolean bool = false;
        for (String deposit : BrowserUtils.getElementsText(findTransactionsPage.deposits)) {
            if (!deposit.isEmpty()){
                bool = true;
                break;
            }
        }
        Assert.assertFalse("Verify results table should show at least one result under Deposit",bool);
    }





/*
    @When("user selects type Deposit")
    public void user_selects_type_Deposit() {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        Select type = new Select(findTransactionsPage.typeDropDown);
        type.selectByValue("DEPOSIT");
    }

    @When("user selects type Withdrawal")
    public void user_selects_type_Withdrawal() {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        Select type = new Select(findTransactionsPage.typeDropDown);
        type.selectByValue("WITHDRAWAL");
    }
*/


}
