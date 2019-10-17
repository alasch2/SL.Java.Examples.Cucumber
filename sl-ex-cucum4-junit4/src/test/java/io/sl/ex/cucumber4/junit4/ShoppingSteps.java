package io.sl.ex.cucumber4.junit4;

import static org.junit.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.sl.ex.cucumber4.junit4.RpnCalculator;
import lombok.Data;


public class ShoppingSteps {
    private RpnCalculator calc = new RpnCalculator();

    @Given("the following groceries:")
    public void the_following_groceries(List<Grocery> groceries) {
        for (Grocery grocery : groceries) {
        	calc.add(grocery.price.value);
        }
    }

    @When("I pay {int}")
    public void i_pay(int amount) {
    	calc.subtract(amount);
    }

    @Then("my change should be {int}")
    public void my_change_should_be_(int change) {
    	assertChange(change);
    }

    @Given("a price is {string}")
    public void grocery_price_is(String price) {
    	calc.add(Integer.parseInt(price));
    }

    @When("I pay again {string}")
    public void i_pay_again(String payment) {
    	calc.subtract(Integer.parseInt(payment));
    }

    @Then("my other change should be {string}")
    public void my_other_change_should_be(String change) {
    	assertChange(Integer.parseInt(change));
    }
    
    private void assertChange(int change) {
        assertEquals(-calc.value().intValue(), change);
    }
    
    @Data
    static class Grocery {
        private String name;
        private Price price;
    }

    static final class Price {
        private int value;

        Price(int value) {
            this.value = value;
        }

        static Price fromString(String value) {
            return new Price(Integer.parseInt(value));
        }

    }
}
