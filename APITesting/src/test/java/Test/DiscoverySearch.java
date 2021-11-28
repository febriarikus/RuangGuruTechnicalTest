package Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.DiscoverySearchStep;

public class DiscoverySearch {
    @Steps
    DiscoverySearchStep discoverySearchStep;

    @Given("User on Discovery Search Endpoint")
    public void given_user_on_discovery_search_endpoint(){}

    @When("User request to get data")
    public void when_user_request_to_get_data() {
        discoverySearchStep.readDiscoverySearch();
    }

    @Then("user success gathering data")
    public void thenUserSuccessGatheringData(){
        discoverySearchStep.SuccessGatheringData();
    }
}
