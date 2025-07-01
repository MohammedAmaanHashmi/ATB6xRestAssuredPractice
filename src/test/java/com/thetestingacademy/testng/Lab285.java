package com.thetestingacademy.testng;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab285 {
    //Data Driven Testing - TestNG
    //Mix the Data Driven with the Apache POI
    //Data Driven Testing - Running a single Test case with Multiple Inputs
    //Login Test - 100 U/P

    @DataProvider
    public Object[][] getData() {

        return new Object[][]{
                new Object[]{"admin", "admin"},
                new Object[]{"admin", "password"},
                new Object[]{"admin", "password123"},
        };
    }

    @DataProvider
    public Object[][] getDataFromExcel() {
        //ApachePOI CODE
        //Read a Excel File which contain the date and give to the getData Function


        return null;
    }


    @Test(dataProvider = "getData")
    public void testAuthToGetToke(String username, String password) {
        System.out.println(username);
        System.out.println(password);

        //Rest Assured Logic

        //Rest Given -> When -> then -> 200 Ok or Response

    }

}
