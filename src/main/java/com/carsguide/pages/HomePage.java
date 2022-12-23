package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyAndSell;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;

    @CacheLookup
    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement usedCars;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement findDealer;

    public void mouseHoverOnBuyAndSellTab() {
        log.info("Mouse hover on buy & sell" + buyAndSell.toString());
        mouseHoverToElement(buyAndSell);
    }

    public void clickOnSearchCarsLink() {
        log.info("Click on search cars link" + searchCars.toString());
        clickOnElement(searchCars);
    }

    public void clickOnUsedCarsLink() {
        log.info("Click on used cars link" + usedCars.toString());
        clickOnElement(usedCars);
    }

    public void clickOnFindADealer() {
        log.info("Click on Find A Dealer" + findDealer.toString());
        clickOnElement(findDealer);
    }
}
