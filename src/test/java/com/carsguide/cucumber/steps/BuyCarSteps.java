package com.carsguide.cucumber.steps;

import com.carsguide.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuyCarSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().mouseHoverOnBuyAndSellTab();
    }

    @And("^I click Search Cars link$")
    public void iClickSearchCarsLink() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().clickOnSearchCarsLink();
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String expected) {
        new NewAndUsedCarSearch().verifyNewAndUsedCarSearchPage(expected);
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String carMake) {
        new NewAndUsedCarSearch().selectMake(carMake);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String carModel) {
        new NewAndUsedCarSearch().selectCarModel(carModel);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCarSearch().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearch().selectPrice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearch().clickOnFindMyNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
        Assert.assertTrue("Text found", new ResultPage().verifyTheSearchResults().contains(make));
    }

    // ***************************** Second Scenario ****************************
    @And("^I click Used link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCarsLink();
    }

    @Then("^I navigate to Page \"([^\"]*)\"$")
    public void iNavigateToPageUsedCars(String usedCars) {
        new UsedCarSearch().verifyUsedCarSearchPage(usedCars);
    }

    @And("^I click Find a Dealer$")
    public void iClickFindADealer() {
        new HomePage().clickOnFindADealer();
    }

    @Then("^I navigate to \"([^\"]*)\" dealer page$")
    public void iNavigateToDealerPage(String dealer) {
        new CarDealersPage().verifyDealersPage(dealer);
    }


    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealerName) throws InterruptedException {
        new CarDealersPage().findDealerAndClickSubmit(dealerName);
        Thread.sleep(5000);
        Assert.assertTrue("Can not locate dealer", new CarDealersPage().verifyDealerName(dealerName).contains(dealerName));
    }
}
