package org.mehrabi.testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/org/mehrabi/cucumber/features"},
//        tags ="@NightlyBuildTest or @RegularTest",
//        tags ="not @NightlyBuildTest",
//        tags ="@NightlyBuildTest and @RegularTest",
//        tags ="@ListOfStrings",
//        tags ="@ListOfListOfStrings",
        tags ="@ListOfMaps",
//        tags ="@ScenarioOutlineExample",
        glue = {"org.mehrabi.stepdefinitions"},
//        glue = {"org.mehrabi.stepdefinitions","org.mehrabi.hooks"},
        plugin = {"pretty",
        "html:target/SystemTestReports/html",
        "json:target/SystemTestReports/json/report.json",
        "junit:target/SystemTestReports/junit/report.xml"
        }
//        , dryRun = true
//        ,monochrome = true
        )
public class MenuManagementTest {

}
