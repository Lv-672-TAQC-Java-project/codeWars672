package com.org.ita.kata;

import com.org.ita.DataProviderUserImplementation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

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

    @Test
    public void testPerimeter() {
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

    @DataProvider(name = "smallestDP")
    public Object[][] smallestDP() {
        Object[][] parameters = new Object[][]{
                {261235, "[126235, 2, 0]"},
                {209917, "[29917, 1, 0]"},
                {285365, "[238565, 3, 1]"},
                {269045, "[26945, 3, 0]"},
                {296837, "[239687, 4, 1]"}
        };
        return combine(implementationsFiveKataDataProvider(), parameters);
    }

    @Test(dataProvider = "smallestDP")
    public void testSmallest(Five five, long n, String expected) {
        String actual = Arrays.toString(five.smallest(n));
        assertEquals(actual, expected);
    }
}