package com.org.ita.kata;

import com.org.ita.DataProviderUserImplementation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigInteger;
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


    @DataProvider(name = "NewGapDP12")
    public Object[][] TestGap() {
        // long[] a1 = new long[] {101, 103};
        //long[] a2 = new long[] {103, 107};
        //long[] a3 = new long[] {359, 367};
        //long[] a4 = new long[] {337, 347};
        Object[][] parameters = new Object[][]{
                {2, 100, 110, new long[]{101, 103}},
                {4, 100, 110, new long[]{103, 107}},
                {8, 300, 400, new long[]{359, 367}},
                {10, 300, 400, new long[]{337, 347}},
                {6, 100, 110, null},
        };
        // return combine(implementationsFiveKataDataProvider(), parameters);
        return combine(implementationsFiveKataDataProvider(), parameters);
    }

    @Test(dataProvider = "NewGapDP12")
    public void testGapTest2(Five five, int data1, long data2, long data3, long[] expected) {
        long[] actual = five.gap(data1, data2, data3);
        assertEquals(actual, expected);
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