package com.thetestingacademy.gson.serialization;

import com.google.gson.Gson;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Lab294 {

    RequestSpecification r = RestAssured
            .given();

    Response response;

    ValidatableResponse validatableResponse;


    @Description("TC#1 - Verify that create booking is working with valid payload")
    @Test
    public void testNonBDDStylePOSTPositive() {

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";

        Booking booking = new Booking();
        booking.setFirstname("James");
        booking.setLastname("Brown");
        booking.setTotalprice(-1);
        booking.setDepositpaid(true);

        BookingDates bookingDates=new BookingDates();
        bookingDates.setCheckin("2024-02-01");
        bookingDates.setCheckout("2024-02-05");
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Breakfast");
        System.out.println(booking);

        // Serialization ->Java - POJO Booking -> Object -> JSONString
        Gson gson= new Gson();
        String jsonStringPayload=gson.toJson(booking);
        System.out.println(jsonStringPayload);

//
//        r.baseUri(BASE_URL);
//        r.basePath(BASE_PATH);
//        r.contentType(ContentType.JSON).log().all();
//        r.body(booking);
//
//        response = r.when().log().all().post();
//        String responseString = response.asString();
//        System.out.println(responseString);
//
//
//        validatableResponse = response.then();
//        validatableResponse.statusCode(200);





    }


}
