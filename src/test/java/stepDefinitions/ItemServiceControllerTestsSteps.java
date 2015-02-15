package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import cucumber.api.java.After;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import stackoverflowquestion.ItemServiceController;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration("classpath:stackoverflowquestion.xml")
public class ItemServiceControllerTestsSteps {

    //Common variables across steps - currently only local.
    //private VerticalItem itemToCreate;
    //private ServiceResponse response;

    //Step specific variables.
    @Autowired
    private ItemServiceController itemService;

    public ItemServiceControllerTestsSteps(){
    }    

    public ItemServiceControllerTestsSteps(ItemServiceController service){
	itemService = service;
    }    

    @Before()
    public void setup(){/*Do something*/}

    @After()
    public void tearDown(){/*Do Something*/}

    @Given("^I prepare a \"(.*)\" item for the \"(.*)\" dealer$")
    public boolean I_prepare_a_X_item_for_the_X_dealer(String itemType, String dealerType){ //Step function and factory in one.
	return true;
    }

    @When("^I perform the \"(.*)\" inventory service call$")
    public void I_perform_the_X_inventory_service_call(String actionType){
	/*Do Stuff*/}

    @Then("^I should get the \"(.*)\" response code$")
    public void I_should_get_the_X_response_code(String codeType){/*Do stuff*/}

    @Then("^the inventory service response result should be a \"(.*)\" object$")
    public void the_inventory_service_response_result_should_be_a_X_object(String expectedClassType){
	assertNotNull(itemService);
    }

}
