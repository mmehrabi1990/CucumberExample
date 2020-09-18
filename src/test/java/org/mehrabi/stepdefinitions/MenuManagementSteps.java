package org.mehrabi.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mehrabi.RestaurantMenu;
import org.mehrabi.RestaurantMenuItem;

import static org.junit.Assert.assertEquals;


public class MenuManagementSteps {
    RestaurantMenuItem newMenuItem;
    RestaurantMenu locationMenu = new RestaurantMenu();
    String errorMessage;

    public MenuManagementSteps() {
        System.out.println("Constructor Called");
        System.out.println("Constructor Called");
    }

    @Given("^I have a menu item with name \"([^\"]+)\" and price ([$]*)(\\d+)$")
    public void stepOne(String menuItemName, String currencyType, Integer price) {

        newMenuItem = new RestaurantMenuItem(menuItemName, menuItemName, price);
        System.out.println("Step 1");
    }

    @When("I add that menu item")
    public void stepTwo() {
        try {
            locationMenu.addMenuItem(newMenuItem);
        }catch (IllegalArgumentException e){
            errorMessage = e.getMessage();
        }
        System.out.println("Step 2");
    }

    @Then("Menu Item with name {string} should be added")
    public void stepThree(String string) {
        boolean exists = locationMenu.doesItemExist(newMenuItem);
        System.out.println("Step 3: " + exists);
    }

    @Then("I should se an error message with value {string}")
    public void duplicateError(String string) {
        assertEquals("Duplicate Item",errorMessage);
    }
}
