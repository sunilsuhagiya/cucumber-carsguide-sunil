$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("buy.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9653824300,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Find the dealers and verify the dealers are in list",
  "description": "",
  "id": "search-functionality;find-the-dealers-and-verify-the-dealers-are-in-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "I mouse hover on buy+sell tab",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "I click Find a Dealer",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I navigate to \"car-dealers\" dealer page",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "I should see the dealer names \"\u003cdealersName\u003e\" are display on page",
  "rows": [
    {
      "cells": [
        "dealersName"
      ],
      "line": 52
    },
    {
      "cells": [
        "3 Point Motors Epping"
      ],
      "line": 53
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "BuyCarSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 578448600,
  "status": "passed"
});
formatter.match({
  "location": "BuyCarSteps.iMouseHoverOnBuySellTab()"
});
formatter.result({
  "duration": 2299730600,
  "status": "passed"
});
formatter.match({
  "location": "BuyCarSteps.iClickFindADealer()"
});
formatter.result({
  "duration": 1542681200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "car-dealers",
      "offset": 15
    }
  ],
  "location": "BuyCarSteps.iNavigateToDealerPage(String)"
});
formatter.result({
  "duration": 230882800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cdealersName\u003e",
      "offset": 31
    }
  ],
  "location": "BuyCarSteps.iShouldSeeTheDealerNamesAreDisplayOnPage(String)"
});
formatter.result({
  "duration": 835200,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.carsguide.cucumber.steps.BuyCarSteps.iShouldSeeTheDealerNamesAreDisplayOnPage(String) in file:/C:/Users/sunil/IdeaProjects/cucumber-carsguide-sunil/target/test-classes/\u0027 with pattern [^I should see the dealer names \"([^\"]*)\" are display on page$] is declared with 1 parameters. However, the gherkin step has 2 arguments [\u003cdealersName\u003e, Table:[[dealersName], [3 Point Motors Epping]]]. \nStep: And I should see the dealer names \"\u003cdealersName\u003e\" are display on page\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1007441500,
  "status": "passed"
});
});