package skeleton;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

public class Stepdefs2 {
    
    @Autowired
    Stepdefs stepdefs;

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Throwable {
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
	Belly belly = stepdefs.belly;
	assertTrue(belly.hasGrowl());
    }
}
