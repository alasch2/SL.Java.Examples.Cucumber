package io.sl.ex.cucumber3.junit4;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.sl.ex.cucumber3.junit4.RpnCalculator;
import io.sl.ex.cucumber3.junit4.GroceryTable.Grocery;

public class ShoppingSteps {
    private RpnCalculator calc = new RpnCalculator();

    @Given("the following groceries:")
    public void the_following_groceries(List<Grocery> groceries) {
        for (Grocery grocery : groceries) {
        	calc.add(grocery.getPrice());
        }
    }

    @When("I pay {int}")
    public void i_pay(Integer amount) {
    	calc.subtract(amount);
    }

    @Then("my change should be {int}")
    public void my_change_should_be_(Integer change) {
    	assertChange(change);
    }

    @Given("grocery price is {string}")
    public void grocery_price_is(String price) {
    	calc.add(Integer.parseInt(price));
    }

    @When("I pay {string}")
    public void i_pay(String payment) {
    	calc.subtract(Integer.parseInt(payment));
    }

    @Then("my change should be {string}")
    public void my_change_should_be(String change) {
    	assertChange(Integer.parseInt(change));
    }
    
    private void assertChange(int change) {
        assertEquals(-calc.value().intValue(), change);
    }

}
