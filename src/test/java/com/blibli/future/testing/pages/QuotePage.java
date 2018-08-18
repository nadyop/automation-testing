package com.blibli.future.testing.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("http://gosoft.web.id/wonderfulQuote/")
public class QuotePage extends PageObject {
    @FindBy(xpath = "//textarea[@placeholder='input quotes here']")
    private WebElementFacade inputQuote;

    @FindBy(xpath = "//input[@placeholder=\"input author's name here\"]")
    private WebElementFacade inputAuthor;

    @FindBy(xpath = "//select[@class='form-control']")
    private WebElementFacade selectColor;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElementFacade buttonAddQuote;

    @FindBy(xpath = "//q")
    private List<WebElementFacade> textQuotes;

    public List<String> getTextQuotes(){
        return  textQuotes.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
//        List<String> quotes = new ArrayList<>();
//        for (WebElementFacade quote:textQuotes){
//            quotes.add(quote.getText());
//        }
//        return  quotes;
    }

    public void inputQuote(String quote){
        inputQuote.type(quote);
    }

    public void inputAuthor(String author){
        inputAuthor.type(author);
    }

    public void selectColor(String color){
        selectColor.selectByVisibleText(color);
    }

    public void clickAddQuote(){
        buttonAddQuote.click();
    }
}
