package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement searchedCars;

    @CacheLookup
    @FindBy(id = "models")
    WebElement usedModelDropDown;

    public String verifyTheSearchResults(){
        log.info("Verify the make" + searchedCars.toString());
        return getTextFromElement(searchedCars);
    }

    public void selectCarModel(String carModel){
        log.info("Select Car Model" + usedModelDropDown.toString());
        selectByVisibleTextFromDropDown(usedModelDropDown,carModel);
    }
}
