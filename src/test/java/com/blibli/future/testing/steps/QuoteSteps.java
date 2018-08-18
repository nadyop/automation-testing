package com.blibli.future.testing.steps;

import com.blibli.future.testing.steps.serenity.EndUserQuoteSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class QuoteSteps {

    @Steps
    EndUserQuoteSteps userQuoteSteps;

    @Given("^User open wonderfull quote page$")
    public void userOpenWonderfullQuotePage() throws Throwable {
        userQuoteSteps.openPage();
    }

    @When("^User input quote \"([^\"]*)\"$")
    public void userInputQuote(String quote) throws Throwable {
        userQuoteSteps.inputQuote(quote);
    }

    @And("^User type author '(.*)'$")
    public void userTypeAuthorMe(String author) throws Throwable {
        userQuoteSteps.inputAuthor(author);
    }

    @And("^User select color \"([^\"]*)\"$")
    public void userSelectColor(String color) throws Throwable {
        userQuoteSteps.selectBackgroundColor(color);
    }

    @And("^User click add quote button$")
    public void userClickAddQuoteButton() throws Throwable {
        userQuoteSteps.clickAddQuote();
    }

    @Then("^Quote will be added$")
    public void quoteWillBeAdded() throws Throwable {

    }

    @Then("^User should see quote \"([^\"]*)\"$")
    public void userShouldSeeQuote(String quote) throws Throwable {
        userQuoteSteps.seeQuote(quote);
    }
}
