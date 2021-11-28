package Test;

import Step.SearchStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Search {
    @Steps
    SearchStep searchStep;

    @Given("User already on skillacademy webpage")
    public void given_user_already_on_skillacademy_webpage() throws InterruptedException{
        searchStep.AlreadyOnSkillAcademyWebPage();
    }

    @When("User input keyword like \"([^\"]*)\"")
    public void when_user_input_keyword(String keyword) {
        searchStep.InputKeyword(keyword);
    }

    @When("User click search button")
    public void when_user_click_search_button(){
        searchStep.ClickSearchButton();
    }

// ---------------------------  expectation scenario Search using correct keyword --------------------------------------
    @Then("User gets the result of keyword entered : \"([^\"]*)\"")
    public void then_user_gets_the_result_of_keyword_entered(String keyword)throws InterruptedException {
        searchStep.GetsTheResultOfKeywordEntered(keyword);
    }

// ---------------------------  expectation scenario Search using not found keyword ------------------------------------
    @Then("User gets no result found page")
    public void then_user_gets_no_result_found_page()throws InterruptedException{
        searchStep.GetsNoResultFoundPage();
    }

}