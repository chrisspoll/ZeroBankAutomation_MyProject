package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountActivityPage extends BasePage{

    public AccountActivityPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "aa_accountId")
    public WebElement accountDropDown;

    @FindBy(linkText = "Show Transactions")
    public WebElement showTransactionsSubTab;

    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactionsSubTab;

    @FindBy(xpath = "//*[@id='all_transactions_for_account']//th")
    public List<WebElement> transactionsTableColumns;


















}
