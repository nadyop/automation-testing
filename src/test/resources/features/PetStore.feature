@PetStoreFeature
Feature: Pet Store
  @Positive
  Scenario: verify add pet
  Given prepare add pet request data with id "123" and pet name "Ucing"
  When send add pet request
  Then add pet response data id should be "123"
  And add pet response data pet name should be "Ucing"
