package com.blibli.future.testing.steps.serenity;

import com.blibli.future.testing.pages.QuotePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserQuoteSteps {

    QuotePage quotePage;

    @Step
    public void openPage(){
        quotePage.open();
    }

    @Step
    public void inputQuote(String quote){
        quotePage.inputQuote(quote);
    }

    @Step
    public void inputAuthor(String author){
        quotePage.inputAuthor(author);
    }

    @Step
    public void selectBackgroundColor(String color){
        quotePage.selectColor(color);
    }

    @Step
    public void clickAddQuote(){
        quotePage.clickAddQuote();
    }

    @Step
    public void seeQuote(String quote){
        List<String> result = quotePage.getTextQuotes();
        assertThat("Quote not found",result,hasItem(quote));
    }
}
