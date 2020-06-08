package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){

        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(id = "user_login")
    public WebElement usernameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(css = ".btn.btn-primary")
    public WebElement signInBtn;

    @FindBy(id = "user_remember_me")
    public WebElement rememberMeBox;

    @FindBy(partialLinkText = "Forgot")
    public WebElement forgotPasswordBtn;

    @FindBy(css = ".alert.alert-error")
    public WebElement errorMessageForCredentials;

    public void login(String usernameStr, String passwordStr){
        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        signInBtn.click();
    }
}
