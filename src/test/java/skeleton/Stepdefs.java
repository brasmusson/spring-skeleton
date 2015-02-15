package skeleton;

import cucumber.api.java.en.Given;

import org.springframework.beans.factory.annotation.Autowired;

public class Stepdefs {
    
    @Autowired
    Belly belly;

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly.eat(cukes);
    }
}
