package com.org.ita.kata;

import com.org.ita.DataProviderUserImplementation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigInteger;

import static org.testng.Assert.assertEquals;

public class FiveTest extends DataProviderUserImplementation {

    @Test
    public void testArtificialRain() {
    }

    @Test
    public void testGap() {
    }

    @Test
    public void testZeros() {
    }

    @DataProvider(name = "PerimeterDP")
    public Object[][] perimeterTestData() {
        Object[][] parameters = new Object[][]{
                {80, 5},
                {216, 7},
                {14098308, 30},
        };

        return combine(implementationsFiveKataDataProvider(), parameters);
    }

    @Test(dataProvider = "PerimeterDP")
    public void testPerimeter(Five five, int expected, int n) {
        BigInteger actual = five.perimeter(BigInteger.valueOf(n));
        assertEquals(actual, BigInteger.valueOf(expected));
    }

    @Test
    public void testSolveSum() {
    }

    @Test
    public void testSmallest() {
    }
}