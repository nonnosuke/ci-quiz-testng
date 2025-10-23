package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void verifyMath() {
        int result = 3 + 1;
        Assert.assertEquals(result, 4, "Math check");
    }
}
