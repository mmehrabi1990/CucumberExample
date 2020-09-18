package org.mehrabi.testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/org/mehrabi/cucumber/features"},
        tags ="@NightlyBuildTest or @RegularTest",
        glue = {"stepdefinitions"},
        plugin = {"pretty"}
        )
public class MenuManagementTest {

}
