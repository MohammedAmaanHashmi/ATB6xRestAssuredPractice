package com.thetestingacademy.testng;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab261 {

    // 1000 - Group these testcases
    // smoke, Sanity
    //Before, After we can do something


    @Test
    public void getRequest() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(201);
    }

    @Test
    public void getRequest2() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(201);
    }

}
