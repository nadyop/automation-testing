package com.blibli.future.testing.steps;

import com.blibli.future.testing.api.petstore.PetController;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PetStoreSteps {
    PetController petController;

    @Given("^prepare add pet request data with id \"([^\"]*)\" and pet name \"([^\"]*)\"$")
    public void prepareAddPetRequestDataWithIdAndPetName(Integer id, String petName) throws Throwable {
        petController.setId(id);
        petController.setPetName(petName);
    }

    @When("^send add pet request$")
    public void sendAddPetRequest() throws Throwable {
        Response response = petController.addPet();
        petController.setResponseAddPet(response);
    }

    @Then("^add pet response data id should be \"([^\"]*)\"$")
    public void addPetResponseDataIdShouldBe(Integer id) throws Throwable {
        Response response = petController.getResponseAddPet();
        Integer resultId = response.path("id");
        assertThat("ID not same", resultId, equalTo(id));
    }

    @And("^add pet response data pet name should be \"([^\"]*)\"$")
    public void addPetResponseDataPetNameShouldBe(String petName) throws Throwable {
        Response response = petController.getResponseAddPet();
        String resultPetName = response.path("name");
        assertThat("Pet Name Not Same", resultPetName, equalTo(petName));
    }
}
