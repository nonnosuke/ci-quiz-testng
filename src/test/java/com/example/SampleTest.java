package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void verifyMath() {
        int result = 0 + 4;
        Assert.assertEquals(result, 4, "Math check");
    }
}
