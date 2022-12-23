package com.carsguide.pages;

import com.aventstack.extentreports.Status;
import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealersPage.class.getName());

    public CarDealersPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id = "keyword")
    WebElement searchBox;

    @CacheLookup
    @FindBy(id = "dealer-search-submit")
    WebElement submitSearch;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']")
    WebElement dealerNameList;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Find a Car Dealership Near You')]")
    WebElement dealerPage;

    public void findDealerAndClickSubmit(String dealerName) {
        log.info("Find dealer and click submit button" + searchBox.toString());
        sendTextToElement(searchBox, dealerName);
        clickOnElement(submitSearch);
        By dealer = By.xpath("//a[Contains(text),'" + dealerName + "')]");
        clickOnElement(dealer);
    }

    public String verifyDealerName(String dealerName) {
        log.info("Verify dealer name");
        By dealerPage = By.xpath("//a[Contains(text),'" + dealerName + "')]");
        return getTextFromElement(dealerPage);
    }

    public String verifyDealersPage(String page) {
        log.info("Verify Dealers Page Navigation" + dealerPage.getText());
        return getTextFromElement(dealerPage);
    }
}
