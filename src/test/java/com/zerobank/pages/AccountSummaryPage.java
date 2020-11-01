package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage extends BasePage{

    public AccountSummaryPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "(//a[.='Savings'])[1]")
    public WebElement savingsLinkFirst;

    @FindBy(xpath = "(//a[.='Savings'])[2]")
    public WebElement savingsLinkSecond;

    @FindBy(xpath = "//a[.='Brokerage']")
    public WebElement brokerageLink;

    @FindBy(xpath = "//a[.='Checking']")
    public WebElement checkingLink;

    @FindBy(xpath = "//a[.='Credit Card']")
    public WebElement creditCardLink;

    @FindBy(xpath = "//a[.='Loan']")
    public WebElement loanLink;

    @FindBy(css = ".offset2.span8 h2")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "(//*[@class='table'])[3]/thead/tr/th")
    public List<WebElement> creditCardColumns;
}
