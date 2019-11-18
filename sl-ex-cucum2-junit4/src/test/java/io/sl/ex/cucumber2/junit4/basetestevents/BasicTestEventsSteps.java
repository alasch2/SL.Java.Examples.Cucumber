package io.sl.ex.cucumber2.junit4.basetestevents;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BasicTestEventsSteps {
	@Given("^no input - a test that should pass$")
	public void no_input_a_test_that_should_pass() {
	}

	@When("^try run the passing test$")
	public void try_run_the_passing_test() {
	}

	@Then("^it should pass$")
	public void it_should_pass() {
		assertTrue(true);
	}

	@Given("^no input - a test example that should pass$")
	public void no_input_a_test_example_that_should_pass() {
	}

	@When("^try run the example$")
	public void try_run_the_example() {
	}

	@Then("^it also should pass$")
	public void it_also_should_pass() {
	}
	
	@Given("^no input - a test that should fail$")
	public void no_input_a_test_that_should_fail() {
	}

	@When("^try run the failing test$")
	public void try_run_the_failing_test() {
	}

	@Then("^it should fail$")
	public void it_should_fail() {
		fail();
	}

	@Given("^no input - a test that should be skipped by TIA$")
	public void no_input_a_test_that_should_be_skipped_by_TIA() {
	}
	
	@When("^try run the test that should pass$")
	public void try_run_the_test_that_should_pass() {
	}
	
	@Then("^it should be skipped by TIA$")
	public void it_should_be_skipped_by_TIA() {
	}
	
	@Given("^no input - a test that should be skipped$")
	public void no_input_a_test_that_should_be_skipped() {
	}

	@When("^try run the skipped test$")
	public void try_run_the_skipped_test() {
	}

	@Then("^it should be skipped$")
	public void it_should_be_skipped() {
	}
	
}
