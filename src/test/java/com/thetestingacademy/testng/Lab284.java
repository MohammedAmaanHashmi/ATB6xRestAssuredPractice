package com.thetestingacademy.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab284 {


    @Parameters("browser")
    @Test(priority = 1)
    public void testDemo1(String value) {
        System.out.println("Browser is " + value);
        //Open the Browser and select
        switch (value) {
            case "firefox":
                System.out.println("Firefox starting and Running TC");
                break;

            case "chrome":
                System.out.println("Chrome starting and Running TC");
                break;

            default:
                System.out.println("No idea What To Start");
        }
    }
}
