package com.thetestingacademy.ex_27062024.payloadFile;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.File;

public class Lab298 {

    RequestSpecification r = new RestAssured().given();
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void testPostRequest() {
        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";

        File file =new File("src\\test\\resources\\postRequest.json");


        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);

        r.contentType(ContentType.JSON).log().all();
        r.body(file);

        response = r.when().log().all().post();

        String responseString = response.asString();
        System.out.println(responseString);

        validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }

}
