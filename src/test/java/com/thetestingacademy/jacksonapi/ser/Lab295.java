package com.thetestingacademy.jacksonapi.ser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thetestingacademy.gson.serialization.Booking;
import com.thetestingacademy.gson.serialization.BookingDates;
import org.testng.annotations.Test;

public class Lab295 {

    @Test
    public void seraJackson() throws JsonProcessingException {

        Booking booking = new Booking();
        booking.setFirstname("James");
        booking.setLastname("Brown");
        booking.setTotalprice(-1);
        booking.setDepositpaid(true);

        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2024-02-01");
        bookingDates.setCheckout("2024-02-05");
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Breakfast");
        System.out.println(booking);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
        System.out.println(jsonString);
    }

}
