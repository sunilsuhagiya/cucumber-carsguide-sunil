package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarSearch extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarSearch.class.getName());
    public UsedCarSearch() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement verifyUsedCarSearch;

    public String verifyUsedCarSearchPage(String usedCar){
        log.info("Used car search page" +verifyUsedCarSearch.getText());
        return getTextFromElement(verifyUsedCarSearch);
    }

}
