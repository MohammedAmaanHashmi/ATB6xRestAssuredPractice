package com.thetestingacademy.testng;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab265 {

    @Description("TC#1")
    @Test
    public void testcase() {

        // Assertions ->  Expect Result = Actual Result
        //200 == 200
        //Two Types Assertions
        //Soft Assertions

//        SoftAssert s = new SoftAssert();
//        s.assertEquals("pramod", "Pramod", "Not Equal");
//        System.out.println("End of the Program");
//        s.assertAll();

        //Hard Assertion
        Assert.assertEquals("Pramod", "pramod");
        System.out.println("End of the Program");

    }


}
