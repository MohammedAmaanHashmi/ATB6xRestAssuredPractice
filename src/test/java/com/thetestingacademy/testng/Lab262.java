package com.thetestingacademy.testng;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Lab262 {



    @Description("TC#1  - verify GET Request 1")
    @Test(enabled = false)
    public void getRequest() {
        System.out.println("TC");
    }

    @Description("TC#2  - verify GET Request 2")
    @Test
    public void getRequest2() {
        System.out.println("TC2");
    }

    @Description("TC#3  - verify GET Request 3")
    @Test
    public void getRequest3() {
        System.out.println("TC3");
    }
}
