package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindTransactionsPage extends BasePage{

    public FindTransactionsPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "aa_fromDate")
    public WebElement dateFromInput;

    @FindBy(id = "aa_toDate")
    public WebElement dateToInput;

    @FindBy(id = "aa_description")
    public WebElement descriptionInput;

    @FindBy(xpath = "//*[.='Find']")
    public WebElement findBtn;

    @FindBy(xpath = "(//tbody)[2]/tr")
    public List<WebElement> transactionTableRows;
    
    public int rowNumbersWithoutHeaders(List<WebElement> transactionTableRows){
        
        return transactionTableRows.size();
    }


    @FindBy(xpath = "(//tbody)[2]/tr/td[1]")
    public List<WebElement> dates;

    public boolean isValidDate(String dateFrom, String dateTo){

        BrowserUtils.waitFor(1);

        String[] dateFromArray = dateFrom.split("-");
        int yearFrom = Integer.parseInt(dateFromArray[0]);
        int monthFrom = Integer.parseInt(dateFromArray[1]);
        int dayFrom = Integer.parseInt(dateFromArray[2]);

        String[] dateToArray = dateTo.split("-");
        int yearTo = Integer.parseInt(dateToArray[0]);
        int monthTo = Integer.parseInt(dateToArray[1]);
        int dayTo = Integer.parseInt(dateToArray[2]);

        String[] dateBottomArray = dates.get(dates.size()-1).getText().split("-");
        int yearBottom = Integer.parseInt(dateBottomArray[0]);
        int monthBottom = Integer.parseInt(dateBottomArray[1]);
        int dayBottom = Integer.parseInt(dateBottomArray[2]);

        String[] dateTopArray = dates.get(0).getText().split("-");
        int yearTop = Integer.parseInt(dateTopArray[0]);
        int monthTop = Integer.parseInt(dateTopArray[1]);
        int dayTop = Integer.parseInt(dateTopArray[2]);


        boolean b1=true;
        boolean b2=true;

        if (yearBottom>yearFrom) {
            b1 = true;
        }else if (yearBottom==yearFrom) {
            if (monthBottom>monthFrom) {
                b1 = true;
            }else if (monthBottom==monthFrom) {
                if (dayBottom>=dayFrom) {
                    b1 = true;
                }else if (dayBottom<dayFrom) {
                    b1 = false;
                }
            }else if (monthBottom<monthFrom) {
                b1 = false;
            }
        }else if (yearBottom<yearFrom) {
            b1 = false;
        }

        if (yearTo>yearTop) {
            b2 = true;
        }else if (yearTo==yearTop) {
            if (monthTo>monthTop) {
                b2 = true;
            }else if (monthTo==monthTop) {
                if (dayTo>=dayTop) {
                    b2 = true;
                }else if (dayTo<dayTop) {
                    b2 = false;
                }
            }else if (monthTo<monthTop) {
                b2 = false;
            }
        }else if (yearTo<yearTop) {
            b2 = false;
        }

        return b1 && b2;

    }


    public boolean isSortedByRecent(){

        String[] dateBottomArray = dates.get(dates.size()-1).getText().split("-");
        int yearBottom = Integer.parseInt(dateBottomArray[0]);
        int monthBottom = Integer.parseInt(dateBottomArray[1]);
        int dayBottom = Integer.parseInt(dateBottomArray[2]);

        String[] dateTopArray = dates.get(0).getText().split("-");
        int yearTop = Integer.parseInt(dateTopArray[0]);
        int monthTop = Integer.parseInt(dateTopArray[1]);
        int dayTop = Integer.parseInt(dateTopArray[2]);

        if (yearTop>yearBottom){
            return true;
        }else if(yearTop==yearBottom){
            if (monthTop>monthBottom){
                return true;
            }else if (monthTop==monthBottom){
                if (dayTop>=dayBottom){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }

    }

    @FindBy(xpath = "(//tbody)[2]/tr/td[2]")
    public List<WebElement> descriptions;

    @FindBy(xpath = "(//tbody)[2]/tr/td[3]")
    public List<WebElement> deposits;

    @FindBy(xpath = "(//tbody)[2]/tr/td[4]")
    public List<WebElement> withdrawals;

    @FindBy(id = "aa_type")
    public WebElement typeDropDown;













}
