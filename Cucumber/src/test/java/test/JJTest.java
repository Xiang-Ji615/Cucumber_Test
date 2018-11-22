package test.java.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JJTest {

	@Given("I have {int} cukes in my belly")
	public void i_have_cukes_in_my_belly(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Hello world");
	}

	@When("I wait {int} hour")
	public void i_wait_hour(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Hello world");
	}

	@Then("my belly should growl")
	public void my_belly_should_growl() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Hello world");
	}




}
