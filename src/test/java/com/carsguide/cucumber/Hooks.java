package com.carsguide.cucumber;

import com.carsguide.propertyreader.PropertyReader;
import com.carsguide.utility.Utility;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


public class Hooks extends Utility {
    // Make sure @Before is selected for cucumber.api.java
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    // Make sure @After is selected for cucumber.api.java
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
