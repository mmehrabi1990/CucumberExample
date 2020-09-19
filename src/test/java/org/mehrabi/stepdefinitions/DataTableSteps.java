package org.mehrabi.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @Given("I placed an order for the following items")
    public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {

//        List<String> billData = dataTable.asList();
//        for (String bill : billData){
//            System.out.println(bill);
//        }
//        List<List<String>> billData = dataTable.asLists();
//        for (List<String> bill : billData){
//            for (String s : bill) {
//                System.out.println(bill);
//            }
//        }

        List<Map<String, String>> billData = dataTable.asMaps();
        for (Map<String, String> billDatum : billData) {
            for (Map.Entry<String, String> value : billDatum.entrySet()) {
                System.out.println("key: "+value.getKey());
                System.out.println("value: "+value.getValue());
            }
        }
    }


    @When("I generate the bill")
    public void i_generate_the_bill() {

    }
    @Then("a bill for ${int} should be generated")
    public void a_bill_for_$_should_be_generated(Integer int1) {

    }
}
