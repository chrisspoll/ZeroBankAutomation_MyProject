package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class PayBillsStepDefs {

    @When("the user navigates Pay Bills")
    public void the_user_navigates_Pay_Bills() {
        new PayBillsPage().payBillsTab.click();
    }

    @When("user completes a successful Pay operation")
    public void user_completes_a_successful_Pay_operation() {
        PayBillsPage payBillsPage = new PayBillsPage();
        Select payeeDropDown = new Select(payBillsPage.payeeDropDown);
        payeeDropDown.selectByIndex(new Random().nextInt(3)+1);
        Select accountDropDown = new Select(payBillsPage.accountDropDown);
        accountDropDown.selectByIndex(new Random().nextInt(5)+1);

        Integer amountNumber = new Random().nextInt(10000);
        payBillsPage.amountInput.sendKeys(amountNumber.toString());

        payBillsPage.dateInput.sendKeys("11-11-2020");
        payBillsPage.descriptionInput.sendKeys("Payment");
        payBillsPage.payBtn.click();


        BrowserUtils.waitFor(5);
    }


    @Then("{string} should be displayed for amount")
    public void should_be_displayed_for_amount(String expectedMessage) {
        String actualMessage = new PayBillsPage().amountInput.getAttribute("validationMessage");
        Assert.assertEquals("Verify Please fill out this field message! ",expectedMessage,actualMessage);
    }

    @Then("{string} should be displayed for date")
    public void should_be_displayed_for_date(String expectedMessage) {
        String actualMessage = new PayBillsPage().dateInput.getAttribute("validationMessage");
        Assert.assertEquals("Verify Please fill out this field message! ",expectedMessage,actualMessage);
    }

    @Then("The payment was successfully submitted. should be displayed")
    public void the_payment_was_successfully_submitted_should_be_displayed() {
        PayBillsPage payBillsPage = new PayBillsPage();
        String actualMessage = payBillsPage.paySuccessMessage.getText();
        String expectedMessage = "The payment was successfully submitted.";
        Assert.assertEquals("Verify payment success message is matching",expectedMessage,actualMessage);
    }

    @When("user enters the amount {string} and date {string} and description {string}")
    public void user_enters_the_amount_and_date_and_description(String amountStr, String dateStr, String descStr) {
        PayBillsPage payBillsPage = new PayBillsPage();
        payBillsPage.amountInput.sendKeys(amountStr);
        payBillsPage.dateInput.sendKeys(dateStr);
        payBillsPage.descriptionInput.sendKeys(descStr);
    }

    @When("user clicks on Pay button")
    public void user_clicks_on_Pay_button() {
        new PayBillsPage().payBtn.click();
    }

    @Then("The payment was successfully submitted. should NOT be displayed")
    public void the_payment_was_successfully_submitted_should_NOT_be_displayed() {
        PayBillsPage payBillsPage = new PayBillsPage();
        Assert.assertFalse("Verify payment success message is NOT displayed",payBillsPage.paySuccessMessage.isDisplayed());
    }
}
