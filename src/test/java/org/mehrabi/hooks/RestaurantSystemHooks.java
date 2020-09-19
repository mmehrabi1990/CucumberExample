package org.mehrabi.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RestaurantSystemHooks {

    @Before("@SmokeTest")
    public void beforeDisplayMessage(Scenario scenario) {
        System.out.println("Before "+scenario.getName());
    }

    @After("@SmokeTest")
    public void afterDisplayMessage(Scenario scenario) {
        System.out.println("After "+scenario.getName());
    }
}
