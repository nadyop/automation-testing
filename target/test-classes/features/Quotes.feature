@QuoteFeature
Feature: Quote feature

  @Positive
  Scenario: Add quote
    Given User open wonderfull quote page
    When User input quote "There are always way"
    And User type author 'me'
    And User select color "yellow"
    And User click add quote button
    Then User should see quote "There are always way"