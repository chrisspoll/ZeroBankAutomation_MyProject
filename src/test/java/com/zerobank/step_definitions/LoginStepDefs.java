package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        new LoginPage().login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue("verify title contains Account Summary", actualTitle.contains("Account Summary"));
    }

    @When("the user enters invalid username and valid password")
    public void the_user_enters_invalid_username_and_valid_password() {
        String username = RandomStringUtils.randomAlphabetic(1, 10);
        String password = ConfigurationReader.get("password");
        new LoginPage().login(username,password);
    }

    @When("the user enters valid username and invalid password")
    public void the_user_enters_valid_username_and_invalid_password() {
        String username = ConfigurationReader.get("username");
        String password = RandomStringUtils.randomAlphabetic(1, 10);
        new LoginPage().login(username,password);
    }

    @Then("the user should NOT be able to login")
    public void the_user_should_NOT_be_able_to_login() {
        Assert.assertTrue("error message is displayed",new LoginPage().errorMessageForCredentials.isDisplayed());
    }

    @When("the user enters blank username and valid password")
    public void the_user_enters_blank_username_and_valid_password() {
        String username = "";
        String password = ConfigurationReader.get("password");
        new LoginPage().login(username,password);
    }

    @When("the user enters valid username and blank password")
    public void the_user_enters_valid_username_and_blank_password() {
        String username = ConfigurationReader.get("username");
        String password = "";
        new LoginPage().login(username,password);
    }


    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        new LoginPage().login(username, password);
    }

}
