package com.org.ita.kata;

import com.org.ita.DataProviderUserImplementation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigInteger;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FiveTest extends DataProviderUserImplementation {

    @DataProvider(name = "SolveSumDP")
    public Object[][] SolveSumData() {
        Object[][] parameters = new Object[][]{
                {5.000000000000e-01, 2.00},
                {6.096117967978e-01, 4.00},
                {6.417424305044e-01, 5.00},
        };
        return combine(implementationsFiveKataDataProvider(), parameters);
    }

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

    @Test(dataProvider = "SolveSumDP")
    public void testSolveSum(Five five, double expected, double data) {
        double m = 1e-12;
        System.out.println("Testing " + data);
        double actual = five.solveSum(data);
        System.out.println("Actual: " + actual);
        System.out.println("Expect: " + expected);
        boolean range = Math.abs(actual - expected) <= m;
        assertTrue(range);
    }

    @Test
    public void testSmallest() {
    }
}