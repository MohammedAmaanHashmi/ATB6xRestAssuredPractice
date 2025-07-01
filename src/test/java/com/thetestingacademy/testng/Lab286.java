package com.thetestingacademy.testng;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Lab286 {

    @Test
    public void testDemo1() {
        //Random user or Password

        Faker faker = new Faker();
        String username = faker.name().username();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        System.out.println(username);
        System.out.println(phoneNumber);



    }
}
