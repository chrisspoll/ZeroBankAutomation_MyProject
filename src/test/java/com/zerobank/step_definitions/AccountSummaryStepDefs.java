package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;

public class AccountSummaryStepDefs {


    @Then("the page should have the title {string}")
    public void the_page_should_have_the_title(String expectedTitle) {
       String actualTitle = Driver.get().getTitle();
       Assert.assertEquals("Verify the page title",expectedTitle,actualTitle);
    }

    @Then("Account summary page should have to following account types")
    public void account_summary_page_should_have_to_following_account_types(List<String> expectedAccountTypes) {
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        List<String> actualAccountTypes = BrowserUtils.getElementsText(accountSummaryPage.accountTypes);
        Assert.assertEquals("Verify Account Types are matching",expectedAccountTypes,actualAccountTypes);
    }

    @Then("Credit Accounts table must have columns")
    public void credit_Accounts_table_must_have_columns(List<String> expectedColumns) {
        List<String> actualColumns = BrowserUtils.getElementsText(new AccountSummaryPage().creditCardColumns);
        Assert.assertEquals("Verify Credit Card columns are matching",expectedColumns,actualColumns);
    }

}
