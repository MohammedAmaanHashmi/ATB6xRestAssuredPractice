package com.thetestingacademy.testng;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab280 {
    //Grouping of Test Cases
    //100 -> 20, 30 - P1, 50 -P3
    //40 - Smoke, 60 Santiy Testcase.

    @Issue("AUTH-123")
    @AllureId("TC#1")
    @Severity(SeverityLevel.NORMAL)
    @Description("Sanity Testcase")
    @Test(groups = {"sanity"}, priority = 1)
    public void sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
    }

    @Test(groups = {"sanity"}, priority = 2)
    public void regRun() {
        System.out.println("Reg");

    }

    @Test(groups = {"Smoke"}, priority = 3)
    public void smokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }

    @Test(groups = {"qa", "prod"}, priority = 4)
    public void QARun() {
        System.out.println("qa");
        Assert.assertTrue(false);
    }

    @Test(groups = {"prod"}, priority = 5)
    public void ProdRun() {
        System.out.println("qa");
        Assert.assertTrue(false);
    }

}
