package com.blibli.future.testing;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features", tags = "@QuoteFeature and @Positive")
public class DefinitionTestSuite {}
