package com.blibli.future.testing.api.petstore;

import io.restassured.response.Response;
import lombok.Data;
import net.serenitybdd.core.pages.PageObject;

import static net.serenitybdd.rest.SerenityRest.given;

@Data
public class PetController extends PageObject {

    private Integer id;
    private String petName;
    private Response responseAddPet;

    public Response addPet(){
        String requestBody = "{\n" +
                "  \"id\":" + getId() + ",\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Kucing\"\n" +
                "  },\n" +
                "  \"name\":\""+ getPetName() + "\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"Cat\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        Response response = given()
                .log().all()
                .header("content-type", "application/json")
                .header("charset", "UTF-8")
                .body(requestBody)
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .assertThat().statusCode(200)
                .extract().response();

        response.getBody().prettyPrint();
        return response;
    }
}
