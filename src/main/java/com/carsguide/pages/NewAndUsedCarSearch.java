package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearch extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearch.class.getName());
    public NewAndUsedCarSearch() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement verifyPageNewAndUsedCarSearch;

    @CacheLookup
    @FindBy(id="makes")
    WebElement makesDropDown;

    @CacheLookup
    @FindBy(id = "models")
    WebElement modelDropDown;

    @CacheLookup
    @FindBy(id = "locations")
    WebElement locationsDropDown;

    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement priceDropDown;

    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCarButton;

    public String verifyNewAndUsedCarSearchPage(String text){
        log.info("New & used car search page" +verifyPageNewAndUsedCarSearch.getText());
        return getTextFromElement(verifyPageNewAndUsedCarSearch);
    }

    public void selectMake(String carMake){
        log.info("Select make" +makesDropDown.toString());
        selectByVisibleTextFromDropDown(makesDropDown,carMake);
    }

    public void selectCarModel(String carModel){
        log.info("Select Car Model" + modelDropDown.toString());
        selectByVisibleTextFromDropDown(modelDropDown,carModel);
    }

    public void selectLocation(String location){
        log.info("Select Location form dropdown" + locationsDropDown.toString());
        selectByVisibleTextFromDropDown(locationsDropDown,location);
    }

    public void selectPrice(String price){
        log.info("Select price from dropdown" +priceDropDown.toString());
        selectByVisibleTextFromDropDown(priceDropDown,price);
    }


    public void clickOnFindMyNextCarButton(){
        log.info("Click on find my next car button" + findMyNextCarButton.toString());
        clickOnElement(findMyNextCarButton);
    }
}
