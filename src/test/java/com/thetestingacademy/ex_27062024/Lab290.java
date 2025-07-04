package com.thetestingacademy.ex_27062024;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab290 {
    //PayloadUsingMap
    //POST request - Payload String

//    {
//        "firstname" : "Jim",
//            "lastname" : "Brown",
//            "totalprice" : 111,
//            "depositpaid" : true,
//            "bookingdates" : {
//        "checkin" : "2018-01-01",
//                "checkout" : "2019-01-01"
//    },
//        "additionalneeds" : "Breakfast"
//    }

    RequestSpecification r = new RestAssured().given();
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void postRequest() {
        //   Map<String,Object> jsonBodyUsingMap =new HashMap<>();
        //"lastname" : "Brown", "firstname", : "Jim" - random Order
        Map<String, Object> jsonBodyUsingMap = new LinkedHashMap<>();
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        jsonBodyUsingMap.put("firstname", firstName);
        jsonBodyUsingMap.put("lastname", lastName);
        jsonBodyUsingMap.put("totalprice", faker.random().nextInt(1000));
        jsonBodyUsingMap.put("depositpaid", faker.random().nextBoolean());

        Map<String, Object> bookingDatesMap = new LinkedHashMap<>();
        bookingDatesMap.put("checkin", "2018-01-01");
        bookingDatesMap.put("checkout", "2019-01-01");

        jsonBodyUsingMap.put("bookingdates", bookingDatesMap);

        System.out.println(jsonBodyUsingMap);

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";

        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);

        r.contentType(ContentType.JSON).log().all().post();
        r.body(jsonBodyUsingMap);

        response = r.when().log().all().post();
        String responseString = response.asString();
        System.out.println(responseString);

        validatableResponse = response.then();
        validatableResponse.statusCode(200);


    }


}
